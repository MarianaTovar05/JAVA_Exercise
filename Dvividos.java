import java.util.Scanner;
public class Dvividos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese su edad en años: ");
    int edad = sc.nextInt();

    int dias = edad * 365;
    System.out.println("Ha vivido aproximadamente " + dias + " días.");
}
}