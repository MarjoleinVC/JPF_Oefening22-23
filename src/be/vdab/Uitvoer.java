package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Uitvoer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voorwerp voorwerpen[] = new Voorwerp[6];
        voorwerpen[0] = new Leesboek();
        voorwerpen[1] = new Leesboek("Java by example", "J.P. Dupont", 18.85, "Informatica", "Java");
        voorwerpen[2] = new Woordenboek();
        voorwerpen[3] = new Woordenboek("Wolters N-F", "A.D.P. Vandervoort", 25.50, "Naslagwerken", "N-F");
        voorwerpen[4] = new Boekenrek();
        voorwerpen[5] = new Boekenrek(200.0F, 75.5F, 75.0);

        double totaleWinst = 0.0;
        for (Voorwerp eenVoorwerp : voorwerpen) {
            totaleWinst += eenVoorwerp.winstBerekenen();
            eenVoorwerp.gegevensTonen();
        }
        System.out.println("Totale winst: " + totaleWinst);
    }
}
