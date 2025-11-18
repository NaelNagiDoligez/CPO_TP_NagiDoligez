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
public class Magicien extends Personnage{
    boolean confirme;

    public Magicien(String nom, int hp,boolean confirme) {
        super(nom, hp);
        this.confirme = confirme;
    }
    
    
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
}
