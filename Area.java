import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);

        sc.close();
    }
}
