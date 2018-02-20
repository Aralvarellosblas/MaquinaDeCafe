package maquinacafe;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Display {
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public static String mensajePedir(String mensaje){
        String valor=JOptionPane.showInputDialog(mensaje);
        return valor;
    }
    
}
