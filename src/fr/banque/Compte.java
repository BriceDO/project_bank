package fr.banque;

public class Compte {
	
	private int numero;
	private double solde;
	
	public Compte() {}

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	//qui ajoute de l'argent au solde du compte
	public void ajouter(double unMontant) {
		this.solde += unMontant;
	}
	
	//qui retire de l'argent au solde du compte
	public void retirer(double unMontant) {
		this.solde -= unMontant;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
	
	
	
	
}
