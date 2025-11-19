/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author jacqu
 */
public class Guerrier extends Personnage{
    boolean cheval;
    private static int nbGuerrier = 0;

    public Guerrier(String nom, int hp,boolean cheval) {
        super(nom, hp);
        this.cheval = cheval;
        nbGuerrier++;
    }

    public static int getnbGuerrier() {
        return nbGuerrier;
    }
    @Override
    public void finalize(){
        nbGuerrier--;
    }
    
    
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
        @Override
    public String toString() {
        String statut;

        if (this.cheval == true) {
           statut = "Guerrier à cheval";
        } else {
           statut = "Guerrier à pied";
        }

        String description = super.toString();

        return description + "\n  Statut : " + statut;
    }
}
