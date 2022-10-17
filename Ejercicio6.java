/**
 * Capítulo 3
 * Ejercicio 6: Escribe un programa que calcule el área de un triángulo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("¿Cuál es la base en cm del triángulo?");
        double base = sc.nextDouble();
        System.out.println("¿Cuál es la altura en cm del triángulo?");
        double altura = sc.nextDouble();

        // Mostramos el area por pantalla
        System.out.println("El área del triangulo es de " + (base * altura)/2 + " cm²");

        sc.close();
    }
}