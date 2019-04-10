package com.example.ludo.models;

public class Action {
    // generated id
    private long id;

    // niet null
    private ActionType actionType;

    public Action(ActionType actionType) {
        this.actionType = actionType;
    }
}
