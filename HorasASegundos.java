// Conversión de Horas a Segundos:
// Lee una cantidad de horas y conviértela a segundos (1 hora = 3600 segundos).

import java.util.Scanner;

public class HorasASegundos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas: ");
        double horas = input.nextDouble();
        double segundos = horas * 3600;
        System.out.println("La cantidad en segundos es: " + segundos);
    }
}
