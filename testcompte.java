package tp4j;
import java.util.Scanner;
public class testcompte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		compte moncompte = new compte(5000.567);
		compte Ali = new compte(5000.567);
		System.out.println("Opérations sur le compte");
        moncompte.afficher();
        System.out.println("entrer le montant desirer");
        Double depot=sc.nextDouble();
        moncompte.deposer(depot);
        System.out.println("entrer le montant desirer POUR RETIRER");
        Double retirer=sc.nextDouble();
        moncompte.retirer(retirer);
        System.out.println("entrer le montant desirer pour virer");
        Double virement=sc.nextDouble();
        moncompte.virer(virement,Ali);
        moncompte.afficher();
        Ali.afficher();
	}

}
