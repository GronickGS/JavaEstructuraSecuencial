// Cálculo del Promedio de Tres Números:
//  Lee tres números enteros y calcula su promedio.

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = input.nextInt();
        double promedio = (num1 + num2 + num3) / 3.0;
        System.out.println("El promedio de los números es: " + promedio);
    }
}
