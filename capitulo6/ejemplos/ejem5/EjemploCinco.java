/**
 * Numeros aleatorios
 *
 * Miguel Cedric
 */

public class EjemploCinco {
  public static void main(String[] args){
   
   for (int i = 1; i < 16; i++)
   {
     System.out.print( (int)(Math.random()*11 + 50) + " ");
   }
    System.out.println();
  }
}
