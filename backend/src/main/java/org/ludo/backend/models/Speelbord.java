package org.ludo.backend.models;

public class Speelbord {
    private static final int LENGTE_RONDGANG = 64;
    private static final int INDEX_BEGINVAK_NOORD = 0; // 16 stappen vanaf West!
    private static final int INDEX_BEGINVAK_OOST = 16; // 16 stappen vanaf Noord
    private static final int INDEX_BEGINVAK_ZUID = 32; // 16 stappen vanaf Oost
    private static final int INDEX_BEGINVAK_WEST = 48; // 16 stappen vanaf Zuid
    private static final int AANTAL_PIONNEN = 4;

    private final Vak[] rondgang;
    private final Vak[] huisvakkenNoord;
    private final Vak[] huisvakkenOost;
    private final Vak[] huisvakkenZuid;
    private final Vak[] huisvakkenWest;

    private final Pion[] pionnenNoord;
    private final Pion[] pionnenOost;
    private final Pion[] pionnenZuid;
    private final Pion[] pionnenWest;

    public Speelbord() {
        this.rondgang = nieuweRondgang();
        this.huisvakkenNoord = nieuweHuisvakken();
        this.huisvakkenOost = nieuweHuisvakken();
        this.huisvakkenZuid = nieuweHuisvakken();
        this.huisvakkenWest = nieuweHuisvakken();
        this.pionnenNoord = nieuwePionnen();
        this.pionnenOost = nieuwePionnen();
        this.pionnenZuid = nieuwePionnen();
        this.pionnenWest = nieuwePionnen();
    }

    private Pion[] nieuwePionnen() {
        Pion[] pionnen = new Pion[AANTAL_PIONNEN];
        for (int i = 0; i < 4; i++) {
            pionnen[i] = new Pion();
        }
        return pionnen;
    }

    private Vak[] nieuweHuisvakken() {
        Vak[] huisvakken = new Vak[AANTAL_PIONNEN];
        for (int i = 0; i < 4; i++) {
            huisvakken[i] = new Vak();
        }
        return huisvakken;
    }

    private Vak[] nieuweRondgang() {
        Vak[] vakken = new Vak[LENGTE_RONDGANG];

        for (int i = 0; i < LENGTE_RONDGANG; i++) {
            vakken[i] = new Vak();
        }
        return vakken;
    }
}
