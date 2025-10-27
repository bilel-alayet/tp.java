package tp3;

import java.util.Scanner;
import java.util.*;

public class TABLEAU {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] T = new int[5] ;
        
        System.out.println("entrer un entier");
        
        for( i = 0; i < 5; i++) {
            System.out.print("T[" + i + "]: ");
            T[i] = sc.nextInt();
        }
        
        for( i = 0; i <5; i++) {
            System.out.println("T[" + i + "] = " + T[i]);
        }
    }
}