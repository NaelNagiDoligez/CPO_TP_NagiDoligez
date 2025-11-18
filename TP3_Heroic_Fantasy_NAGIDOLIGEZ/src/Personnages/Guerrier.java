/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author jacqu
 */
public class Guerrier extends Personnage{
    boolean cheval;

    public Guerrier(String nom, int hp,boolean cheval) {
        super(nom, hp);
        this.cheval = cheval;
    }

    
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
}
