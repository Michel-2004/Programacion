package capitulo14.ejercicio7;

public class ExpocochesCampanillas {
    public static void main(String[] args) {
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    int opcion = 0;
    int opcion2 = 0;
    int n = 0;
    do {
    System.out.println("\n\nEXPOCOCHES CAMPANILLAS");
    System.out.println("1. Mostrar número de entradas libres");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    System.out.println("Elige una opción: ");
    try{
    opcion = Integer.parseInt(System.console().readLine());
    if (opcion == 1) {
    System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
    System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
    System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
    }
    if (opcion == 2) {
    System.out.println("\n\n1. Principal");
    System.out.println("2. Compra-venta");
    System.out.println("3. Vip");
    System.out.print("Elige la zona para la que quieres comprar las entradas: ");
    opcion2 = Integer.parseInt(System.console().readLine());
    System.out.print("¿Cuántas entradas quieres? ");
    n = Integer.parseInt(System.console().readLine());
    switch (opcion2) {
    case 1:
    principal.vender(n);
    break;
    case 2:
    compraVenta.vender(n);
    break;
    case 3:
    vip.vender(n);
    break;
    default:
    }
    }
    }
    catch (Exception e){
        System.out.print("El dato introducido no es correcto, debe ser un número.");
        System.out.println(" Por favor, inténtelo de nuevo.");
        
    }   
    } while (opcion < 3); // menú principal
    }
    }