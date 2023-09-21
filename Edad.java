// Calculadora de Edad:
//  Lee el año de nacimiento de una persona y calcula su edad.

import java.util.Scanner;
import java.time.LocalDate;

public class Edad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el año de nacimiento: ");
        int yearOfBirth = input.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearOfBirth;
        System.out.println("La edad es: " + age);
    }
}
