/**
* 
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total 
*
* Miguel Cedric
*/
public class EjercicioUno {
  public static void main(String[] args) {
  System.out.println("Muestra tres tiradas de dados");
  int tirada;
  int suma = 0;
  for (int i = 1; i < 4; i++) {
  tirada = (int)(Math.random()*7);
  System.out.println(tirada + " ");
  suma += tirada; 
  }
  System.out.println("Suma= "+ suma);
  }
}
