// Conversión de Dólares a Euros:
//  Lee una cantidad en dólares y conviértela a euros (1 dólar = 0.85 euros).

import java.util.Scanner;

public class DolaresAEuros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = input.nextDouble();
        double euros = dolares * 0.85;
        System.out.println("La cantidad en euros es: " + euros);
    }
}
