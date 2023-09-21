// Cálculo del Volumen de una Esfera:
//  Solicita al usuario el radio de una esfera y calcula su volumen (fórmula: V = (4/3) * π * r^3).

import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = input.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
