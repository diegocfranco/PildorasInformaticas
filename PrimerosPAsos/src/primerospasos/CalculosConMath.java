
package primerospasos;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class CalculosConMath {
    public static void main(String[] args) {
    /** int raiz =Math.sqrt(9.0); no se puede ya que es double y almacena en int
        double raiz =Math.sqrt(9.0);
        System.out.println("la raiz es "+ raiz);
    
    double num1 = 3.43F;
    int resultado = (int)Math.round(num1);
    System.out.println(resultado);
    **/
    double base = 5;
    double exponente = 3;
    int resultado = (int)Math.pow(base,exponente);
    System.out.println("El resultado de "+base+" elevado a la "+exponente+" es "+ resultado);
    
    
    }
    
}
