// Cálculo de la Hipotenusa de un Triángulo Rectángulo:
//  Lee las longitudes de los dos catetos de un triángulo rectángulo y calcula la longitud de la hipotenusa (Teorema de Pitágoras).

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = input.nextDouble();
        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = input.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
    }
}
