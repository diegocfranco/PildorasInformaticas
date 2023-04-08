package primerospasos;
import javax.swing.JOptionPane;


/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */

public class CompruebaEmail {
    public static void  main(String[]args){
        boolean arroba = false;
        
        String email = JOptionPane.showInputDialog("ingrese su email: ");
        
        for(int i = 0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                arroba=true;
            }   
        }
        
        if(arroba==true){
            System.out.println("el email es correcto");
        }
        else if(arroba==false){
            System.out.println("el email es incorrecto");
        }    
    }
    
    
}
