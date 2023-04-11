package poo;
import javax.swing.JOptionPane;
/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class UsoCoche {
    
    public static void main (String[] args){
        
        Coche Renault = new Coche();
        System.out.println("este coche tiene " + Renault.getRuedas() + " ruedas");
        Renault.setColor(JOptionPane.showInputDialog("introduce un color"));
        System.out.println("mi coche tiene color " + Renault.getColor());
        Renault.setColor(JOptionPane.showInputDialog("introduce el nuevo color"));
        System.out.println("mi coche ahora tiene color " + Renault.getColor());
        System.out.println(Renault.getInfoCoche());
        Renault.setAsientosCuero(true);
        Renault.setAireAcondicionado(true);
        System.out.println(Renault.dimePesoTotal());
        System.out.println(Renault.dimePreciFinal());
        
       
        
    }
    
}
