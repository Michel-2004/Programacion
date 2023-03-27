import java.util.Scanner;
/**
* 
* Ejercicio 6
* 
* Miguel Cedric
*/
public class Ejercicio6{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("introduce 1 numeros y presiona enter para continuar con el resto: ");
    int[] n = new int[15];
    int i;
    
    for (i = 0; i < 15; i++)
    {
      n[i] = s.nextInt();
    }
    
    int aux = n[14];
    
    for (i = 14; i > 0; i--)
    {
      n[i] = n[i-1];
    }
    
    n[0] = aux;
    
    for (i = 0; i < 15; i++) {
    System.out.print(" " + n[i]);
    }
  }
} 
