package temps;

/**
 * Exception pour l'entrée d'une mauvaise valeure d'heure
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */
    
    /**
     * Construit un message d'erreur en fonction de l'Année entrée par l'utilisateur
     * 
     */
public class ExceptionMauvaiseAnnee extends Exception {
    public ExceptionMauvaiseAnnee(int a) {
        super("Annee incorrecte (" + a + ") pour une date "
            + "(il faut un entier positif");
    }
}
