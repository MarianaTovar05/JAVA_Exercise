import java.util.Scanner;
public class Billetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        int monto = sc.nextInt();
        int[] billetes = {100, 50, 20, 10, 5, 1};
        for (int billete : billetes) {
            int cantidad = monto / billete;
            if (cantidad > 0) {
                System.out.println("Billetes de $" + billete + ": " + cantidad);
                monto %= billete;
            }
        }
    }
}

