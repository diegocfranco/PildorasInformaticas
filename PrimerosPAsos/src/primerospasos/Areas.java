package primerospasos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class Areas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int base,altura;
        System.out.println("escoja una opcion: \n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo" );
        int figura = entrada.nextInt();
        
        switch(figura){
            
            case 1:
                base = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del lado"));
                System.out.println("el area del caudrado es "+(Math.pow(base, 2)));break;
            case 2:
                base = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la altura"));
                System.out.println("el area del rectangulo es "+(base*altura));break;         
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la altura"));
                System.out.println("el area del triangulo es "+((base*altura)/2));break;
                
            case 4:
                base = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del radio"));
                System.out.print("el area del circulo es ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(base, 2)));break;
                
        }
    }
    
}
