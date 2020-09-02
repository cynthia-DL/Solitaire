package src;

import java.util.*;

/**
 * Represente un paquet de carte
 * 
 * @author Cynthia
 * @version 1.0
 * @see Carte.java
 */
public class Paquet {
    /**
     * la reserve de carte
     */
    private ArrayList<Carte> reserve;

    /**
     * Le constructeur par défaut
     */
    public Paquet() {
        this.reserve = new ArrayList<Carte>();

        for (Couleur c : Couleur.values()) {
            for (Valeur v : Valeur.values()) {
                reserve.add(new Carte(c, v));
            }
        }

        this.melanger();
    }

    /**
     * Cette méthode melange de paquet de carte
     */
    public void melanger() {
        Collections.shuffle(reserve);
    }

    /**
     * Cette méthode renvoir la dernière carte du paquet
     * 
     * @return la dernière carte du paquet
     */
    public Carte prendreLaDerniereCarte() {
        return this.reserve.remove(this.reserve.size() - 1);
    }

    @Override
    public String toString() {
        String res = new String();
        for (Carte c : reserve) {
            res = res + "\n" + c;
        }
        return res;
    }
}