package fr.banque;

public class CompteASeuil extends Compte {
	
	private double seuil;
	
	// Constructeurs
	public CompteASeuil() {
		super();
	}

	public CompteASeuil(int numero, double solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}
	
	// Methodes
	
	/**
	 * public void retirer(double uneValeur)
	 * Doit faire les vérifications en fonction de la valeur du seuil.
	 * On ne peut retirer M du solde S si et seulement si on a S-M > Seuil.
	 */
	
	public void retirer(double unMontant) {
		
		this.setSeuil(unMontant);
		
	}

	// Guetters & Setters
	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	
	@Override
	public String toString() {
		return "CompteASeuil [seuil=" + seuil + ", toString()=" + super.toString() + "]";
	}
}
