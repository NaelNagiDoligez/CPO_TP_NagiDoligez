/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_nagidoligez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class TP1_guessMyNumber_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int compteur = 0;

        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);

        Scanner sc0 = new Scanner(System.in);
        System.out.println("Choisissez la difficulté entre 1, 2 et 3 :");
        int difficulte = sc0.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 0 et 100 :");
        int uservalue = sc.nextInt();

        //Facile nombre d'essais illimités
        if (difficulte == 1) {

            while (uservalue != n) {

                if (uservalue > n) {
                    System.out.println("Trop grand !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc1.nextInt();

                }
                if (uservalue < n) {
                    System.out.println("Trop petit !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc2.nextInt();
                }
                if (uservalue == n) {
                    System.out.println("Gagné au bout de " + compteur + " essais");
                }

            }
        }

        //Normal 10 essais max
        if (difficulte == 2) {

            while (uservalue != n) {

                if (uservalue > n) {
                    System.out.println("Trop grand !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc1.nextInt();

                }
                if (uservalue < n) {
                    System.out.println("Trop petit !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc2.nextInt();
                }
                if (uservalue == n) {
                    System.out.println("Gagné au bout de " + compteur + " essais");
                }
                if (compteur == 10) {
                    System.out.println("Perdu : nombre max d'essais atteints (10)");
                    break;
                }

// TODO code application logic here
            }
        }
        if (difficulte == 3) {
            //Difficile 3 essais max
            while (uservalue != n) {

                if (uservalue > n) {
                    System.out.println("Trop grand !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc1.nextInt();

                }
                if (uservalue < n) {
                    System.out.println("Trop petit !");
                    compteur += 1;
                    System.out.println("nombre(s) d'essais : " + compteur);
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("reessayer :");
                    uservalue = sc2.nextInt();
                }
                if (uservalue == n) {
                    System.out.println("Gagné au bout de " + compteur + " essais");
                }
                if (compteur == 3) {
                    System.out.println("Perdu : nombre max d'essais atteints (3)");
                    break;
                }

// TODO code application logic here
            }
        }
    }
}
