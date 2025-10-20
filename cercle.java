package tp2;
//bech nimporti classe scanner bech na9raa mel clavier
import java.util.Scanner;
//declaration les attributs
public class cercle {
	 double rayon;
	 //final=constante
	 final double PI=3.14;
//declaration constructeur de la classe
public cercle(double rayon) {
	this.rayon=rayon;
}
//methode
public double calsurf() {
	return PI * rayon * rayon;
}
	
}


