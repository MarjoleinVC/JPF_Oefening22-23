package be.vdab.voorwerpen;


import be.vdab.util.Voorwerp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Woordenboek extends Boek implements Voorwerp {

    private String taal;

    public Woordenboek() {
        super();
        setTaal("geen taal");
    }

    public Woordenboek(String titel, String auteur, double aankoopprijs, String genre, String taal) {
        super(titel, auteur, aankoopprijs, genre);
        setTaal(taal);
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + taal;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopprijs() * 1.75;
    }
}
