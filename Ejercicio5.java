/**
 * Capítulo 3
 * Ejercicio 5: Escribe un programa que calcule el área de un rectángulo.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("¿Cuál es el ancho en cm del rectángulo?");
        double ancho = sc.nextDouble();
        System.out.println("¿Cuál es el alto en cm del rectángulo?");
        double alto = sc.nextDouble();

        // Mostramos el area por pantalla
        System.out.println("El área del triangulo es de " + (ancho * alto) + " cm²");

        sc.close();
    }
}
