package maquinacafe;

import java.util.ArrayList;

/**
 *
 * Clase con los metodos necesarios para trabajar con los productos de la maquina de cafe
 *
 * @author Arturo
 */
public class Producto{

    private String nombre;
    private static int cantAzuc=4;
    private float precio;

    /**
     * Constructor por defecto para un objeto de la clase producto
     *
     */
    public Producto(){
    }

    /**
     * Constructor con valores para la clase producto
     *
     * @param nombre nombre del producto
     * @param cantAzuc cantidad de azucar estática del producto
     * @param precio valor del producto
     */
    public Producto(String nombre, int cantAzuc, float precio){
        this.nombre=nombre;
        Producto.cantAzuc=cantAzuc;
        this.precio=precio;
    }

    /**
     * Permite obtener el nombre del producto
     *
     * @return Nombre del producto
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Permite cambiar el nombre del producto
     *
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * Permite obtener la cantidad de azucar del producto
     *
     * @return cantidad de azucar
     */
    public static int getCantAzuc(){
        return cantAzuc;
    }

    /**
     * Permite cambiar la cantidad de azucar del producto
     *
     * @param cantAzuc nueva cantidad de azucar
     */
    public static void setCantAzuc(int cantAzuc){
        Producto.cantAzuc=cantAzuc;
    }

    /**
     * Permite obtener el precio del producto
     *
     * @return pecio del producto
     */
    public float getPrecio(){
        return precio;
    }

    /**
     * Permite cambiar el precio del producto
     *
     * @param precio nuevo precio del producto
     */
    public void setPrecio(float precio){
        this.precio=precio;
    }

    /**
     * genera un String con informacion sobre el producto
     *
     * @return String del producto
     */
    @Override
    public String toString(){
        return ("Producto "+nombre+" Azucar "+cantAzuc+" precio "+precio);
    }

    /**
     * Crea un ArrayList con los productos disponibles, sus precios y la
     * cantidad de azucar
     *
     * @return SrrayList con los productos
     */
    public static ArrayList añadirProducto(){
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("Cafe", cantAzuc, 0.70f));
        productos.add(new Producto("Chocolate", cantAzuc, 1f));
        productos.add(new Producto("Te", cantAzuc, 0.50f));
        productos.add(new Producto("Capucchino", cantAzuc, 1.2f));
        return productos;
    }

    /**
     * Permite cambiar la cantidad de azucar del producto
     *
     */
    public static void modificarAzucar(){
        String respuesta=null;
        do{
            String mensaje=("Cantidad de azucar: "+cantAzuc+"/7");
            respuesta=Display.mensajePedir(mensaje+"\n\nSeleccione una opcion:\n"
                    +"Más azucar: +\n"
                    +"Menos azucar: -\n"
                    +"Salir: s");
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
