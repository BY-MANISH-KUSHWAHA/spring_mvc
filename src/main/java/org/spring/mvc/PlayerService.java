package org.spring.mvc;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class PlayerService {
    private List<Player> players = Arrays.asList(
            new Player(1,"Manish","Indian",22),
            new Player(0,"manish","Indian",22),
            new Player(2,"Arjun","Asian",24),
            new Player(3,"Sharma","Korean",26),
            new Player(4,"Vishal","American",28)
    );

    public Player getPlayerByName(String name){
        Optional<Player> player = players.stream().filter(p -> p.getName().equals(name)).findFirst();
        // Case-sensitive
        if(player.isPresent())
            return player.get();
        return new Player(-1,"No Name","No Nationality",-1); // isNotPresent
    }
}
