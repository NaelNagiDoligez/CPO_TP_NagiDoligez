/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public abstract class Personnage {

    String nom;
    int hp;
    static int nbPerso = 0;

    ArrayList<Arme> inventaire = new ArrayList<>();

    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);

            System.out.println(arme.nom() + " a ete ajoute à l inventaire de " + this.nom);

        } else {
            System.out.println("inventaire plein");
        }

    }

    Arme arme_en_main = null;

    public Arme getArmeEnMain() {
        return this.arme_en_main;
    }

    public void equiperArme(String nom) {
        boolean trouvee = false;
        for (Arme arme : inventaire) {
            if (arme.nom().equals(nom)) {
                this.arme_en_main = arme;
                trouvee = true;
                System.out.println(this.nom + " equipe " + nom);
                break;
            }
        }
        if (trouvee == false) {
            System.out.println(this.nom + " ne possede pas " + nom + "' dans son inventaire.");
        }
    }

    public Personnage(String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
        nbPerso++;
    }

    public static int getNbPerso() {
        return nbPerso;
    }

    public String nom() {
        return nom;
    }

    public int hp() {
        return hp;
    }

    @Override
    public String toString() {
        String description = " nom= " + nom + " hp= " + hp;

        if (this.arme_en_main != null) {
            description += "\n  Arme en main : " + this.arme_en_main.toString();
        } else {
            description += "\n  Arme en main : (aucune)";
        }
        return description;
    }
}
