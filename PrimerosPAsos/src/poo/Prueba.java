package poo;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class Prueba {
     public static void main(String[] args){
         Empleado empleado1= new Empleado("Ana");
         Empleado empleado2= new Empleado("Paco");
         empleado2.setSeccion("RRHH");
         //empleado2.setNombre("paca");
         //System.out.println(empleado1.devuelveDatos());
         //System.out.println(empleado2.devuelveDatos());
         System.out.println(empleado1.devuelveDatos() +"\n"+ empleado2.devuelveDatos()+"\n"+Empleado.getIdSiguiente());
         
     }
    
         
}
class Empleado{
    private final String  nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=1;
    
    
    public String getNombre() {
        return nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
    public String devuelveDatos(){
        
        return "el nombre es "+nombre+" y la seccion es "+seccion+" y su id es "+id;
    }
    
    public static String getIdSiguiente(){
        
        return "el id siguiente es "+ idSiguiente;
    }
    
    public Empleado(String nom){
        nombre=nom;
        seccion="Administracion";
        id=idSiguiente;
        idSiguiente++;
        
        
    }
    
    
    
}
