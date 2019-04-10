package com.example.ludo.models;

public class Turn {
    // generated id
    private long id;

    // not null
    private GameParticipant gameParticipant;

    // not null, but can be empty
    private Action[] actions;

    public Turn(GameParticipant gameParticipant) {
        this.gameParticipant = gameParticipant;
    }
}
