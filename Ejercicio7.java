/**
 * Capítulo 3
 * Ejercicio 7: Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir la base imponible y calcular el total de la factura
        System.out.println("¿Cuál es el precio sin IVA?");
        Float baseimp = sc.nextFloat();
        Double factura = baseimp*1.21;

        // Mostrar por pantalla la factura
        System.out.printf("El total de la factura asciende a %.2f euros", factura);

        sc.close();

    }
}
