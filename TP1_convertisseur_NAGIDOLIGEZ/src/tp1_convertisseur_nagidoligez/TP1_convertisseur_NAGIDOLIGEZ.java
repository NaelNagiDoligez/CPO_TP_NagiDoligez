/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_nagidoligez;

import java.util.Scanner;

/**
 *
 * @author jacqu
 */

public class TP1_convertisseur_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double uservalue;
        int conversion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une temperature :");
        uservalue = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Saisir la conversion à faire :\n 1) Celcius vers Kelvin\n 2) Kelvin vers Celcius\n 3) Farenheit vers Celcius\n 4) Celcius vers Farenheit\n 5) Kelvin vers Farenheit\n 6) Farenheit vers Kelvin");
        conversion = sc1.nextInt();

        if (conversion == 1) {
            System.out.println("conversion : "+CelciusVersKelvin(uservalue));
        }
        if (conversion == 2) {
                System.out.println("conversion : "+KelvinVersCelcius(uservalue));
            }
        if (conversion == 3) {
                System.out.println("conversion : "+FarenheitVersCelcius(uservalue));
            }
        if (conversion == 4) {
                System.out.println("conversion : "+CelciusVersFarenheit(uservalue));
            }
        if (conversion == 5) {
                System.out.println("conversion : "+KelvinVersFarenheit(uservalue));
            }
        if (conversion == 6) {
                System.out.println("conversion : "+FarenheitVersKelvin(uservalue));
            }
        }

// TODO code application logic here
    

    public static double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;

    }

    // suite
    
    public static double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) * 5 / 9;
        return tFarenheit;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        tCelcius = tCelcius * 1.8 + 32;
        return tCelcius;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        tKelvin = (tKelvin - 273.15) * 1.8 + 32;
        return tKelvin;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) * 5 / 9 + 273.15;
        return tFarenheit;
    }

}
