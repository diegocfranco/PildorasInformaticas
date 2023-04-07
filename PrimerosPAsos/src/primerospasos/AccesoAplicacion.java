package primerospasos; 
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class AccesoAplicacion {
    public static void main(String[] arg){
        
        String clave = "juan";
        String password = "";
        
        while (clave.equals(password)==false){
            
            password = JOptionPane.showInputDialog("Ingrese su contraseña :");
            if(clave.equals(password)==false){
                System.out.println("clave Incorrecta" );
            }
            
        }
        System.out.println("contraseña correcta,bienvenido" );
        
    }
    
}
