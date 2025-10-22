/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_nagidoligez;

import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class TP1_manipNombresInt_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        int somme;
        int soustraction;
        int multiplication;
        int quotient;
        int reste;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le 1er nombre :");
        nb1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer le 2eme nombre :");
        nb2 = sc1.nextInt();

        somme = nb1 + nb2;
        soustraction = nb1 - nb2;
        multiplication = nb1 * nb2;

        System.out.println("somme : " + somme);
        System.out.println("soustraction : " + soustraction);
        System.out.println("multiplication : " + multiplication);

        quotient = nb1 / nb2;
        reste = nb1 % nb2;

        System.out.println("quotient : " + quotient);
        System.out.println("reste : " + reste);
// TODO code application logic here
    }

}
