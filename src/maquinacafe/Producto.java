package maquinacafe;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Producto{

    private String nombre;
    private static int cantAzuc=4;
    private float precio;

    public Producto(){
    }

    public Producto(String nombre, int cantAzuc, float precio){
        this.nombre=nombre;
        Producto.cantAzuc=cantAzuc;
        this.precio=precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public static int getCantAzuc(){
        return cantAzuc;
    }

    public static void setCantAzuc(int cantAzuc){
        Producto.cantAzuc=cantAzuc;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }
    @Override
    public String toString(){
        return ("Producto "+nombre+" Azucar "+cantAzuc+" precio "+precio);
    }
    public static ArrayList añadirProducto(){
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("Cafe", cantAzuc, 0.70f));
        productos.add(new Producto("Chocolate", cantAzuc, 1f));
        productos.add(new Producto("Te", cantAzuc, 0.50f));
        productos.add(new Producto("Capucchino", cantAzuc, 1.2f));
        return productos;
    }

    public static void modificarAzucar(){
        String respuesta=null;
        do{
            String mensaje=("Cantidad de azucar: "+cantAzuc+"/7");
            respuesta=Display.mensajePedir(mensaje+"\n\nSeleccione una opcion:\n"
                    + "Más azucar: +\n"
                    + "Menos azucar: -\n"
                    + "Salir: s");
            if(respuesta.equalsIgnoreCase("+")){
                cantAzuc++;
                if(cantAzuc>=7){
                    cantAzuc=7;
                }
            }else if(respuesta.equalsIgnoreCase("-")){
                cantAzuc--;
                if(cantAzuc<=0){
                    cantAzuc=0;
                }
            }
        }while(!"s".equals(respuesta));

    }
}
