
package primerospasos;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class ArraysBidimensionales {
    public static void main(String[] args){
        
        int [][] matriz = new int[4][5];
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[0][3]=4;
        matriz[0][4]=5;
        
        matriz[1][0]=6;
        matriz[1][1]=7;
        matriz[1][2]=8;
        matriz[1][3]=9;
        matriz[1][4]=1;
        
        matriz[2][0]=1;
        matriz[2][1]=1;
        matriz[2][2]=1;
        matriz[2][3]=1;
        matriz[2][4]=1;
        
        matriz[3][0]=1;
        matriz[3][1]=1;
        matriz[3][2]=1;
        matriz[3][3]=1;
        matriz[3][4]=1;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();

        }
        
    }
    
}
