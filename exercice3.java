package tp3;
import java.util.Scanner;

public class exercice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un entier n: ");
		int n = sc.nextInt();
		int i;
        int[] T = new int[5] ;
        
        System.out.println("entrer un entier");
        int s = 0;
        
        for( i = 0; i < n; i++) {
            System.out.print("T[" + i + "]: ");
            T[i] = sc.nextInt();
        }
        s= s + T[i];
        System.out.println("la somme de tableau =: "+s);
		
	}

}
