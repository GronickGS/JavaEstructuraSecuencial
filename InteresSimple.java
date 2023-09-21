// Calculadora de Interés Simple:
//  Pide al usuario el principal, la tasa de interés y el tiempo en años, y calcula el interés simple.
import java.util.Scanner;

public class InteresSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el principal: ");
        double principal = input.nextDouble();
        System.out.print("Ingrese la tasa de interés (porcentaje): ");
        double tasaInteres = input.nextDouble();
        System.out.print("Ingrese el tiempo en años: ");
        int tiempoAnos = input.nextInt();
        double interes = (principal * tasaInteres * tiempoAnos) / 100;
        System.out.println("El interés simple es: " + interes);
    }
}
