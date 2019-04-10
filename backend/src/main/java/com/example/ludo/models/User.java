package com.example.ludo.models;

public class User {
    //generated id
    private long id;

    //unique
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
