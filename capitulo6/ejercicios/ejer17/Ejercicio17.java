/**
* 
* Ejercicio 17
* 
* Miguel Cedric
*/
public class Ejercicio17{
  public static void main(String[] args) {
    System.out.print("introduzca la altura de la pecera, como mínimo 4: ");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("introduzca la anchura, como mínimo 4: ");
    int ancho = Integer.parseInt(System.console().readLine());
    int posicion = 0;
    int posicionPez = (int)(Math.random()*(alto - 2)*(ancho - 2));
    for(int i = 0; i < ancho; i++) {
    System.out.print("*");
    }
    System.out.println();
    for(int i = 2; i < alto; i++) {
    System.out.print("*"); 
    for(int j = 2; j < ancho; j++) {
    if (posicion == posicionPez) {
    System.out.print("&");
    } else {
    System.out.print(" ");
    }
    posicion++;
    }
    System.out.println("*"); 
    } 
    for(int i = 0; i < ancho; i++) {
    System.out.print("*");
    }
  }
}
