import java.util.Scanner;
/**
 * 
* Ejercicio 10
* 
* Miguel Cedric
*/
public class Ejercicio10{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    int[] n = new int[20];
    int pares = 0;
    int[] par = new int[20];
    int impares = 0;
    int[] impar = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      n[i] = (int)(Math.random()*101);
      if (n[i] %2 == 0) {
      par[pares] = n[i];
      pares++;
      } 
      else {
      impar[impares] = n[i];
      impares++;
      }
    }
    System.out.println("array original:");
  for (i = 0; i < 20; i++) {
  System.out.print(n[i] + " ");
  }
  System.out.println();

  for (i = 0; i < pares; i++) {
  n[i] = par[i];
  }
  for (i = pares; i < 20; i++) {
  n[i] = impar[i - pares];
  }
  
  System.out.println("array con los pares al inicio:");
  for (i = 0; i < 20; i++) {
  System.out.print(n[i] + " ");
  }
  }
}
