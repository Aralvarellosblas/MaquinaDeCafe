package maquinacafe;

import javax.swing.JOptionPane;

/**
 * Clase con los metodos para mostrar mensajes a traves de pantalla
 *
 * @author Arturo
 */
public class Display{

    /**
     * Metodo que muestra un mensaje por pantalla
     *
     * @param mensaje mensaje a moostrar
     */
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Metodo que pide un dato lo recoje y lo devuleve
     *
     * @param mensaje mensaje que se muestra
     * @return dato recogido
     */
    public static String mensajePedir(String mensaje){
        String valor=JOptionPane.showInputDialog(mensaje);
        return valor;
    }

}
