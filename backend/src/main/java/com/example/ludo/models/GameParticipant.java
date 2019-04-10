package com.example.ludo.models;

public class GameParticipant {

    //generated id
    private long id;

    // uniek
    private String userName;

    private GameParticipantTableSeat tableSeat;

    public GameParticipant(String userName, GameParticipantTableSeat tableSeat) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
