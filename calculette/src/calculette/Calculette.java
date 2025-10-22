/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculette;

import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operand1;
        int operand2;
        int resultat = 0;
        System.out.println("""
                       Please enter the operator: 
                       1) add 
                       2) substract 
                       3) multiply 
                       4) divide 
                       5) modulo """);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre correspondant à l'opérateur :");
        operateur = sc.nextInt();

        while ((operateur != 1) & (operateur != 2) & (operateur != 3) & (operateur != 4) & (operateur != 5)) {
            System.out.println("Entrez un entier parmis ceux proposés");
            System.out.println("Entrer le nombre correspondant à l'opérateur :");
            operateur = sc.nextInt();
        }
        Scanner nv = new Scanner(System.in);
        System.out.println("Entrer le premier opérande :");
        operand1 = nv.nextInt();

        Scanner hj = new Scanner(System.in);
        System.out.println("Entrer le deuxième opérande :");
        operand2 = hj.nextInt();

        if (operateur == 1) {
            resultat = operand1 + operand2;
            System.out.println("le résultat est :" + resultat);
        }
        if (operateur == 2) {
            resultat = operand1 - operand2;
            System.out.println("le résultat est :" + resultat);
        }
        if (operateur == 3) {
            resultat = operand1 * operand2;
            System.out.println("le résultat est :" + resultat);
        }
        if (operateur == 4) {
            if (operand2 != 0) {
                resultat = operand1 / operand2;
                System.out.println("le résultat est :" + resultat);

            } else {
                System.out.println("On ne divise pas par 0");
            }
        }
        if (operateur == 5) {
            resultat = operand1 % operand2;
            System.out.println("le résultat est :" + resultat);
        }

// TODO code application logic here
    }

}
