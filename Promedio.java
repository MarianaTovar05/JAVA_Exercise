import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tres números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double promedio = (a + b + c) / 3;
        System.out.println("Promedio: " + promedio);
    }
}  
