package org.ludo.backend.models;

public class Spel {
    private Speler[] spelers;
    private Speelbord speelbord;
    private Beurt huidigeBeurt;

    public Spel(Speler[] spelers) {
        this.spelers = spelers;
    }
}
