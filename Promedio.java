public class Promedio {
    public static void main(String[] args) {  

        System.out.print("Ingrese tres números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double promedio = (a + b + c) / 3;
        System.out.println("Promedio: " + promedio);
    }
}  
