package temps;

/**
 * Classe Durée
 * représentée par une valeur de Temps
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */

    /**
     * Construit une Durée en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
public class Duree extends Temps {
    private static String quoi = "Duree";
    public Duree(int h, int m)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        super(h, m, quoi, false);
    }
    /**
     * Construit une Durée en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
    public Duree(String texte)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        super(texte, quoi, false);
    }
    /**
     * Augmente de 1 la valeur de Heure
     * 
     * @param heure un entier qui détermine l'heure
     */
    public void uneHeureDePlus() {
        heure++;
    }
    /**
     * Réduit de 1 la valeur de Heure
     * 
     * @param heure un entier qui détermine l'heure
     */
    public void uneHeureDeMoins() {
        if (heure > 0) {
            heure--;
        } else {
            heure = 0;
            minute = 0;
        }
    }
}
