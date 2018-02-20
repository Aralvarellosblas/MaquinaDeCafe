package maquinacafe;

import java.util.ArrayList;


/**
 *
 * @author Arturo
 */
public class Seleccion{

    private static  Producto prod;

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

    public static void elaborarSeleccion(Producto pr, boolean v){
        if(v==true){
            v=false;
            Display.mostrarMensaje("Elaborando el producto: "+pr.getNombre()+"\nPor favor Espere\n"
                    + "******\n"
                    + "******\n"
                    + "******\n"
                    + "Producto terminado");
            Monedero.devolverCambio(pr.getPrecio());
        }else Seleccion.mostrarPrecio(pr);
        
    }
    public static void mostrarPrecio(Producto pr){
        Display.mostrarMensaje("Valor de producto: "+pr.getNombre()+", "+pr.getPrecio()+"€");
    }
}
