package primerospasos;
import java.util.Scanner;
/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */

public class EntradaEjemploI {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("digite su edad: ");
        int edad = entrada.nextInt();
        System.out.println("hola "+nombre+"el proximo año tendras "+(edad+1)+" años");
        
        
    }
    
}
