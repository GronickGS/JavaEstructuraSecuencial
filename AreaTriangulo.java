// Cálculo del Área de un Triángulo:
// Pide al usuario la base y la altura de un triángulo y calcula su área.

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
