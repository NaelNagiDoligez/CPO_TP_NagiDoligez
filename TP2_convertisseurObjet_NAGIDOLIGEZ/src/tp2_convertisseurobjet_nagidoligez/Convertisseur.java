/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_nagidoligez;

/**
 *
 * @author jacqu
 */
public class Convertisseur {

    double nbConversions;
    double valeur;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        nbConversions+=0.5;
        return tCelcius;
    }

    public double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        nbConversions+=0.5;
        return tKelvin;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) * 5 / 9;
        nbConversions+=0.5;
        return tFarenheit;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        tCelcius = tCelcius * 1.8 + 32;
        nbConversions+=0.5;
        return tCelcius;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        tKelvin = (tKelvin - 273.15) * 1.8 + 32;
        nbConversions+=0.5;
        return tKelvin;
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) * 5 / 9 + 273.15;
        nbConversions+=0.5;
        return tFarenheit;
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
    
    
}
