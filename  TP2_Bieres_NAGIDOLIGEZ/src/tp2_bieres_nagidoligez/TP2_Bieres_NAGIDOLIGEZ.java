/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_nagidoligez;

/**
 *
 * @author jacqu
 */
public class TP2_Bieres_NAGIDOLIGEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
                7.0, "Dubuisson\n");
        uneBiere.lireEtiquette();

        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe",
                6.6, "Abbaye de Leffe\n");
        uneBiere2.lireEtiquette();

        BouteilleBiere uneBiere3 = new BouteilleBiere("biere3",
                4.5, "Abbaye 3\n");
        uneBiere3.lireEtiquette();

        BouteilleBiere uneBiere4 = new BouteilleBiere("biere4",
                9.6, "Abbaye 4\n");
        uneBiere4.lireEtiquette();
        BouteilleBiere uneBiere5 = new BouteilleBiere("biere5",
                3.7, "Abbaye 5\n");
        uneBiere5.lireEtiquette();
        uneBiere5.ouverte=true;
       
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere) ; 
        uneBiere2.Decapsuler();
        System.out.println(uneBiere2) ;
        System.out.println(uneBiere3) ;
    }

}
