/**
 * La classe qui représente les cartes
 * @author Cynthia
 * @version 1.0
 * @see Couleur.java Valeur.java
 **/
public class Carte {
    /**
     * La couleur de la carte
     * @see Couleur.java 
     **/
    private Couleur couleur;
    
    /**
     * La valeur de la carte
     * @see Valeur.java 
     **/
    private Valeur valeur;

    /**
     * Constructeur d'une carte
     * @param c la couleur de la carte
     * @param v la valeur de la carte
     */
    public Carte(Couleur c, Valeur v) {
        this.couleur = c;
        this.valeur = v;
    }

    /**
     * Setter couleur
     * @param newCouleur
     */
    public void setCouleur(Couleur newCouleur) {
        this.couleur = newCouleur;
    }

    /**
     * Setter valeur
     * @param newValeur
     */
    public void setValeur(Valeur newValeur) {
        this.valeur = newValeur;
    }

    /**
     * Getter couleur
     * @return la couleur de la carte
     */
    public Couleur getCouleur() {
        return this.couleur;
    }

    /**
     * Getter Valeur
     * @return la valeur de la carte
     */
    public Valeur getValeur() {
        return this.valeur;
    }

    @Override
    public String toString() {
        return this.valeur + " DE " + this.couleur;
    }
}
