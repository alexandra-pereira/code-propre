package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour un compte bancaire
	 * @param solde solde initial
	 * @param decouvert découvert autorisé (0 pour Livret A)
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant au solde
	 * @param montant montant à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Méthode abstraite pour débiter un montant
	 * @param montant montant à débiter
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Applique la rémunération annuelle si applicable pour le Livret A
	 */
	public void appliquerRemuAnnuelle() {
		if (this instanceof LivretA) {
			this.solde += solde * tauxRemuneration / 100;
		}
	}

	// Getters et setters
	/**
	 * Getter for solde
	 * @return le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter for solde
	 * @param solde le solde à définir
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * @return le découvert autorisé
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter for decouvert
	 * @param decouvert le découvert à définir
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Getter for tauxRemuneration
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter for tauxRemuneration
	 * @param tauxRemuneration le taux de rémunération à définir
	 */
	protected void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}