package fr.banque;

import java.util.Objects;

public class Compte {
	
	private int numero;
	private double solde;
	
	public Compte() {
		super();
	}

	public Compte(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	/**
	 * qui ajoute de l'argent au solde du compte
	 * @param double unMontant
	 */
	public void ajouter(double unMontant) {
		this.setSolde(this.getSolde()+unMontant);
	}
	
	/**
	 * qui retire de l'argent au solde du compte
	 * @param double unMontant
	 */
	public void retirer(double unMontant) {
		// TODO arrondi du double
		this.setSolde(Math.round(this.getSolde()-unMontant));
	}

	public int getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + this.getSolde() + ", numero=" + this.getNumero() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numero == other.numero && Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}
	
	
}