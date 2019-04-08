package org.ludo.backend.models;

public class Actie {
    // generated id
    private long id;

    // niet null
    private ActieType actieType;

    public Actie(ActieType actieType) {
        this.actieType = actieType;
    }
}
