package tp2;
import java.util.Scanner;
public class test {
	//methode principale bech executer lel prgrm
	public static void main(String[] args) {
		//cration objet scanner bech na9ra les entrés saisit par l'utilisateur
        Scanner a = new Scanner(System.in);
        System.out.print("saisir le rayon du cercle : ");
        double r = a.nextDouble();
        //crer objet cercle saisit mel clavier
        cercle c=new cercle(r);
        System.out.println("La surface du cercle est : " + c.calsurf());
        System.out.println("saisir le langueur");
        double langueur=a.nextDouble();
        System.out.println("saisir le largeur");
        double largeur=a.nextDouble();
        //crer un objet rectangle saisit ml clavier 
        rectangle x=new rectangle(langueur,largeur);
        System.out.println("la surface de ractangle"+x.calsurface());
	}

}
