/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_nagidoligez;

/**
 *
 * @author jacqu
 */
public abstract class Personnage {
    String nom;
    int hp;

    public Personnage(String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
    }
    
    public String nom(){
        return nom;
    }
    
    public int hp(){
        return hp;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", hp=" + hp + '}';
    }
    
    
}
