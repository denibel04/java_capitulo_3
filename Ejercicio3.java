/**
 * Capítulo 3
 * Ejercicio 3: Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir las pesetas
        System.out.println("¿Cuántos pesetas quiere convertir a euros?");
        Float pesetas = sc.nextFloat();
        Double euros = pesetas*0.006;

        // Mostrar por pantalla la conversión a euros
        System.out.printf("%.2f pesetas equivalen a %.2f euros", pesetas, euros);

        sc.close();

    }
}
