package tp3;
import java.util.Scanner;

public class exercice4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un entier n: ");
		int n = sc.nextInt();
		int i;
        int[] T = new int[5] ;
        
        System.out.println("entrer un entier");
        for( i = 0; i < n; i++) {
            System.out.print("T[" + i + "]: ");
            T[i] = sc.nextInt();
        }
        int s =0;
        int maximum = T[0];
		int minimum = T[0];
        for( i = 0; i < n; i++) {
        	s= s + T[i];
            System.out.println("la somme de tableau =: "+s);
            if(T[i]>maximum) {
            	maximum = element;
            }
            if(T[i]>maximum) {
            	minimum = element;
            }
        }
        System.out.println("La plus grande valeur : " + maximum);
        System.out.println("La plus petite valeur : " + minimum);
        double moyenne = (double) somme / n;
	}

}
