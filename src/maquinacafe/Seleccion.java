package maquinacafe;

import java.util.ArrayList;

/**
 * Clase con los metodos necesarios para elegir un producto y
 * fabricarlo
 *
 * @author Arturo
 */
public class Seleccion{

    private static Producto prod;

    /**
     * Metodo que nos permite escoger un producto de los disponibles en la
     * maquina
     *
     * @param p un ArrayList con los productos de la maquina
     * @return el producto elegido por el usuario
     */
    public static Producto seleccionarProducto(ArrayList<Producto> p){
        String sel=Display.mensajePedir("Elegir un Producto: "
                +"\nCafe"
                +"\nChocolate"
                +"\nTe"
                +"\nCapucchino");
        for(int i=0; i<p.size(); i++){
            if(p.get(i).getNombre().equalsIgnoreCase(sel)){
                prod=p.get(i);
            }
        }
        return prod;
    }

    /**
     * Metodo que elabora el producto seleccionado por el usuario si se ha
     * introducido el dinero suficiente y si no muestra el precio de dicho
     * producto
     *
     * @param pr producto selecionado por el usuario
     * @param v variable de validacion del credito
     */
    public static void elaborarSeleccion(Producto pr, boolean v){
        if(v==true){
            v=false;
            Display.mostrarMensaje("Elaborando el producto: "+pr.getNombre()+"\nPor favor Espere\n"
                    +"******\n"
                    +"******\n"
                    +"******\n"
                    +"Producto terminado");
            Monedero.devolverCambio(pr.getPrecio());
        }else{
            Seleccion.mostrarPrecio(pr);
        }

    }

    /**
     * Metodo que muestra el precio de un producto determinado
     *
     * @param pr producto selecionado por el usuario
     */
    public static void mostrarPrecio(Producto pr){
        Display.mostrarMensaje("Valor de producto: "+pr.getNombre()+", "+pr.getPrecio()+"€");
    }
}
