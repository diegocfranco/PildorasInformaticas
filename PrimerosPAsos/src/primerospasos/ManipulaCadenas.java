package primerospasos;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */

public class ManipulaCadenas {
    public static void main(String[] args){
        String nombre = "Juan";
        int ultimaLetra = nombre.length();
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("y mi nombre tiene "+nombre.length()+" caracteres");
        System.out.println("la primera letra de mi nombre "+nombre+" es: "+nombre.charAt(0));
        System.out.println("la ultima letra de mi nombre "+nombre+" es: "+nombre.charAt(ultimaLetra-1));
        

    }
    
}
