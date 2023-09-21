// Conversión de Kilómetros a Millas:
//  Pide al usuario una distancia en kilómetros y conviértela a millas (1 km = 0.621371 millas).

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la distancia en kilómetros: ");
        double kilometros = input.nextDouble();
        double millas = kilometros * 0.621371;
        System.out.println("La distancia en millas es: " + millas);
    }
}
