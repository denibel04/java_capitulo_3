/**
 * Capítulo 3
 * Ejercicio 12:Realiza un programa que calcule la nota que hace falta sacar en el segundo examen
 * de la asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota
 * del primer examen cuenta el 40% y la del segundo examen un 60%.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("¿Qué sacaste en el primer examen?");
        double nota1 = sc.nextDouble();
        System.out.println("¿Qué media te gustaría tener?");
        double media = sc.nextDouble();

        // Calculamos la nota que debería sacar en el segundo examen
        double nota2 = (media - nota1*0.4)/0.6;

        // Sacamos por pantalla los datos
        System.out.printf("Para tener una media de %.2f necesitas sacar %.2f puntos en el segundo examen", media, nota2);

        sc.close();
    }
}


