import java.util.Scanner;
/**
* 
* Ejercicio 27
* 
* Miguel Cedric
*/
public class Ejercicio27{
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Turno del jugador, introduzca piedra, papel o tijera: ");
  String jugador = s.nextLine();
  int mano = (int) (Math.random() * 3);
  String maquina = "";
  switch (mano) {
  case 0:
  maquina = "piedra";
  break;
  case 1:
  maquina = "papel";
  break;
  case 2:
  maquina = "tijera";
  break;
  default:
  }
  System.out.println("Turno del la maquina: " + maquina);
  if (jugador.equals(maquina)) {
  System.out.println("empate");
  } else {
  int ganador = 2;
  switch (jugador) {
  case "piedra":
  if (maquina.equals("tijera")) {
  ganador = 1;
  }
  break;
  case "papel":
  if (maquina.equals("piedra")) {
  ganador = 1;
  }
  break;
  case "tijera":
  if (maquina.equals("papel")) {
  ganador = 1;
  }
  break;
  default:
  }
  if (ganador == 1) {
  System.out.println("Gana el jugador");
  } else {
  System.out.println("Gana la maquina");
  }
  }
  }
}
