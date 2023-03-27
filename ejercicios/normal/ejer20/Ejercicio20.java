import java.util.Scanner;
/**
 * 
* Ejercicio 20
* 
* Miguel Cedric
*/
public class Ejercicio20{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("introduce el nombre de los reyes: ");
    int n = Integer.parseInt(s.nextLine());
    String[] reyes = new String[n];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    for (int i = 0; i < n; i++) {
    reyes[i] = s.nextLine();
    }
    for (int i = 0; i < n; i++) {
    int orden = 1;
    for (int j = 0; j < i; j++) {
    if (reyes[i].equals(reyes[j])) {
    orden++;
    }
    }
    System.out.println(reyes[i] + " " + orden + "º");
    }
  }
}
