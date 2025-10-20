package tp2;
//bech nimporti classe scanner bech na9raa mel clavier
import java.util.Scanner;
//declaration les attributs
public class rectangle {
	double longueur;
    double largeur;
  //declaration constructeur de la classe
public rectangle(double longueur, double largeur ){
	this.longueur=longueur;
	this.largeur=largeur;	 
}
public double calsurface() {
	return longueur * largeur ;
}
        

}
