import java.util.Scanner;
/**
 * 
* Ejercicio 3
* 
* Miguel Cedric
*/
public class Ejercicio3{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("introduce 1 numeros y presiona enter para continuar con el resto: ");
    int[] n = new int[10];
    int i;
    
    for (i = 0; i < 10; i++)
    {
      n[i] = s.nextInt();
    }
    for (i = 9; i >= 0; i--) {
      System.out.println("los numeros al contrario son " + n[i]);
    }
  }
}
