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
public class Boekenrek implements Voorwerp {

    private float hoogte;
    private float breedte;
    private double aankoopprijs;

    public Boekenrek() {
        setHoogte(0.0F);
        setBreedte(0.0F);
        setAankoopprijs(0.0);
    }

    public Boekenrek(float hoogte, float breedte, double aankoopprijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopprijs(aankoopprijs);
    }

    public float getHoogte() {
        return this.hoogte;
    }

    public void setHoogte(float hoogte) {
        this.hoogte = hoogte;
    }

    public float getBreedte() {
        return this.breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }

    public double getAankoopprijs() {
        return this.aankoopprijs;
    }

    public void setAankoopprijs(double aankoopprijs) {
        this.aankoopprijs = aankoopprijs;
    }

    @Override
    public void gegevensTonen() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString()
    {
        return hoogte + "; " + breedte + "; " + aankoopprijs;
    }

    @Override
    public double winstBerekenen() {
        return this.getAankoopprijs() * 2.0;
    }
}
