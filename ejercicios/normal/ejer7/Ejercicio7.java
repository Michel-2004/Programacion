import java.util.Scanner;
/**
 * 
* Ejercicio 7
* 
* Miguel Cedric
*/
public class Ejercicio7{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    int[] n = new int[100];
    int i;
    
    for (i = 0; i < 100; i++) {
      n[i] = (int)(Math.random() * 21);
      System.out.print(n[i] + " ");
    }
    
    System.out.println(" Introduce el numero que quieres sustituir: ");
      int numero = s.nextInt();
    System.out.println("Introduce el numero por el cual quieres sustituirlo; ");
      int numero2 = s.nextInt();
      
    for (i = 0; i < 100; i++) {
      if (n[i] == numero) {
        n[i] = numero2;
        System.out.print("\"" + n[i] + "\" ");
    } 
      else {
      System.out.print(n[i] + " ");
      }
    }
  }
}
