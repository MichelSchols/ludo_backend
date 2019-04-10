package com.example.ludo.controller;


import com.example.ludo.models.User;
import com.example.ludo.models.GameParticipant;
import com.example.ludo.models.Game;
import com.example.ludo.models.GameParticipantTableSeat;

public class SpelController {
    public Game nieuwSpel(User[] deelnemers) {
        return new Game(gebruikersNaarSpelers(deelnemers));
    }

    private GameParticipant[] gebruikersNaarSpelers(User[] deelnemers) {
        if (deelnemers.length != 4) throw new IllegalArgumentException("Aantal spelers moet gelijk zijn aan 4");
        GameParticipant[] gameParticipants = new GameParticipant[4];
        gameParticipants[0] = new GameParticipant(deelnemers[0].getName(), GameParticipantTableSeat.SEAT_NORTH);
        gameParticipants[1] = new GameParticipant(deelnemers[1].getName(), GameParticipantTableSeat.SEAT_EAST);
        gameParticipants[2] = new GameParticipant(deelnemers[2].getName(), GameParticipantTableSeat.SEAT_SOUTH);
        gameParticipants[3] = new GameParticipant(deelnemers[3].getName(), GameParticipantTableSeat.SEAT_WEST);

        return gameParticipants;
    }
}
