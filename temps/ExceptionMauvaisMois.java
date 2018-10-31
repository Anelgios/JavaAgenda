package temps;

/**
 * Exception pour l'entrée d'une mauvaise valeure d'heure
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */
    
    /**
     * Construit un message d'erreur en fonction du Mois entrée par l'utilisateur
     * 
     */
public class ExceptionMauvaisMois extends Exception {
    public ExceptionMauvaisMois(int m) {
        super("Mois incorrect (" + m + ") pour une date "
            + "(il faut un entier entre 1 et 12");
    }
}
