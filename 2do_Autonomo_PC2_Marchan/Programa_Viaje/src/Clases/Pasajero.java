
package Clases;
import javax.swing.JTextField;
public class Pasajero extends Viaje{
    int tipo;
    
    public Pasajero() {
    }

    public Pasajero(int tipo, String Nombre) {
        super(Nombre);
        this.tipo = tipo;
    }

    public double Pago(){
        double p = 0;
        switch(tipo){
            case 1: p = 60 ; break;
            case 2: p = 80 ; break;
            case 3: p = 100 ; break;
            case 4: p = 120 ; break;
            case 5: p = 90 ; break;
        }
        return p;
    }
    
    public double Igv(){
        return Pago() * 0.18;
    }
    
    public double Total(){
        return Pago() + Igv();
    }
       
    public double Descuento(){
        double des=0;
        if(tipo == 1){
            des = Pago() * 0;
        }else if(tipo == 2){
            des = Pago() * 0.30;
        }else{
            des = Pago() * 0.50;
        }
        return des;    
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
      
}
