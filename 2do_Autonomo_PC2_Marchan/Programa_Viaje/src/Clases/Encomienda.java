
package Clases;
import javax.swing.JTextField;
public class Encomienda extends Viaje{
    String Destinatario;
    double Pesokilos;

    public Encomienda() {
    }

    public Encomienda(String Destinatario, int Nrode, double Pesokilos, String Nombre) {
        super(Nombre);
        this.Destinatario = Destinatario;
        this.Pesokilos = Pesokilos;  
        this.Nrode = Nrode;
    }

    public double Pago(){
        int pk = 0;
        switch(Nrode){
            case 1: pk = 15 ; break;
            case 2: pk = 18 ; break;
            case 3: pk = 20 ; break;
            case 4: pk = 23 ; break;
            case 5: pk = 21 ; break;
        }
        return pk * Nrode;
    }
    
    public double Igv(){
        return Pago() * 0.18;
    }
    
    public double Total(){
        return Pago() + Igv();
    }   

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public double getPesokilos() {
        return Pesokilos;
    }

    public void setPesokilos(double Pesokilos) {
        this.Pesokilos = Pesokilos;
    }
    
    
    
}
