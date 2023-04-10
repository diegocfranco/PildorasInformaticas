package primerospasos;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class EjemploArray2D {
    public static void main(String[] args){
        double acumulado;
        double interes = 0.1;
        double [][]saldo = new double[6][5];
        for(int i=0;i<6;i++){
            saldo[i][0]=10000;
            acumulado= 10000;
            for(int j=1;j<5;j++){
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
            }
            interes=interes+0.01;
        }
        
    for(int i=0;i<6;i++){
        for(int j=0;j<5;j++){
            System.out.printf("%1.2f",saldo[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }  
        
    }
    
}
