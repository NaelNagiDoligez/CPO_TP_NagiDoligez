public class ResultatEssai {

    private final int nbChiffresExacts;
    private final int nbChiffresTropHauts;
    private final int nbChiffresTropBas;
    private final boolean gagne;

    public ResultatEssai(int nbChiffresExacts, int nbChiffresTropHauts, int nbChiffresTropBas, boolean gagne) {
        this.nbChiffresExacts = nbChiffresExacts;
        this.nbChiffresTropHauts = nbChiffresTropHauts;
        this.nbChiffresTropBas = nbChiffresTropBas;
        this.gagne = gagne;
    }

    public int getNbChiffresExacts() {
        return nbChiffresExacts;
    }

    public int getNbChiffresTropHauts() {
        return nbChiffresTropHauts;
    }

    public int getNbChiffresTropBas() {
        return nbChiffresTropBas;
    }

    public boolean isGagne() {
        return gagne;
    }

    @Override
    public String toString() {
        return "Exacts=" + nbChiffresExacts
                + ", Trop hauts=" + nbChiffresTropHauts
                + ", Trop bas=" + nbChiffresTropBas
                + ", Gagné=" + gagne;
    }
}

