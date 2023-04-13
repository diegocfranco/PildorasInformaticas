package poo;


/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class Furgoneta extends Coche{
    
    private int capacidadCarga;
    private int plazasExtra;
    
    public Furgoneta(int capacidadCarga,int plazasExtra){
        
        super();
        this.capacidadCarga=capacidadCarga;
        this.plazasExtra=plazasExtra;
        
    }
    public String GetInfoFurgoneta(){
        
        return "la capacidad de carga es "+capacidadCarga+" kg  y las plazas extra son "+plazasExtra;
        
    }
}
