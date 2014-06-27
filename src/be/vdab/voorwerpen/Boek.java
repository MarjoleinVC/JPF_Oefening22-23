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
public abstract class Boek implements Voorwerp {

    private String titel;
    private String auteur;
    private static String eigenaar = "VDAB";
    private double aankoopprijs;
    private String genre;

    public Boek() {
        setTitel("geen titel");
        setAuteur("geen auteur");
        setAankoopprijs(0.0);
        setGenre("geen genre");
    }

    public Boek(String titel, String auteur, double aankoopprijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEigenaar() {
        return this.eigenaar;
    }

    public double getAankoopprijs() {
        return this.aankoopprijs;
    }

    public void setAankoopprijs(double aankoopprijs) {
        this.aankoopprijs = aankoopprijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void gegevensTonen() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return titel + "; " + auteur + "; " + aankoopprijs + "; " + genre + "; " + eigenaar;
    }

    @Override
    public abstract double winstBerekenen();
}
