/**
 * Numeros aleatorios
 *
 * Miguel Cedric
 */

public class EjemploCuatro {
  public static void main(String[] args){
   
   for (int i = 1; i < 16; i++)
   {
     System.out.print( (int)(Math.random()*10 + 1) + " ");
   }
    System.out.println();
  }
}
