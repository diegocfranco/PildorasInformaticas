package primerospasos;
import javax.swing.JOptionPane;


/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */

public class CompruebaEmail {
    public static void  main(String[]args){
        int arroba = 0;
        boolean punto = false;
        
        String email = JOptionPane.showInputDialog("ingrese su email: ");
        
        for(int i = 0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                arroba ++;
            }  
            if(email.charAt(i)=='.'){
                punto=true;
            }             
        }
        
        if(punto == true && arroba==1){
            System.out.println("el email es correcto");
        }
        else{
            System.out.println("el email es incorrecto");
        }    
    }
    
    
}
