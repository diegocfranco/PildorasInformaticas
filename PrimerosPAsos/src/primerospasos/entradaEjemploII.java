package primerospasos;
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class entradaEjemploII {
    public static void main(String[] args){
        
        String nombre = JOptionPane.showInputDialog("ingrese su nombre");
        String edad = JOptionPane.showInputDialog("ingrese su edad");
        int edadUsario = Integer.parseInt(edad);
        edadUsario++;
        System.out.println("Hola "+nombre+" su edad el otro año es "+edadUsario);
    }
    
}
