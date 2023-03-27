/**
* 
* Muestra por pantalla una carta de la baraja francesa al azar
*
* Miguel Cedric
*/
public class EjercicioTres {
  public static void main(String[] args) {
  int tirada =(int)((Math.random()*8)+2);
   if (tirada == 1)
   {
     int letra;
     letra = (int)(Math.random()*3);
     switch (letra)
     {
       case 0:
         System.out.print("Sota");
         break;
        case 1:
         System.out.print("Caballo");
         break;
        case 2:
         System.out.print("Rey");
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
         System.out.print(" Oros");
         break;
        case 1:
         System.out.print(" Copas");
         break;
        case 2:
         System.out.print(" Bastos");
         break;
        case 3:
         System.out.print(" Espadas");
         break;
       default:
     }
  }
}
