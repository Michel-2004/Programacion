import java.util.Scanner;
/**
* 
* Escribe un programa que piense un número al azar entre 0 y 100. 
* El usuario debe adivinarlo y tiene para ello 5 oportunidades
* Miguel Cedric
*/
public class EjercicioSeis{
  public static void main(String[] args) {
    int solucion = (int)(Math.random()*100);
    Scanner s = new Scanner(System.in);
    System.out.print("Di un numero del uno al cien ");
    int respuesta = s.nextInt();
    int intento = 1;
    for (int i = 1; i < 5; i++)
    {
      if (respuesta == solucion){
        System.out.println("Felicidades has adivinado que era el numero " + solucion);
        i= i + 4;
      }
      else
      {
        intento = i + 1;
        System.out.println("Vas por el intento "+ intento );
        System.out.print("Di un numero del uno al cien ");
        respuesta = s.nextInt();
      }
      if (intento >= 5)
      {
        System.out.println("El numero es "+ solucion );
      }
    }
  }
}
