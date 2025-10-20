package exercice2;
//bech nimporti classe scanner bech na9raa mel clavier
import java.util.Scanner;
public class nombre {
	//methode principale bech exécuter lel prgrm
	public static void main(String[] args) {
		//cration objet scanner bech na9ra les entrés saisit par l'utilisateur
        Scanner a = new Scanner(System.in);
        System.out.println("saisir un nombre");
        int nbr = a.nextInt();
        if(nbr==(int)nbr) {
        	System.out.println("c'est un nombre entier"+nbr);
        }else{
        	System.out.println("error");
        }
        if(nbr%2== 0){
            System.out.println("Le nombre  "+nbr+" pair.");
        }else{
            System.out.println("Le nombre  "+nbr+" impair.");
        }
        
	}

}
