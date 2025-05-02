public class Valores {
        public static void main(String[] args) {
            System.out.print("Ingrese el primer número (a): ");
            int a = sc.nextInt();
    
            System.out.print("Ingrese el segundo número (b): ");
            int b = sc.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
    
            System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    
        }
    }
    
