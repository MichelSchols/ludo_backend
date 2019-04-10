package com.example.ludo.controller;


import com.example.ludo.models.Gebruiker;
import com.example.ludo.models.Spel;
import com.example.ludo.models.Speler;
import com.example.ludo.models.SpelerEnum;

public class SpelController {
    public Spel nieuwSpel(Gebruiker[] deelnemers) {
        return new Spel(gebruikersNaarSpelers(deelnemers));
    }

    private Speler[] gebruikersNaarSpelers(Gebruiker[] deelnemers) {
        if (deelnemers.length != 4) throw new IllegalArgumentException("Aantal spelers moet gelijk zijn aan 4");
        Speler[] spelers = new Speler[4];
        spelers[0] = new Speler(deelnemers[0].getNaam(), SpelerEnum.SPELER_NOORD);
        spelers[1] = new Speler(deelnemers[1].getNaam(), SpelerEnum.SPELER_OOST);
        spelers[2] = new Speler(deelnemers[2].getNaam(), SpelerEnum.SPELER_ZUID);
        spelers[3] = new Speler(deelnemers[3].getNaam(), SpelerEnum.SPELER_WEST);

        return spelers;
    }
}
