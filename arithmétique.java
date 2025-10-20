package exercice4;
import java.util.Scanner;

public class arithmétique {
    public static void main (String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Donner a: ");
        double a = ent.nextDouble();
        System.out.print("Donner b: ");
        double b = ent.nextDouble();
        System.out.print("Donner op: ");
        String op = ent.next();
        double result = 0;
        switch(op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("operation invalide");
                return;
        }
        System.out.println(result);
    }
}

