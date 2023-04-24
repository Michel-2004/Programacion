package capitulo10;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Gestisimal {
    public static void main(String[] args) {
        HashMap<String, Integer> lineasFra = new HashMap<String, Integer>();
        int opcion;
        int opcion2;
        int i;
        int stockIntro;
        int unidades = 0;
        int unidadesEnFactura = 0;
        double precioDeCompraIntro;
        double precioDeVentaIntro;
        double subtotal;
        double baseImponible;
        double totalFactura;
        String codigo;
        String codigoIntro = "";
        String descripcionIntro;
        String precioDeCompraIntroString;
        String precioDeVentaIntroSttring;
        String stockIntroString;;
    
    //Crea el array de artículos
    ArrayList<Articulo> array =new ArrayList<Articulo>();
    
    // Menu
    do {
        
        System.out.println("\n\nG E S T I S I M A L");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
        System.out.print("Introduzca una opción: ");
        opcion = Integer.parseInt(System.console().readLine());
        Object precioDeVentaIntroString;
        switch (opcion) {
        // LISTADO //////////////////////////////////////////////////////////////////
        case 1:
            System.out.println("\nLISTADO");
            System.out.println("=======");
            for(i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
        }
        break;
        case 2: // Alta ////////////////////////////////////////////////
            System.out.println("\nNUEVO ARTÍCULO\n==============");
            System.out.println("Por favor, introduzca los datos del artículo.");
            System.out.print("Código: ");
            do {
                codigoIntro = System.console().readLine();
                    if (posicion(codigoIntro, array) != -1) {
                    System.out.print("Ese código ya existe.\nIntroduzca otro código: ");
                }
            } while (posicion(codigoIntro, array) != -1);
            System.out.print("Descripcion: ");
            descripcionIntro = System.console().readLine();
            System.out.print("Precio de compra: ");
            precioDeCompraIntro = Double.parseDouble(System.console().readLine());
            System.out.print("Precio de venta: ");
            precioDeVentaIntro = Double.parseDouble(System.console().readLine());
            System.out.print("Stock: ");
            stockIntro = Integer.parseInt(System.console().readLine());
            array.add(new Articulo(codigoIntro, descripcionIntro, precioDeCompraIntro, precioDeVentaIntro, stockIntro));
        break;
        case 3: // Baja ////////////////////////////////////////////////
            System.out.println("\nBAJA\n====");
            System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
            codigoIntro = System.console().readLine();
            if (posicion(codigoIntro, array) == -1) {
                System.out.println("Lo siento, el código introducido no existe.");
            } else {
                array.remove(posicion(codigoIntro, array));
                System.out.println("articulo borrado.");
            }
        break;
        case 4: // Modificación ////////////////////////////////////////
        System.out.println("\nMODIFICACIÓN\n============");
        System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
        do {

         codigoIntro = System.console().readLine();
            if (posicion(codigoIntro, array) != -1) {
                System.out.println("No hay ningún artículo con ese código.\nIntroduzca otro código: ");
            }
        } while (posicion(codigoIntro, array) == -1);
            i = posicion(codigoIntro, array);
            System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
            System.out.println("Código: " + array.get(i).getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntro = System.console().readLine();
            if (!codigoIntro.equals("")) {
                array.get(i).setCodigo(codigoIntro);
            }
            System.out.println("Descripción: " + array.get(i).getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntro = System.console().readLine();
            if (!descripcionIntro.equals("")) {
                array.get(i).setDescripcion(descripcionIntro);
            }
            System.out.println("Precio de compra: " + array.get(i).getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            precioDeCompraIntroString = System.console().readLine();
            if (!precioDeCompraIntroString.equals("")) {
             array.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroString));
            }
            System.out.println("Precio de venta: " + array.get(i).getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            precioDeVentaIntroString = System.console().readLine();
            if (!precioDeVentaIntroString.equals("")) {
             array.get(i).setPrecioDeVenta(Double.parseDouble((String) precioDeVentaIntroString));
            }
            System.out.println("Stock: " + array.get(i).getStock());
            System.out.print("Nuevo stock: ");
            stockIntroString = System.console().readLine();
            if (!stockIntroString.equals("")) {
              array.get(i).setStock(Integer.parseInt(stockIntroString));
        }
        break;
        case 5: // Entrada de mercancía //////////////////////////////
            System.out.println("\nENTRADA DE MERCANCÍA\n====================");
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntro = System.console().readLine();
            do {
                codigoIntro = System.console().readLine();
            if (posicion(codigoIntro, array) != -1) {
             System.out.println("No hay ningún artículo con ese código.\nIntroduzca otro código: ");
            }
            } while (posicion(codigoIntro, array) == -1);
            i = posicion(codigoIntro , array);
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(array.get(i));
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntro = Integer.parseInt(System.console().readLine());
            array.get(i).setStock(stockIntro + array.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
        break;
        case 6: // Venta
            System.out.println("\nVENTA\n=====");
            do {
                System.out.println("\n1. Añadir artículo");
                System.out.println("2. Generar factura");
                System.out.println("3. Cancelar");
                System.out.print("Introduzca una opción: ");
            opcion2 = Integer.parseInt(System.console().readLine());
            switch (opcion2) {
            case 1: // Añadir línea ////////////////////////////
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntro = System.console().readLine();
            i = posicion(codigoIntro , array);
            if (i == -1) {
                System.out.println("No hay ningún artículo con ese código.");
            } else {
                System.out.println(array.get(i));
            if (lineasFra.containsKey(codigoIntro)) {
                unidadesEnFactura = lineasFra.get(codigoIntro);
            } else {
                unidadesEnFactura = 0;
            }
            System.out.println("Unidades en la factura provisional: " + unidadesEnFactura);
            System.out.print("Unidades que quiere incorporar a la factura: ");
            unidades = Integer.parseInt(System.console().readLine());
            if ((array.get(i).getStock()) - unidadesEnFactura < unidades) {
                System.out.println("No hay suficiente stock. Puede añadir a la venta un máximo de " + (array.get(i).getStock() - unidadesEnFactura) + " unidades de ese producto.");
            } else 
             if (lineasFra.containsKey(codigoIntro)) {
                lineasFra.put(codigoIntro, lineasFra.get(codigoIntro) + unidades);
            } else {
             lineasFra.put(codigoIntro, unidades);
            }
            }
            // Muestra las líneas
            System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIOUNID. | SUBTOTAL");
            System.out.println("------------------------------------------------------------------");
            for (Map.Entry pareja: lineasFra.entrySet()) {
            codigo = pareja.getKey().toString();
            i = posicion(codigo, array);
            unidades = Integer.parseInt(pareja.getValue().toString());
            subtotal = unidades * array.get(i).getPrecioDeVenta();
            System.out.printf(" %6s | %17s | %8d | %12.2f | %8.2f\n", codigo, array.get(i).getDescripcion(), unidades, array.get(i).getPrecioDeVenta(), subtotal);
            }
            break;
            case 2: // Genera la factura ///////////////////////
            baseImponible = 0;
            System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIOUNID. | SUBTOTAL");
            System.out.println("----------------------------------------------------------------");
            for ( Map.Entry pareja: lineasFra.entrySet()) {
            codigo = pareja.getKey().toString();
            i = posicion(codigo , array);
            unidades = Integer.parseInt(pareja.getValue().toString());
            subtotal = unidades * array.get(i).getPrecioDeVenta();
            System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\n", codigo, array.get(i).getDescripcion(), unidades, array.get(i).getPrecioDeVenta(), subtotal);
            baseImponible += subtotal;
            array.get(i).setStock(array.get(i).getStock() - unidades); 
            }
            System.out.println("----------------------------------------------------------------");
            System.out.printf(" BASE IMPONIBLE: %8.2f \n", baseImponible);
            System.out.printf(" IVA (21%): %8.2f \n", baseImponible * 0.21);
            System.out.printf(" TOTAL: %8.2f \n", baseImponible * 1.21);
            System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menú principal.");
            System.console().readLine();
            break;
            } // switch (venta)
            } while (opcion2 == 1);
        break;
        } // switch (menú principal)
        } while (opcion != 7);
        } // main
        static public int posicion(String codigo, ArrayList<Articulo> array) {
        int i = -1;
            for (Articulo aux : array) {
            i++;
                if (aux.getCodigo().equals(codigo)) {
                return i;
                }
            }
        return -1; 
    }
}

