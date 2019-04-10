package com.example.ludo.models;

public class Game {
    private GameParticipant[] gameParticipants;
    private GameBoard gameBoard;
    private Turn currentTurn;

    public Game(GameParticipant[] gameParticipants) {
        this.gameParticipants = gameParticipants;
    }
}
