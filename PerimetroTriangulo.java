// Cálculo del Perímetro de un Triángulo:
//  Solicita al usuario las longitudes de los tres lados de un triángulo y calcula su perímetro.

import java.util.Scanner;

public class PerimetroTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = input.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = input.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = input.nextDouble();
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }
}
