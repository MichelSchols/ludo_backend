package com.example.ludo.models;

import java.util.HashMap;
import java.util.Map;

public enum GameParticipantTableSeat {
    SEAT_NORTH(0),
    SEAT_EAST(1),
    SEAT_SOUTH(2),
    SEAT_WEST(3);

    private final int value;
    private Map map = new HashMap<>();

    //note: java enum constructors are, by definition, private
    GameParticipantTableSeat(int value) {
        this.value = value;
    }
}
