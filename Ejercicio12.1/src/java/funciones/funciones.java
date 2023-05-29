/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package funciones;

/**
 *
 * @author villo
 */
public class funciones {

private final String nombre;
private final String imagen;
public funciones (String nombre, String imagen) {
this.nombre = nombre;
this.imagen = imagen;
}
public String getNombre() {
  return nombre;
}
public String getImagen() {
  return imagen;
}
@Override
public String toString() {
  return "<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Hola, soy " + nombre + "&nbsp;</div></div>";
}

  public String frase() {
  int i;
  i = ((int)(Math.random() * 6));
  String frases = " "; 
  switch(i) {
    case 0:
      frases = "Me gusta el rock";
    break;
    case 1:
      frases = "Me voy a dormir";
    break;
    case 2:
      frases = "ESTO ES ESPARTA";
    break;
    case 3:
      frases = "Me gusta el patinaje sobre hielo";
    break;
    case 4:
      frases = "No se me ocurre nada mas";
    break;
    case 5:
      frases = "Mañana llueve";
    break;
  default:
  }
  return "<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;" + frases + "&nbsp;</div></div>";
}
}