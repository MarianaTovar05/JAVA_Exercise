import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número (5): ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número (6): ");
        int num2 = sc.nextInt();

        System.out.println("La suma es " + (num1 + num2));
    }
}
