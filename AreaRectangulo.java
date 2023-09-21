// Calculadora de Área de un Rectángulo:
//  Pide al usuario la base y la altura de un rectángulo y calcula su área.

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = input.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
