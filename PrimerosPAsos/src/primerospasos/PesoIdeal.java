package primerospasos;
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class PesoIdeal {
   public static void main(String[] args){
       
       String genero;
       int altura,pesoIdeal=0;
       do{
           genero=JOptionPane.showInputDialog("introduce tu genero: (F/M)");
         }while((genero.equalsIgnoreCase("F") == false) && ((genero.equalsIgnoreCase("M")==false)));
       
           altura = Integer.parseInt(JOptionPane.showInputDialog("ingrese su altura en cm "));
           
           if(genero.equalsIgnoreCase("F")){
               
               pesoIdeal= altura-120;
               
           }
           else if(genero.equalsIgnoreCase("M")){
               
               pesoIdeal= altura-110;
           }
           System.out.println("su peso ideal es " +pesoIdeal+"kg" );
           
       
   } 
}
