package com.example.ludo.models;

public class GameBoard {
    private static final int TRACK_LENGTH = 64;
    private static final int INDEX_START_SPACE_NORTH = 0; // 16 stappen vanaf West!
    private static final int INDEX_START_SPACE_EAST = 16; // 16 stappen vanaf Noord
    private static final int INDEX_START_SPACE_SOUTH = 32; // 16 stappen vanaf Oost
    private static final int INDEX_START_SPACE_WEST = 48; // 16 stappen vanaf Zuid
    private static final int GAME_TOKENS_PER_PLAYER = 4;

    private final Space[] track;
    private final Space[] homeSpacesNorth;
    private final Space[] homeSpacesEast;
    private final Space[] homeSpacesSouth;
    private final Space[] homeSpacesWest;

    private final GameToken[] tokensNorth;
    private final GameToken[] tokensEast;
    private final GameToken[] tokensSouth;
    private final GameToken[] tokensWest;

    public GameBoard() {
        this.track = newTrack();
        this.homeSpacesNorth = newHomeSpaces();
        this.homeSpacesEast = newHomeSpaces();
        this.homeSpacesSouth = newHomeSpaces();
        this.homeSpacesWest = newHomeSpaces();
        this.tokensNorth = newTokens();
        this.tokensEast = newTokens();
        this.tokensSouth = newTokens();
        this.tokensWest = newTokens();
    }

    private GameToken[] newTokens() {
        GameToken[] pionnen = new GameToken[GAME_TOKENS_PER_PLAYER];
        for (int i = 0; i < 4; i++) {
            pionnen[i] = new GameToken();
        }
        return pionnen;
    }

    private Space[] newHomeSpaces() {
        Space[] huisvakken = new Space[GAME_TOKENS_PER_PLAYER];
        for (int i = 0; i < 4; i++) {
            huisvakken[i] = new Space();
        }
        return huisvakken;
    }

    private Space[] newTrack() {
        Space[] vakken = new Space[TRACK_LENGTH];

        for (int i = 0; i < TRACK_LENGTH; i++) {
            vakken[i] = new Space();
        }
        return vakken;
    }
}
