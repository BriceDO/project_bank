package fr.banque;

import java.util.Arrays;
import java.util.Objects;

public class Client {
	
	// attributs internes
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	
	// attribut externe
	private Compte[] comptes;
	
	public Client() {
		super();
	}

	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}
	
	/**
	 * 
	 * méthode qui regarde dans le tableau de compte 
	 * et place le paramètre dans la première case vide (c.a.d null) du tableau.
	 * Dans le cas où il n'y a plus de case vide, afficher un message.
	 *
	 * @param unCompte : celui à ajouter
	 */
	
	public void ajouterCompte(Compte unCompte) {
		// TODO 
		int nbCompte = 0;
		
		for (int i = 0; i < this.comptes.length ; i++) {
			
			// s'il y en a déjà un
			if (this.comptes[i] != null) {
				if(this.comptes[i].getNumero() == unCompte.getNumero()) {
					System.out.println("Ce compte existe déjà !");
					break;
				}
				// donc compte + 1 et on regarde le prochain
				nbCompte+=1;
				continue;
			} else {
				// ajout du compte
				this.comptes[i] = unCompte;
				System.out.println("Le compte a été ajouté !");
				nbCompte+=1;
				break;
			}
		}
		
		if(nbCompte >= 5) {
			System.out.println("Nombre max de comptes atteint !");
		}
	}
	
	/**
	 * 
	 * méthode qui parcours le tableau des comptes et donne le premier compte qui a comme numéro la valeur du paramètre.
	 * Dans le cas où vous ne trouvez aucun compte qui a le bon numéro, affichez un message.
	 * Attention, n'oubliez pas que votre tableau contient des null par défaut.
	 *
	 * @param int numero
	 * @return compte de type Compte
	 */
	
	public Compte getCompte(int numeroCompte) {
			
			Compte findCompte = new Compte();
			
			for (int i = 0; i < this.comptes.length; i++) {
				if(this.comptes[i].getNumero() == numeroCompte) {
					findCompte = this.comptes[i];
					break;
				}
			}
			if (findCompte.equals(null)) {
				System.out.println("le compte n'a pas été trouvé");
			}
			return findCompte;
		}
	
	// Guetter & Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} else {
			System.out.println("L'âge doit être positif !");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Compte[] getComptes() {
		return comptes;
	}

	public void setComptes(Compte[] comptes) {
		if (comptes.length != 5) {
			System.out.println("Le tableau de comptes doit contenir 5 comptes");
		} else {
			this.comptes = comptes;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(comptes);
		result = prime * result + Objects.hash(age, nom, numero, prenom);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return age == other.age && Arrays.equals(comptes, other.comptes) && Objects.equals(nom, other.nom)
				&& numero == other.numero && Objects.equals(prenom, other.prenom);
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", comptes="
				+ Arrays.toString(comptes) + "]";
	}	
}