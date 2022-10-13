/**
 * Capítulo 3
 * Ejercicio 1:Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos las variables
        System.out.println("Introduzca los dos números que quiera multiplicar");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        // Mostrar por pantalla el resultado de la multiplicación
        System.out.println(num1 + " × " + num2 + " = " + num1*num2);

        sc.close();

    }
}
