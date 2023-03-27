/**
 * 
* Escribe un programa que muestre 20 notas generadas al azar. 
* Las notas deben aparecer de la forma: suspenso, suficiente, bien,
* notable o sobresaliente. Al final aparecerá el número de suspensos, 
* el número de suficientes, el número de bienes
* 
* Miguel Cedric
*/
public class EjercicioTrece{
  public static void main(String[] args) {
    int dado1;
    int dado2;
      do {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      System.out.println("primer dado "+ dado1 + " segundo dado " + dado2);
      } 
      while (dado1 != dado2);
  }
}
