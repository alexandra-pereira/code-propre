package ex2;

/**
 * Représente un livret A (type=LA)
 */
public class LivretA extends CompteBancaire {

	/**
	 * Constructeur pour un livret A
	 * @param solde solde initial
	 * @param tauxRemuneration taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0); // Pas de découvert pour un Livret A
		setTauxRemuneration(tauxRemuneration);
	}

	/**
	 * Débite un montant, sans autoriser le découvert
	 * @param montant montant à débiter
	 */
	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant >= 0) {
			super.ajouterMontant(-montant); // Débiter le montant
		} else {
			System.out.println("Débit non autorisé : découvert non autorisé.");
		}
	}
}