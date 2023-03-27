/**
 * 
* Escribe un programa que muestre 20 notas generadas al azar. 
* Las notas deben aparecer de la forma: suspenso, suficiente, bien,
*  notable o sobresaliente. Al final aparecerá el número de suspensos, 
* el número de suficientes, el número de bienes
* 
* Miguel Cedric
*/
public class EjercicioOnce{
  public static void main(String[] args) {
    int nota;
    int sus = 0;
    int suf = 0;
    int bien = 0;
    int not = 0;
    int sob = 0;
    
    for(int i = 0; i < 20; i++) {
    nota = (int)(Math.random() * 5);
    
      switch(nota) {
      case 0:
      sus++;
      break;
      case 1:
        suf++;
      break;
      case 2:
        bien++;
      break;
      case 3:
        not++;
      break;
      case 4:
        sob++;
      break;
      default:
      }
    }
    System.out.println("En total hay  " + sus + " suspensos, " + suf + " suficientes,");
    System.out.print(" " + bien + " bien, " + not + " notables ");
    System.out.println("y " + sob + " sobresalientes");
  }
}
