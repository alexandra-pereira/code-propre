package ex3;

/**
 * Représente un animal dans le zoo avec un nom, un type et un comportement.
 */
public class Animal {
    private String nom;          // Le nom de l'animal
    private String type;         // Le type de l'animal (ex: mammifère, oiseau, etc.)
    private String comportement;  // Le comportement de l'animal (ex: herbivore, carnivore, etc.)

    /**
     * Constructeur de l'animal.
     * @param nom le nom de l'animal
     * @param type le type de l'animal
     * @param comportement le comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Récupère le nom de l'animal.
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le type de l'animal.
     * @return le type de l'animal
     */
    public String getType() {
        return type;
    }

    /**
     * Récupère le comportement de l'animal.
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }
}
