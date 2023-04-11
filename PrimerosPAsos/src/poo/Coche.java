package poo;

/**
 * @author Juan Diego Castaño
 * juan.diego.castano@correounivalle.edu.co
 */
public class Coche {

    private int ruedas;
    private int ancho;
    private int largo;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean AsientosCuero,aireAcondicionado;
    
    
    public String getInfoCoche(){
        
        return "la plataforma del vehiculo tiene "+ruedas+" ruedas, mide "+
                (largo/1000)+" metros y un ancho de "+ancho+"  cm de ancho";
    }
    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return pesoPlataforma;
    }

    public void setPeso(int peso) {
        this.pesoPlataforma = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        color = "azul";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String dimePesoTotal(){
        int pesoCarroceria=500;
        pesoTotal=pesoCarroceria+pesoPlataforma;
        if(AsientosCuero==true){pesoTotal+=50;}
        if(aireAcondicionado==true){pesoTotal+=20;}
        
        return "el peso total del coche es: "+pesoTotal;
        
    }
    
        public String dimePreciFinal(){
        int precioFinal=10000;
        if(AsientosCuero==true){precioFinal+=2000;}
        if(aireAcondicionado==true){precioFinal+=1500;}
        
        return "el precio total del coche es: "+precioFinal;
        
    }

    public boolean isAsientosCuero() {
        return AsientosCuero;
    }

    public void setAsientosCuero(boolean AsientosCuero) {
        this.AsientosCuero = AsientosCuero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    
    public Coche(){
        ruedas = 4;
        ancho = 300;
        largo = 2000;
        motor = 1600;
        pesoPlataforma = 500;  
    }
    
}
