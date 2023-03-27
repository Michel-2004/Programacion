import java.util.Scanner;
/**
 * 
* Ejercicio 9
* 
* Miguel Cedric
*/
public class Ejercicio9{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    int[] n = new int[8];
    int i;
    
    
    System.out.println("Introduzca 8 numeros: ");
    for (i = 0; i < 8; i++) {
      n[i] = s.nextInt();
    }
    for (i = 0; i < 8; i++) {
      if (n[i] %2 == 0) {
      System.out.println(n[i] + " par");
      } 
      else {
      System.out.println(n[i] + " impar");
      }
    }
  }
}
