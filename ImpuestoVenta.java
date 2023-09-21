// Calculadora de Impuesto sobre la Venta:
//  Lee el precio de un producto y el porcentaje de impuesto sobre la venta, y calcula el monto del impuesto y el precio total.

import java.util.Scanner;

public class ImpuestoVenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        System.out.print("Ingrese el porcentaje de impuesto sobre la venta: ");
        double porcentajeImpuesto = input.nextDouble();
        double impuesto = (precio * porcentajeImpuesto) / 100;
        double precioTotal = precio + impuesto;
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El precio total es: " + precioTotal);
    }
}
