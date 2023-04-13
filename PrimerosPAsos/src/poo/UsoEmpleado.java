package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class UsoEmpleado {
    
    public static void main(String[] args){
        /**
        Empleado empleado1 = new Empleado("Juan",5000,2000,8,9 );
        Empleado empleado2 = new Empleado("Juanito",10000 ,2023,6,8 );
        Empleado empleado3 = new Empleado("Golondrina",15000 ,2001,7,4 );
        
        empleado1.aumentoSueldo(5);
        empleado2.aumentoSueldo(5);
        empleado3.aumentoSueldo(5);
        
        System.out.println("nombre: "+empleado1.getNombre()+"sueldo: "+empleado1.getSueldo()
        +"fecha de alta "+ empleado1.getAltaContrato());
        System.out.println("nombre: "+empleado2.getNombre()+"sueldo: "+empleado2.getSueldo()
        +"fecha de alta "+ empleado2.getAltaContrato());
        System.out.println("nombre: "+empleado3.getNombre()+"sueldo: "+empleado3.getSueldo()
        +"fecha de alta "+ empleado3.getAltaContrato());
        **/
        
        Empleado[] misEmpleados=new Empleado[4];
        misEmpleados[0] = new Empleado("Juan",5000,2000,8,9 );
        misEmpleados[1] = new Empleado("Juanito",10000 ,2023,6,8 );
        misEmpleados[2] = new Empleado("Golondrina",15000 ,2001,7,4 );  
        misEmpleados[3] = new Empleado("Afonso" );
        for (int i=0;i<3;i++){
            misEmpleados[i].aumentoSueldo(5);
            System.out.println("nombre: "+misEmpleados[i].getNombre()+" sueldo: "+misEmpleados[i].getSueldo()
        +" fecha de alta "+ misEmpleados[i].getAltaContrato());    
        }
         for (Empleado e:misEmpleados){
            e.aumentoSueldo(5);
            System.out.println("nombre: "+e.getNombre()+" sueldo: "+e.getSueldo()
        +" fecha de alta "+ e.getAltaContrato());    
        }
        
    }
    
}
class Empleado{

    public Empleado(String nom,double sue,int agno,int mes,int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
        altaContrato =calendario.getTime();
  
    }
    public Empleado(String nom){
        
        this(nom,300000,2000,1,1);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }
    public void aumentoSueldo(double porcentaje){
        
        double aumento = sueldo*porcentaje/100;
        sueldo+= aumento;
                
    }

    public void setAltaContrato(Date altaContrato) {
        this.altaContrato = altaContrato;
    }
        private String nombre;
        private double sueldo;
        private Date altaContrato;
}
