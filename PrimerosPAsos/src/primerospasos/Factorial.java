package primerospasos;
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */

public class Factorial {
    public static void main(String[] args){
        Long resultado = 1L;
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        
        for(int i = numero; i>0;i--){
            
            resultado = i* resultado;
            
        }
        System.out.println("el facrorial es : "+ resultado);
    }
    
}
