/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_nagidoligez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class TP1_stats_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] tableau = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre :");
        int m = sc.nextInt();

        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < m; i++) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);
            tableau[n] += 1;
        }
        for (int i = 0; i < 6; i++) {
            double proba = (tableau[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + tableau[i] + " --> " + proba + "%");
        }

// TODO code application logic here
    }
}
