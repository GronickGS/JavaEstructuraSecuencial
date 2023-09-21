
// Calculadora de Suma:
//  Escribe un programa que solicite dos números al usuario y muestre la suma de los mismos.

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}
