/**
* 
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la mediade esos númeross
*
* Miguel Cedric
*/
public class EjercicioCinco{
  public static void main(String[] args) {
    int numeros;
    int max = 100;
    int min = 199;
    int suma = 0;
    for (int i = 1; i <= 50; i++)
    {
      numeros = (int)((Math.random()*200)+100);
      System.out.print(numeros + " ");
      suma += numeros;
      if (numeros < min) {
        min = numeros;
      }
      if (numeros > max) {
        max = numeros;
      }
    }
    System.out.println("  El mas pequenos es "+ min);
    System.out.println("El mas grande es " + max);
  }
}
