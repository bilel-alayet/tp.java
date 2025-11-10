package tp4j;

public class testrectangle {
	public static void main(String[] args) {
        
        Rectangle monRectangle = new Rectangle(15.0, 7.5);
        
        monRectangle.afficher();
        Double surface = monRectangle.surface();
        Double perimetre = monRectangle.perimetre();
        
        System.out.println("La surface du rectangle est : " + surface);
        System.out.println("Le perimetre du rectangle est : " + perimetre);
    }

}
