package maquinacafe;

/**
 * Clase con los metodos necesarios para manejar el dinero del programa
 *
 * @author Arturo
 */
public class Monedero{

    private static float cambio=0, dinero=0;

    /**
     * Permite obtener el dinero insertado
     *
     * @return total del dinero
     */
    public static float getDinero(){
        return dinero;
    }

    /**
     * Permite cambiar el dinero insertado
     *
     * @param dinero nueva cantidad de dinero
     */
    public static void setDinero(float dinero){
        Monedero.dinero=dinero;
    }

    /**
     * Metodo para contar la cantidad de dinero que se introduce en la máquina
     *
     * @return Total de dinero introducido
     */
    public static float introducirDinero(){
        dinero=dinero+Float.parseFloat(Display.mensajePedir("Introduce el dinero"));
        return dinero;
    }

    /**
     * Metodo que valida si se ha introducido dinero suficiente para comprar un
     * producto determinado
     *
     * @param p objeto del la clase Producto
     * @return un valor booleano que permite verificar la cantidad de dinero
     */
    public static boolean validarDinero(Producto p){
        boolean validar=false;
        if(dinero>p.getPrecio()){
            validar=true;
            return validar;
        }else if(dinero==p.getPrecio()){
            validar=true;
            return validar;
        }else{
            return validar=false;
        }

    }

    /**
     * Metodo que calcula el cambio a devolver tras la compra del producto
     *
     * @param valor precio del producto que se compra
     */
    public static void devolverCambio(float valor){
        if(dinero>valor){
            cambio=dinero-valor;
            Display.mostrarMensaje("Su cambio son: "+cambio+"€ No se lo olvide.");
            dinero=0;
            cambio=0;
        }else{
            dinero=0;
            cambio=0;
        }
    }

    /**
     * Metodo que permite devolver el dinero antes de comprar un producto
     *
     */
    public static void devolverDinero(){
        if(dinero!=0){
            Display.mostrarMensaje("Devolviendo: "+dinero+"€");
            dinero=0;
            cambio=0;
        }else{
            Display.mostrarMensaje("No hay dinero para devolver");
            dinero=0;
            cambio=0;
        }
    }
}
