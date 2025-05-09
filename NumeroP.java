import java.util.Scanner;

public class NumeroP {
    public static void main(String[] args) {             
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");    
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }                                       
    }
}
    
