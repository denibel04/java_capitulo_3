/**
 * Capítulo 3
 * Ejercicio 9: Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3)πr2h
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos y calculamos el volumen
        System.out.println("¿Cuál es el radio de la base en cm?");
        double r = sc.nextDouble();
        System.out.println("¿Cuál es la altura del cono en cm?");
        double h = sc.nextDouble();

        double v = (1.0/3.0)*Math.PI*r*r*h;

        // Mostramos por pantalla el volumen del cono
        System.out.printf("El volumen del cono es de %.2f cm³", v);

        sc.close();
    }
}
