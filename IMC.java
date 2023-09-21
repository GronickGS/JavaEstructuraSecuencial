//Cálculo del IMC (Índice de Masa Corporal):
//  Lee el peso en kilogramos y la altura en metros de una persona, y calcula su IMC (IMC = peso / altura^2).

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = input.nextDouble();
        System.out.print("Ingrese la altura en metros: ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("El IMC es: " + imc);
    }
}
