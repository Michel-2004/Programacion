/**
* 
* Ejercicio 19
* 
* Miguel Cedric
*/
public class Ejercicio19{
  public static void main(String[] args) {
    int num;
    int maxPar = -100;
    int minImpar = 200;
    int sum = 0;
    for (int i = 0; i < 50; i++) {
    num = (int)(Math.random() * 301) - 100;
    System.out.print(num + " ");
    if (num % 2 == 0) {
    if (num > maxPar) maxPar = num;
    } else {
    if (num < minImpar) minImpar = num;
    }
    sum += num;
    }
    System.out.println("Máximo de los pares: " + maxPar);
    System.out.println("Mínimo de los impares: " + minImpar);
    System.out.println("Media: " + sum / 50);
  }
}
