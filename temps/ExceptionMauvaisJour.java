package temps;

/**
 * Exception pour l'entrée d'une mauvaise valeure d'heure
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */
    
    /**
     * Construit un message d'erreur en fonction du Jour entrée par l'utilisateur
     * 
     */
public class ExceptionMauvaisJour extends Exception {
    public ExceptionMauvaisJour(String msg) {
        super(msg);
    }
}
