/**
 * Pizarra
 * 
 * Miguel Cedric
 * 
 */
public class EjercicioPizarra2{
  public static void main(String[] args) {
    int x = 11;
    int y = 10;
    int[][] num = new int[x][y];
    int suma = 0;
    int mult = 1;
    
    for(int a = 0; a < x; a++) {
      for(int b = 0; b < y; b++) {
        num[a][b] = suma;
        System.out.printf("%6s ", num[a][b]);
      }
      suma ++;
    }
    for(int a = 0; a < x; a++) {
      for(int b = 0; b < y; b++) {
        num[a][b] = suma * mult;
        System.out.printf("%6s ", num[a][b]);
      }
      mult++;
    }
  }
}
