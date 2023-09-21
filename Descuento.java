// Calculadora de Descuento:
// Lee el precio original y el porcentaje de descuento, y calcula el precio con descuento y el monto ahorrado.

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = input.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = input.nextDouble();
        double descuento = (precioOriginal * porcentajeDescuento) / 100;
        double precioConDescuento = precioOriginal - descuento;
        System.out.println("El precio con descuento es: " + precioConDescuento);
        System.out.println("El monto ahorrado es: " + descuento);
    }
}
