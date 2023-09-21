// Cálculo del Área de un Círculo
//  Solicita al usuario el radio de un círculo y calcula su área.

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
