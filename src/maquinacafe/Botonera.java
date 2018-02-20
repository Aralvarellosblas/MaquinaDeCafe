package maquinacafe;

import java.util.ArrayList;

/**
 * Clase con los botones de interaccion necesarios para la interaccion con el
 * programa
 *
 * @author Arturo
 */
public class Botonera{

    private static Producto prod=null;
    private static boolean val=false;

    /**
     * Metodo que muestra los botones disponibles y se encarga de llamar a los
     * metodos necesario de las otras clases y para el funcionamiento de la
     * accion seleccionada por el usuario
     */
    public static void botones(){

        int selec;
        do{
            selec=Integer.parseInt(Display.mensajePedir("Escoja una de las siguientes opciones:\n"
                    +"1-- Introducir dinero\n"
                    +"2-- Cantidad de azucar\n"
                    +"3-- Selecion de Producto\n"
                    +"4-- Devolver Dinero\n"
                    +"0-- Salir del programa\n"
                    +"\nCredito actual: "+Monedero.getDinero()));
            switch(selec){
                case 1:
                    Monedero.introducirDinero();
                    break;
                case 2:
                    Producto.modificarAzucar();
                    break;
                case 3:
                    ArrayList<Producto> p=Producto.añadirProducto();
                    prod=Seleccion.seleccionarProducto(p);
                    val=Monedero.validarDinero(prod);
                    Seleccion.elaborarSeleccion(prod, val);
                    break;
                case 4:
                    Monedero.devolverDinero();
                    break;
                case 0:
                    break;
                default:
                    Display.mostrarMensaje("Debe seleccionar uno de los anteriores");

            }
        }while(selec!=0);
        Display.mostrarMensaje("Que tenga un buen día");
    }
}
