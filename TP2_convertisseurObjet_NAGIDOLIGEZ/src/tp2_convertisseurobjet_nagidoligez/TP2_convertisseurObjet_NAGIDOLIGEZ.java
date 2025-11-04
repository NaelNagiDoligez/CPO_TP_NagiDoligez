/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_nagidoligez;

import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class TP2_convertisseurObjet_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //debut exo et tests
        //Convertisseur temp1 = new Convertisseur();

        //temp1.valeur = 34;
        //temp1.valeur = temp1.CelciusVersFarenheit(temp1.valeur);
        //temp1.valeur = temp1.FarenheitVersKelvin(temp1.valeur);
        //System.out.println(temp1.KelvinVersCelcius(temp1.valeur));
       // System.out.println(temp1.toString());

        //Convertisseur temp2 = new Convertisseur();

        //temp2.valeur = 372;
        //temp2.valeur = temp2.KelvinVersFarenheit(temp2.valeur);
        //temp2.valeur = temp2.FarenheitVersCelcius(temp2.valeur);
       // System.out.println(temp2.valeur);
        //System.out.println(temp2.toString());
        
        //question 5
        int conversion;
        Convertisseur temp = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une temperature :");
        temp.valeur = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
        conversion = sc1.nextInt();

        while (conversion != 7) {
            if (conversion == 1) {
                System.out.println("conversion : " + temp.CelciusVersKelvin(temp.valeur));
                temp.valeur=temp.CelciusVersKelvin(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
            if (conversion == 2) {
                System.out.println("conversion : " + temp.KelvinVersCelcius(temp.valeur));
                temp.valeur=temp.KelvinVersCelcius(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
            if (conversion == 3) {
                System.out.println("conversion : " + temp.FarenheitVersCelcius(temp.valeur));
                temp.valeur=temp.FarenheitVersCelcius(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
            if (conversion == 4) {
                System.out.println("conversion : " + temp.CelciusVersFarenheit(temp.valeur));
                temp.valeur=temp.CelciusVersFarenheit(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
            if (conversion == 5) {
                System.out.println("conversion : " + temp.KelvinVersFarenheit(temp.valeur));
                temp.valeur=temp.KelvinVersFarenheit(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
            if (conversion == 6) {
                System.out.println("conversion : " + temp.FarenheitVersKelvin(temp.valeur));
                temp.valeur=temp.FarenheitVersKelvin(temp.valeur);
                System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin\n 7) Arret");
                conversion = sc1.nextInt();
            }
        }
        
        System.out.println(temp.toString());
    }
}
