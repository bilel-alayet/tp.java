package tp3;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = {12, 4, 25, 12, 8, 30, 4, 15};
        int dernierin = -1;
        
        System.out.println("le tableau est: " + java.util.Arrays.toString(tab));
        System.out.print("entrer un entier ");
        int recherche = sc.nextInt();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == recherche) {
                dernierin = i;
            }
        }
        if (dernierin != -1) {
            System.out.println("L'entier " + recherche + " appartient au tableau.");
            System.out.println("le dernier indice " + recherche + " est: " + dernierin); // Display the last index [cite: 16]
        } else {
            System.out.println("L'entier " + recherche + " N'appartient au tableau.");
        }
    }
}