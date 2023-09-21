// Conversión de Celsius a Fahrenheit:
//  Lee una temperatura en grados Celsius e imprime la equivalente en grados Fahrenheit.

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
