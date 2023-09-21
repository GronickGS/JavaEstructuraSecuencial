// Cálculo del Tiempo de Caída de un Objeto:
//  Solicita al usuario la altura desde la que cae un objeto y calcula el tiempo que tarda en caer (asumiendo caída libre).

import java.util.Scanner;

public class TiempoCaida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la altura desde la que cae el objeto (en metros): ");
        double altura = input.nextDouble();
        double tiempo = Math.sqrt((2 * altura) / 9.8);
        System.out.println("El tiempo de caída es: " + tiempo + " segundos.");
    }
}
