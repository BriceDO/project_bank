package fr.banque;

public class Main {

	public static void main(String[] args) {
		
		Compte[] comptes = new Compte[5];
		
		Compte c1 = new Compte(1, 200);
		Compte c2 = new Compte(2, 1500);
		Compte c3 = new Compte(3, 300);
		Compte livretA = new CompteRemuenere(50, 350, 0.4);
		

		Client monClient = new Client("Toto", "Tata", 19, 55350);

		monClient.setComptes(comptes);
		monClient.ajouterCompte(c1);
		monClient.ajouterCompte(c2);
		
		System.out.println(monClient);

	}

}
