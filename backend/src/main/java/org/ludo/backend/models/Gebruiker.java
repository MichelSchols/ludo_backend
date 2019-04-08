package org.ludo.backend.models;

public class Gebruiker {
    //generated id
    private long id;

    //unique
    private String naam;

    public Gebruiker(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
}
