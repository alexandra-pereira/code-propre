package ex2;

/**
 * Représente un compte courant (type=CC)
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur pour un compte courant
     * @param solde solde initial
     * @param decouvert découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    /**
     * Débite un montant, en respectant le découvert autorisé
     * @param montant montant à débiter
     */
    @Override
    public void debiterMontant(double montant) {
        if (getSolde() - montant >= getDecouvert()) {
            super.ajouterMontant(-montant); // Débiter le montant
        } else {
            System.out.println("Débit non autorisé : découvert dépassé.");
        }
    }
}