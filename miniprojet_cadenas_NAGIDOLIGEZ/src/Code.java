public class Code {

    private int[] chiffres;

    // Constructeur avec 4 chiffres
    public Code(int c1, int c2, int c3, int c4) {
        this.chiffres = new int[4];
        this.chiffres[0] = c1;
        this.chiffres[1] = c2;
        this.chiffres[2] = c3;
        this.chiffres[3] = c4;
    }

    // Constructeur par défaut : 0000
    public Code() {
        this(0, 0, 0, 0);
    }

    // Renvoie le chiffre à la position index (0 à 3)
    public int getChiffre(int index) {
        return this.chiffres[index];
    }

    // Modifie le chiffre à la position index (0 à 3)
    public void setChiffre(int index, int valeur) {
        this.chiffres[index] = valeur;
    }

    @Override
    public String toString() {
        return "" + chiffres[0] + chiffres[1] + chiffres[2] + chiffres[3];
    }
}


