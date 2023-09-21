// Conversión de Días a Años y Meses:
//   Lee un número de días e imprime cuántos años y meses equivalen.

import java.util.Scanner;

public class DiasAAñosMeses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de días: ");
        int dias = input.nextInt();
        int anos = dias / 365;
        int meses = (dias % 365) / 30;
        System.out.println("Equivalente a " + anos + " años y " + meses + " meses.");
    }
}
