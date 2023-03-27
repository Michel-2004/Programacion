/**
* 
* Muestra por pantalla 20 numeros aleatorios entre el 0 y el 10 
* separados por espacios
*
* Miguel Cedric
*/
public class EjercicioCuatro{
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++)
    {
      System.out.print((int)((Math.random()*10)+1)+ " ");
    }
  }
}
