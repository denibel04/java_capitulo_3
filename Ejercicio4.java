/**
 * Capítulo 3
 * Ejercicio 4: Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos dos números
        System.out.println("Introduzca los dos números que quiera sumar, restar, multiplicar y dividir");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Mostramos por pantalla las operaciones
        System.out.println(x + " + " +  y +  " = " + (x + y) );
        System.out.println(x + " - " +  y +  " = " + (x - y) );
        System.out.println(y + " - " +  x +  " = " + (y - x) );
        System.out.println(x + " × " +  y +  " = " + (x * y) );
        System.out.println(x + " / " +  y +  " = " + ((float)x / y) );
        System.out.println(y + " / " +  x +  " = " + ((float) y / x) );
        sc.close();

    }
}



