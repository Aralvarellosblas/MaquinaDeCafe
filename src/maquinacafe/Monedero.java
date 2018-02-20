package maquinacafe;

/**
 *
 * @author Arturo
 */
public class Monedero{

    private static float cambio=0, dinero=0;

    public static float getDinero(){
        return dinero;
    }

    public static void setDinero(float dinero){
        Monedero.dinero=dinero;
    }
    
    public static float introducirDinero(){
        dinero=dinero+Float.parseFloat(Display.mensajePedir("Introduce el dinero"));
        return dinero;
    }

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
