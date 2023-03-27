/**
 * 
* Ejercicio 4
* 
* Miguel Cedric
*/
public class Ejercicio4{
  public static void main(String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    for (i = 0; i < 20; i++) {
      System.out.println(" el numero es: " + numero[i] + " el cuadrado es: " + cuadrado[i] + " el cubo es: " + cubo[i]);
    }
  }
}
