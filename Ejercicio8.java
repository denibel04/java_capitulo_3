/**
 * Capítulo 3
 * Ejercicio 8: Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Preguntamos las horas trabajadas
        System.out.println("¿Cuántas horas trabajaste esta semana?");
        int horas = sc.nextInt();

        // Mostramos por pantalla el salario
        System.out.println("Tu salario semanal es de " + horas*12 + " euros");

        sc.close();

    }
}
