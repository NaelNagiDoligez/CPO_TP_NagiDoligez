/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author jacqu
 */
public class Baton extends Arme{
    int age;

    public Baton( String nom, int nvattq, int age) {
        super(nom, nvattq);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
}
