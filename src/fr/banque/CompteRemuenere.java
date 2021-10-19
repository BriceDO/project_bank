package fr.banque;

public class CompteRemuenere extends Compte{

	private double taux;
	
	// Constructeur
	
	public CompteRemuenere() {
		super();
	}

	public CompteRemuenere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}
	
	// Guetters & Setters

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	// methodes
	
	/**
	 * public double calculerInterets()
	 * qui va calculer les intérêts du compte (taux*solde)
	 * @return double : interets une fois calculés
	 */
	
	public double calculerInterets() {
		
		double interetCalcules = this.getTaux() * this.getSolde();
		return interetCalcules;
	}
	
	/**
	 * public void verserInterets()
	 * qui ajoute au solde la totalité des intérêts calculés
	 */
	
	public void verserInterets() {
		this.setSolde(this.calculerInterets() + this.getSolde());
	}

	@Override
	public String toString() {
		return "CompteRemuenere [taux=" + taux + ", toString()=" + super.toString() + "]";
	}	
}
