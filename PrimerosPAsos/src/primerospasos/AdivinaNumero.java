package primerospasos;
import java.util.Scanner;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class AdivinaNumero {
    
    public static void main(String[] args){
        
        int aleatorio =(int)(Math.random()*100);
        System.out.println(aleatorio);
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
        
        while(numero != aleatorio){
        
        intentos++;
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        if(numero < aleatorio){
        System.out.println("el numero es mayor");    
        }
        else if(numero > aleatorio){
        System.out.println("el numero es menor");    
        }
            
    }
       System.out.println("has adivinado el numero en "+ intentos+" intentos ");
    }
    
}
