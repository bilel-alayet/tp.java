package tp4j;

public class Rectangle {
	public double longueur;
	public double largeure;
	public Rectangle(double longueur, double largeur) {
		this.longueur=longueur;
		this.largeure=largeur;
	}

	public double surface(double longueur,double largeure) {
		return this.longueur * this.largeure;
	}
	public Double perimetre() { 
       
        return 2 * (this.longueur + this.largeure);
	}
	public void afficher() { 
        System.out.println("longueur : " + this.longueur);
        System.out.println("Largeur  : " + this.largeure);
        System.out.println("Surface  : " + this.surface(longueur, largeure));
        System.out.println("Périmètre: " + this.perimetre());
    }
	
	

}
