/**
* 
* Muestra por pantalla una carta de la baraja francesa al azar
*
* Miguel Cedric
*/
public class EjercicioDos {
  public static void main(String[] args) {
  int tirada =(int)((Math.random()*9)+1);
   if (tirada == 1)
   {
     int letra;
     letra = (int)(Math.random()*4);
     switch (letra)
     {
       case 0:
         System.out.print("J");
         break;
        case 1:
         System.out.print("K");
         break;
        case 2:
         System.out.print("Q");
         break;
        case 3:
         System.out.print("A");
         break;
       default:
     }
   }
   else
   {
    System.out.print(tirada);
   }
        int carta =(int)(Math.random()*4);
      switch (carta)
     {
       case 0:
         System.out.print(" Corazones");
         break;
        case 1:
         System.out.print(" Treboles");
         break;
        case 2:
         System.out.print(" Picas");
         break;
        case 3:
         System.out.print(" Diamantes");
         break;
       default:
     }
  }
}
