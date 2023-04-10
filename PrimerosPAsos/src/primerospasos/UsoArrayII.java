package primerospasos;
import javax.swing.JOptionPane;


/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class UsoArrayII {
    public static void main(String[] args){
        
        int [] matrizAleatorios = new int[150];
        
        for(int i=0;i<matrizAleatorios.length;i++){
            matrizAleatorios[i]=(int)Math.round(Math.random()*100);
        }
        
        for(int numeros:matrizAleatorios){
            System.out.print(numeros+" ");
            
        }
        
        /**
        String [] paises = new String[8];
        paises[0] = "Colombia" ;
        paises[1] = "España";
        paises[2] = "Mexico";
        paises[3] = "Guatemala";
        paises[4] = "Ecuador";
        paises[5] = "Argentina";
        paises[6] = "Peru";
        paises[7] = "Panama";
        
        for(int i=0;i<paises.length;i++){
            System.out.println((i+1)+". "+paises[i]);
        }
        //String [] paises2={"chile","uruguay","paraguay","honduras"};
        
        String [] paises = new String[4];
        for(int i=0;i<paises.length;i++){
            paises[i]=JOptionPane.showInputDialog("Ingrese un pais:" );
                  
                                         
        }
        
        for(String i:paises){
            System.out.println("pais:" +i);
        }**/
    }    
}
          


        
 