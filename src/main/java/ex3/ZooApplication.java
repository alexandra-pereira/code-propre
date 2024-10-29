package ex3;

/**
 * Classe principale de l'application Zoo.
 * Permet de créer un zoo et d'ajouter des animaux à celui-ci.
 */
public class ZooApplication {

	public static void main(String[] args) {
		// Création d'un zoo avec le nom "Thoiry"
		Zoo zoo = new Zoo("Thoiry");

		// Création d'instances d'Animal et ajout à la liste du zoo
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "CARNIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));

		// Affiche la liste des animaux présents dans le zoo
		zoo.afficherListeAnimaux();
	}
}