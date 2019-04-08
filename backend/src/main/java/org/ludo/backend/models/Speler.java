package org.ludo.backend.models;

public class Speler {

    //generated id
    private long id;

    // uniek
    private String gebruikersNaam;

    private SpelerEnum spelerEnum;

    public Speler(String gebruikersNaam, SpelerEnum spelerEnum) {
        this.gebruikersNaam = gebruikersNaam;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }
}
