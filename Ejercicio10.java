/**
 * Capítulo 3
 * Ejercicio 10: Realiza un conversor de Mb a Kb.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("¿Cuántos Mb quieres pasar a Kb?");
        double mb = sc.nextDouble();

        // Mostramos por pantalla la conversión
        System.out.println(mb + "Mb son " + mb*1024 + " Kb");
        sc.close();
    }
}
