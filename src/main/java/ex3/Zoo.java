package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo qui contient une liste d'animaux.
 */
public class Zoo {

	private String nom; // Le nom du zoo
	private List<Animal> animaux; // Nouvelle liste d'animaux

	/**
	 * Constructeur de la classe Zoo.
	 * @param nom Le nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.animaux = new ArrayList<>(); // Initialisation de la liste des animaux
	}

	/**
	 * Ajoute un animal à la liste.
	 * @param animal L'animal à ajouter
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux dans le zoo.
	 * Chaque animal est affiché avec son nom, son type et son comportement.
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.getNom() + " " + animal.getType() + " " + animal.getComportement());
		}
	}

	/**
	 * Renvoie le nombre d'animaux dans le zoo.
	 * @return La taille de la liste des animaux
	 */
	public int taille() {
		return animaux.size(); // Renvoie la taille de la liste des animaux
	}

	/**
	 * Getter pour le nom du zoo.
	 * @return Le nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour le nom du zoo.
	 * @param nom Le nom à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
