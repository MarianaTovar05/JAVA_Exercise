public class Hipotenusa {
    public static void main(String[] args) {

        System.out.print("Ingrese el cateto a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el cateto b: ");
        double b = sc.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenusa: " + hipotenusa);

    }
}
