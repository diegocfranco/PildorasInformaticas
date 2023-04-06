
package primerospasos;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class ManipulaCadenasII {
    public static void main(String[] args){
        String frase = "Hoy es un dia espectacular para aprender Java";
        String resumenFrase = frase.substring(0, 31)+" ir por una pizza"+frase.substring(31, 45);
        System.out.println(resumenFrase);
    }
    
}
