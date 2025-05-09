import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Tarifa por hora: ");
        double tarifa = sc.nextDouble();

        double salario;
        if (horas <= 40) {
            salario = horas * tarifa;
        } else {
            int extras = horas - 40;
            salario = 40 * tarifa + extras * tarifa * 1.5;
        }

        System.out.println("Salario total: $" + salario);
    }
}
