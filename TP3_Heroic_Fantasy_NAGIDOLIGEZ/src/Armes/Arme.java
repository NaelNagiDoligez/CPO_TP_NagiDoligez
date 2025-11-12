/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author jacqu
 */
public abstract class Arme {

    String nom;
    int nvattq;

    public Arme(String nom, int nvattq) {
        this.nom = nom;
        this.nvattq = nvattq;
        if (nvattq > 100) {
            nvattq = 100;
        }
    }

    public String nom() {
        return nom;
    }

    public int nvattq() {
        return nvattq;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", nvattq=" + nvattq + '}';
    }

}
