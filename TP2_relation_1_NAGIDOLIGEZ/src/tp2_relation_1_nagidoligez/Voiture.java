/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_nagidoligez;

/**
 *
 * @author jacqu
 */
public class Voiture {

    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = null;
    }
    

    @Override
    public String toString() {
        return  Modele + " " + Marque + " " + PuissanceCV +" CV";
    }

}
