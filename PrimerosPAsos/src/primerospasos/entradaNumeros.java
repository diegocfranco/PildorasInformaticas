package primerospasos;
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class entradaNumeros {
    public static void main(String[] args){
        /**
        double x = 10000.0;
        System.out.println(x/3);
        System.out.printf("%1.2f",x/3);
        **/
        String num1= JOptionPane.showInputDialog("Ingrese un numero: ");
        double num2 = Double.parseDouble(num1);
        System.out.print("la raiz de "+num1+" es ");
        System.out.printf("%1.4f",Math.sqrt(num2));
        
    }
    
}
