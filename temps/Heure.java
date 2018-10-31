package temps;

/**
 * Classe Heure
 * représentée par une valeur de Temps
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */

    /**
     * Construit une Heure en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
public class Heure extends Temps {
    private static String quoi = "Heure";
    public Heure(int h, int m)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        super(h, m, quoi, true);
    }
    /**
     * Construit une Heure en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param texte un entier qui détermine l'heure
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
    public Heure(String texte)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        super(texte, quoi, true);
    }
    /**
     * Augmente de 1 la valeur de Heure
     * réinitialise la valeur à 0 quand Heure est à 23
     * 
     * @param heure un entier qui détermine l'heure
     */
    public void uneHeureDePlus() {
        if (heure < 23) {
            heure++;
        } else {
            heure = 0;
        }
    }
    /**
     * Réduit de 1 la valeur de Heure
     * réinitialise la valeur à 23 quand Heure est à 0
     * 
     * @param heure un entier qui détermine l'heure
     */
    public void uneHeureDeMoins() {
        if (heure > 0) {
            heure--;
        } else {
            heure = 23;
        }
    }
}
