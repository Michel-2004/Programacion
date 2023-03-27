import java.util.Scanner;
/**
 * 
* Ejercicio 13
* 
* Miguel Cedric
*/
public class Ejercicio13{
  public static void main(String[] args) {
    int[] n = new int[100];
    int max = 0;
    int min = 100;
    for (int i = 0; i < 100; i++) {
    n[i] = (int)(Math.random() * 501);
    if (n[i] < min) {
    min = n[i];
    }
    if (n[i] > max) {
    max = n[i];
    }
    }

    for (int elemento : n) {
    System.out.print(elemento + " ");
    }
    System.out.print(" ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());
    int destacado;
    if (opcion == 1) {
    destacado = min;
    } 
    else {
    destacado = max;
    }
    System.out.println();

    for (int elemento : n) {
    if (elemento == destacado) {
    System.out.print(" **" + elemento + "** ");
    } else {
    System.out.print(elemento + " ");
    }
  }
  }
}
