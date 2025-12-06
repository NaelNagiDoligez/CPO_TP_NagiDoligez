import java.util.Random;

public class JeuCadenas {

    private Code codeSecret;
    private int nbTentatives;
    private int maxTentatives;
    private boolean termine;
    private boolean gagne;

    // Constructeur avec 5 tentatives max par défaut
    public JeuCadenas() {
        this(5);
    }

    // Constructeur où tu peux choisir le nombre max de tentatives
    public JeuCadenas(int maxTentatives) {
        this.maxTentatives = maxTentatives;
        recommencer(); // génère un code aléatoire et remet tout à zéro
    }

    // Génère un nouveau code aléatoire (4 chiffres entre 0 et 9)
    private Code genererCodeAleatoire() {
        Random r = new Random();
        int c1 = r.nextInt(10); // 0 à 9
        int c2 = r.nextInt(10);
        int c3 = r.nextInt(10);
        int c4 = r.nextInt(10);
        return new Code(c1, c2, c3, c4);
    }

    // Teste une combinaison proposée par le joueur
    public ResultatEssai testerCombinaison(Code proposition) {

        // Si la partie est déjà terminée, on renvoie juste un résultat neutre
        if (termine) {
            return new ResultatEssai(0, 0, 0, gagne);
        }

        int nbExacts = 0;
        int nbHauts = 0;
        int nbBas = 0;

        for (int i = 0; i < 4; i++) {
            int prop = proposition.getChiffre(i);
            int secret = codeSecret.getChiffre(i);

            if (prop == secret) {
                nbExacts++;
            } else if (prop > secret) {
                nbHauts++;
            } else { // prop < secret
                nbBas++;
            }
        }

        nbTentatives++;

        if (nbExacts == 4) {
            gagne = true;
        }

        if (gagne || nbTentatives >= maxTentatives) {
            termine = true;
        }

        return new ResultatEssai(nbExacts, nbHauts, nbBas, gagne);
    }

    // Remet le jeu à zéro avec un nouveau code secret
    public void recommencer() {
        this.codeSecret = genererCodeAleatoire();
        this.nbTentatives = 0;
        this.termine = false;
        this.gagne = false;
    }

    public int getNbTentatives() {
        return nbTentatives;
    }

    public int getMaxTentatives() {
        return maxTentatives;
    }

    public boolean isTermine() {
        return termine;
    }

    public boolean isGagne() {
        return gagne;
    }

    // Optionnel : pour déboguer, voir le code secret
    public Code getCodeSecret() {
        return codeSecret;
    }
}

