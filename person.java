package tp2exercice;
import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);

        double maxsalaire = 0;
        boolean continuer = true;

        while (continuer) {
            System.out.print("Entrer le nom : ");
            String nom = cl.nextLine();

            System.out.print("Entrer le prénom : ");
            String prenom = cl.nextLine();

            System.out.print("Entrer l'âge : ");
            int age = cl.nextInt();

            System.out.print("Entrer le salaire : ");
            double salaire = cl.nextDouble();
            cl.nextLine();

            if (salaire > maxsalaire) {
                maxsalaire = salaire;
            }

            System.out.print("Voulez-vous ajouter un autre employé : ");
            String reponse = cl.nextLine();

            if (!reponse.equalsIgnoreCase("oui")) {
                continuer = false;
            }
        }
        System.out.println("Le salaire le plus grand est : " + maxsalaire);
	}

}
