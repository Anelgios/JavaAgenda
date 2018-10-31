import agenda.*;
import outils.*;

/**
 * Date représente un jour de l'année
 * 
 * @author Philipe Brutus et tous les membres du groupe B3 CSI 2018-2019
 * 
 * @version 3
 */

    /**
     * Donne des valeurs aux variables d'instance de l'objet Date
     * 
     * @param j un entier qui détermine le jour du mois
     * @param m un entier qui détermine le mois dans l'année
     * @param a un entier qui détermine l'année
     * 
     * @exception ExceptionMauvaisJour exception indiquant si le jour est icorrect (parexemple <=0 ou >31)
     * @exception ExceptionMauvaisMois exception indiquant si le mois est icorrect (parexemple <=0 ou >12)
     * @exception ExceptionMauvaiseAnnee exception indiquant si l'année est icorrecte (parexemple <0)
     */
abstract class GestAgenda {
    private static void ajouterEvenement(Agenda a) {
        String nom, txtDate, txtHeure, txtDuree;
        System.out.println("Designation ?");
        nom = IN.getString();
        System.out.println("Date ?");
        txtDate = INTemps.getTexteDate();
        System.out.println("Heure ?");
        txtHeure = INTemps.getTexteHeure();
        System.out.println("Durée ?");
        txtDuree = INTemps.getTexteDuree();
        try {
            a.ajouter(new Evenement(nom, txtDate, txtHeure, txtDuree));
            a.trier();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String arg[]) {
        char choix;
        Agenda agenda = new Agenda();
        do {
            agenda.afficher();
            System.out.print("a)jouter q)uitter ? ");
            choix = IN.getChar();
            switch(choix) {
                case 'a' : ajouterEvenement(agenda); break;
            }
        } while (choix != 'q');
    }
}
