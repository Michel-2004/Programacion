/**
 * Pizarra
 * 
 * Miguel Cedric
 * 
 */
public class EjercicioPizarra1{
  public static void main(String[] args) {
    int[][] num = new int[5][10];
    int suma = 0;
    int suma2 = 0;
    
    for(int a = 0; a < 5; a++) {
      for(int b = 0; b < 10; b++) {
        num[a][b] = suma + suma2;
        System.out.printf("%6s ", num[a][b]);
        suma +=10; 
      }
      suma = 0;
      suma2 +=2;
    }
  }
}
