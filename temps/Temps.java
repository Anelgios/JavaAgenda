package temps;

import java.util.StringTokenizer;
import java.lang.Integer;
import java.lang.Comparable;

/**
 * Classe Temps
 * représentant les valeurs d'Heure et de Durée
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */

abstract class Temps implements Comparable<Temps> {
    protected int heure;
    protected int minute;
    /**
     * Donne des valeurs aux variables d'instance de l'objet Date
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
    private void initialise(int h, int m, String classe, boolean borneSupHeure)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        if (m < 0 || m > 59)
            throw new ExceptionMauvaiseValeurPourMinute("Valeur incorrecte de minute (" + m + ") pour une instance de " + classe);
        boolean heureIncorrecte = (borneSupHeure) ? (h < 0 || h > 23) : (h < 0);
        if (heureIncorrecte)
            throw new ExceptionMauvaiseValeurPourHeure("Valeur incorrecte de heure (" + h + ") pour une instance de " + classe);
        heure = h;
        minute = m;
    }
    /**
     * Construit un Temps en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
    public Temps(int h, int m, String classe, boolean borneSupHeure)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        initialise(h, m, classe, borneSupHeure);
    }
    /**
     * Construit un Temps en donnant des valeurs aux variables d'instance de l'objet Temps
     * 
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     * @exception ExceptionMauvaiseValeurPourHeure exception indiquant si l'heure est icorrecte (parexemple <0 ou >23)
     * @exception ExceptionMauvaiseValeurPourMinute exception indiquant si la minute est icorrecte (parexemple <0 ou >59)
     * 
     */
    public Temps(String texte, String quoi, boolean borneSupHeure)
    throws ExceptionMauvaiseValeurPourHeure,
           ExceptionMauvaiseValeurPourMinute {
        StringTokenizer st = new StringTokenizer(texte, ":");
        int h, m;
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        initialise(h, m, quoi, borneSupHeure);
    }
    /**
     * Augmente de 1 la valeur de Minute
     * Fait appel à la méthode uneHeureDePlus et réinitialise la valeur à 0 quand Minute est à 59 
     * 
     * @param minute un entier qui détermine la minute
     */
    public void uneMinuteDePlus() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            uneHeureDePlus();
        }
    }
    /**
     * Augmente de 1 la valeur de Heure
     * 
     */
    public abstract void uneHeureDePlus();
    /**
     * Réduit de 1 la valeur de Minute
     * Fait appel à la méthode uneHeureDeMoins et réinitialise la valeur à 59 quand Minute est à 0 
     * 
     * @param minute un entier qui détermine la minute
     */
    public void uneMinuteDeMoins() {
        if (minute > 0) {
            minute--;
        } else {
            minute = 59;
            uneHeureDeMoins();
        }
    }
    /**
     * Réduit de 1 la valeur de Heure
     * 
     * @param heure un entier qui détermine l'heure
     */
    public abstract void uneHeureDeMoins();
    /**
     * Convertit l'Heure en chaine notant cette Heure
     * 
     * @param s une chaine qui déterine l'heure
     * @param h un entier qui détermine l'heure
     * @param m un entier qui détermine la minute
     * 
     */
    public String toString() {
        String s = "";
        if (heure < 10) s += "0";
        s += heure;
        s += "h";
        if (minute < 10) s += "0";
        s += minute;
        return s;
    }
    /**
     * Compare l'Heure à un autre Temps
     * 
     * @param heure un entier qui détermine l'heure
     * 
     */
    public int compareTo(Temps autreTemps) {
        if (heure == autreTemps.heure) {
            return minute - autreTemps.minute;
        } else
            return heure - autreTemps.heure;
    }
}
