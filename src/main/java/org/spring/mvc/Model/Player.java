package org.spring.mvc.Model;


import org.springframework.stereotype.Component;


@Component
public class Player {
    private int id;
    private String Name;
    private String nationality;
    private int age;


    public Player() {
    }

    public Player(int id, String name, String nationality, int age) {
        this.id = id;
        Name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }
}
