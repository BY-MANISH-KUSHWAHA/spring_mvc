package org.spring.mvc;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Arrays;

@Component
public class Athlete {
    @NotNull(message = "This is a required field.") // Size limit
    //@Size(min = 1, message = "This is a required field must be greater than 1.") // fail for white space pattern = "   "
    //@NotEmpty(message = "This is a required Field.{@NotEmpty}")
    private String name;
    private String country;

    @NotNull(message = "This is a required field.") // Size limit
    private String rank; // A , B , C , D

    private String[] tournaments;

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Athlete() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rank='" + rank + '\'' +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }
}
