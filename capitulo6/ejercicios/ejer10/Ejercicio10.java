/**
*
* Ejercicio 10 
* 
* Miguel Cedric
*/
public class Ejercicio10{
  public static void main(String[] args) {
    int r;
    int longi;
    String relleno = "";
    for(int i = 1; i <= 10; i++) {
    longi = (int)(Math.random() * 40) + 1;
    r = (int)(Math.random() * 6);
    switch(r) {
    case 0:
    relleno = "*";
    break;
    case 1:
    relleno = "-";
    break;
    case 2:
    relleno = "=";
    break;
    case 3:
    relleno = ".";
    break;
    case 4:
    relleno = "|";
    break;
    case 5:
    relleno = "@";
    break;
    default:
    }

    for(int j = 1; j <= longi; j++) {
    System.out.print(relleno);
    }
    System.out.println();
    }
  }
}
