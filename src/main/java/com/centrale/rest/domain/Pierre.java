package com.centrale.rest.domain;

public class Pierre implements Player{
    public int playWith(Pierre p){
        return 0;
    }
    public int playWith(Feuille f){
        return -1;
    }
    public int playWith(Ciseaux c){
        return 1;
    }
    public int playWith(Player p){
        return p.playWith(this);
    }
}
