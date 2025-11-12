/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author jacqu
 */
public class Epee extends Arme {
    int finesse;

    public Epee(String nom, int nvattq, int finesse) {
        super(nom, finesse);
        this.finesse = finesse;
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + '}';
    }
 
    
  
}
