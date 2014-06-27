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
public class Leesboek extends Boek implements Voorwerp {

    private String onderwerp;

    public Leesboek() {
        super();
        setOnderwerp("geen onderwerp");
    }

    public Leesboek(String titel, String auteur, double aankoopprijs, String genre, String onderwerp) {
        super(titel, auteur, aankoopprijs, genre);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + onderwerp;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopprijs() * 1.5;
    }
}
