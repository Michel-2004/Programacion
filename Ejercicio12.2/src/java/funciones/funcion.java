/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package funciones;

/**
 *
 * @author villo
 */
public class funcion {

  private final String imagen;
  private final String piedra;
  private final String papel;
  private final String tijera;

  public funcion (String imagen, String piedra, String papel, String tijera) {
  this.imagen = imagen;
  this.piedra = "piedra";
  this.papel = "papel";
  this.tijera = "tijera";
  }

  public String getImagen() {
    return imagen;
  }
  
  public String juego1(){ 
    int i;
    i = ((int)(Math.random() * 3));
    String jugada1 = " "; 
    switch(i) {
      case 0:
        jugada1 = piedra;
      break;
      case 1:
        jugada1 = papel;
      break;
      case 2:
        jugada1 = tijera;
      break;
      default:
  }
    return  jugada1;
  }
  
   public String juego2(){ 
    int i;
    i = ((int)(Math.random() * 3));
    String jugada2 = " "; 
    switch(i) {
      case 0:
        jugada2 = piedra;
      break;
      case 1:
        jugada2 = papel;
      break;
      case 2:
        jugada2 = tijera;
      break;
      default:
  }
    return jugada2;
  }
   
   public String juego(){
     int puntos1 = 0;
     int puntos2 = 0;
     String resultado ="";
     
     if (juego1().equals(papel) && juego2().equals(papel) || juego1().equals(piedra) && juego2().equals(piedra) || juego1().equals(tijera) && juego2().equals(tijera)){
       resultado = "Empate";
     } 
     else if (juego1().equals(papel) && juego2().equals(piedra)) {
       resultado ="gana el papel";
       puntos1 += 1;
     }
     else if (juego1().equals(piedra) && juego2().equals(papel)) {
       resultado ="gana el papel";
       puntos2 += 1;
     }
     else if (juego1().equals(tijera) && juego2().equals(papel)) {
       resultado ="gana la tijera";
       puntos1 += 1;
     }
     else if (juego1().equals(papel) && juego2().equals(tijera)) {
       resultado ="gana la tijera";
       puntos2 += 1;
     }
     else if (juego1().equals(piedra) && juego2().equals(tijera)) {
       resultado ="gana la piedra";
       puntos1 += 1;
     }
     else if (juego1().equals(tijera) && juego2().equals(piedra)) {
       resultado ="gana la piedra";
       puntos1 += 1;
     }
     if (puntos1 > puntos2) {
       resultado = "gana jugador1";
     }
     else if (puntos1 < puntos2) {
       resultado = "gana jugador2";
     }
     return resultado;
   }
   
  public String imagenes(){
  return null;
  }
}