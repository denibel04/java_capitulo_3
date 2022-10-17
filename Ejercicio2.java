/**
 * Capítulo 3
 * Ejercicio 2: Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir los euros
        System.out.println("¿Cuántos euros quiere convertir a pesetas?");
        Double euros = sc.nextDouble();
        Double pesetas = euros*166.3860;

        // Mostrar por pantalla la conversión a pesetas
        System.out.printf("%.2f euros equivalen a %.2f pesetas", euros, pesetas);

        sc.close();
    }
}
