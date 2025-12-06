

import java.util.Scanner;

public class TestConsoleCadenas {

    public static void main(String[] args) {

        JeuCadenas jeu = new JeuCadenas();
        Scanner sc = new Scanner(System.in);

        // Pour le debug : afficher le code secret
        System.out.println("=== TEST CONSOLE DU JEU CADENAS ===");
        System.out.println("Code secret (pour tester) : " + jeu.getCodeSecret());
        System.out.println("Tu as " + jeu.getMaxTentatives() + " tentatives.\n");

        while (!jeu.isTermine()) {

            System.out.println("Tentative " + (jeu.getNbTentatives() + 1)
                    + " sur " + jeu.getMaxTentatives());

            System.out.print("Entrez 4 chiffres entre 0 et 9 séparés par des espaces : ");

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            Code proposition = new Code(c1, c2, c3, c4);
            ResultatEssai res = jeu.testerCombinaison(proposition);

            System.out.println("Résultat : " + res);
            System.out.println();

            if (res.isGagne()) {
                System.out.println("🎉 Bravo, tu as trouvé le bon code !");
            } else if (jeu.isTermine()) {
                System.out.println("❌ Tentatives épuisées, tu as perdu.");
                System.out.println("Le code secret était : " + jeu.getCodeSecret());
            }
        }

        sc.close();
        System.out.println("=== Fin du test console ===");
    }
}

