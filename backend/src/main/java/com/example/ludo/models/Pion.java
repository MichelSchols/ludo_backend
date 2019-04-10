package com.example.ludo.models;

public class Pion {
    // generated id
    private long id;

    // many-to-one (exact 4-tot-1)
    // immutable
    private Speler eigenaar;

    // one-to-one
    // parent: pion
    // null: niet op het bord
    // thuisvak: niet specifiek herkenbaar door pion (niet nodig)
    private Vak vak;
}
