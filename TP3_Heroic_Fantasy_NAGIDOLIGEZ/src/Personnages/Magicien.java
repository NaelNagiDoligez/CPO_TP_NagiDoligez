/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author jacqu
 */
public class Magicien extends Personnage {
    boolean confirme;
    private static int nbMagicien = 0;

    public Magicien(String nom, int hp, boolean confirme) {
        super(nom, hp);
        this.confirme = confirme;
        nbMagicien++;
    }
    
        @Override
    public void finalize(){
        nbMagicien--;
    }

    public static int getnbMagicien() {
        return nbMagicien;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        
        String statut;

        if (this.confirme == true) {
           statut = "Confirmé";
        } else {
           statut = "Novice";
        }

        String description = super.toString();

        return description + "\n  Statut : " + statut;
    }
}
