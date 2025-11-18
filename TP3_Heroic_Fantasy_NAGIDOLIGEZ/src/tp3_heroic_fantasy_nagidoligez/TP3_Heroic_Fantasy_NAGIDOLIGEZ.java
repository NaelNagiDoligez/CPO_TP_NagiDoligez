/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_nagidoligez;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class TP3_Heroic_Fantasy_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Epee epee3 = new Epee("epee3", 8, 3);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        Baton baton3 = new Baton("baton3", 7, 7);

        ArrayList<Arme> listeArmes = new ArrayList<>();

        listeArmes.add(epee1);
        listeArmes.add(epee2);
        listeArmes.add(baton1);
        listeArmes.add(baton2);

        for (int i = 0; i < listeArmes.size(); i++) {
            Arme arme = listeArmes.get(i);
            System.out.println(arme);
        }

        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);

        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> listePersonnage = new ArrayList<>();

        listePersonnage.add(magicien1);
        listePersonnage.add(magicien2);
        listePersonnage.add(guerrier1);
        listePersonnage.add(guerrier2);

        for (int i = 0; i < listePersonnage.size(); i++) {
            Personnage perso = listePersonnage.get(i);
            System.out.println(perso);
        }

        guerrier1.ajouterArme(baton1);
        guerrier1.ajouterArme(epee1);
        guerrier1.ajouterArme(epee2);

        guerrier1.equiperArme("Excalibur");
        
        magicien1.ajouterArme(baton2);
        magicien1.ajouterArme(baton3);
        magicien1.ajouterArme(epee3);
    }

}
