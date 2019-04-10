package com.example.ludo.models;

import java.util.HashMap;
import java.util.Map;

public enum SpelerEnum {
    SPELER_NOORD(0),
    SPELER_OOST(1),
    SPELER_ZUID(2),
    SPELER_WEST(3);

    private final int waarde;
    private Map map = new HashMap<>();

    //note: java enum constructors are by definition private
    SpelerEnum(int waarde) {
        this.waarde = waarde;
    }
}
