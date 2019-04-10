package com.example.ludo.models;

public class Beurt {
    // generated id
    private long id;

    // niet null
    private Speler speler;

    // niet null, mag wel leeg zijn
    private Actie[] acties;

    public Beurt(Speler speler) {
        this.speler = speler;
    }
}
