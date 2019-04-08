package org.ludo.backend.models;

import java.util.HashMap;
import java.util.Map;

public enum SpelerEnum {
    SPELER_NOORD(0),
    SPELER_OOST(1),
    SPELER_ZUID(2),
    SPELER_WEST(3);

    private final int waarde;
    private Map map = new HashMap<>();

    private SpelerEnum(int waarde) {
        this.waarde = waarde;
    }
}
