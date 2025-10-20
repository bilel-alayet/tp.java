package exercice3;
import java.util.Scanner;
public class annéebissextille {
    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire l'entrée utilisateur
        Scanner a = new Scanner(System.in);
        int annee;

        System.out.print("Saisir une année : ");
        annee = a.nextInt();

        // Vérification si l'année est bissextile
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
    }
}

