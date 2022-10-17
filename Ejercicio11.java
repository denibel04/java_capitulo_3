/**
 * Capítulo 3
 * Ejercicio 11: Realiza un conversor de Kb a Mb.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("¿Cuántos Kb quieres pasar a Mb?");
        double kb = sc.nextDouble();

        // Mostramos por pantalla la conversión
        System.out.println(kb + "Kb son " + kb/1024 + " Mb");
        sc.close();
    }
}
