package primerospasos;
import java.util.Scanner;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class EvaluaEdad {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite su edad: ");
        int edad = entrada.nextInt();
        
        if(edad <18){
            System.out.println("usted es un adolecente");
        }
        else if(edad<40){
            System.out.println("eres joven");
        }
        else if (edad < 60){
            System.out.println("eres Maduro");
        }
        else{
            System.out.println("cuidate");
        }
           
    }
    
}
