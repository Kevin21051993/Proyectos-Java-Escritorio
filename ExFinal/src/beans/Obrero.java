
package beans;

public class Obrero  extends Personal{
    

//Atributos
    double horasSem;
    int seccion;
    
    //Variables globales
    public static double smObre=0;
    
    //Constructores
    
    public Obrero() {
    }

    public Obrero(double horasSem, int seccion, String codPer, String nombre, int anoIng) {
        super(codPer, nombre, anoIng);
        this.horasSem = horasSem;
        this.seccion = seccion;
        smObre += this.PagoTotal();
    }

    
    //Metodos
    public  double PagoTotal(){
        double pagHor=0,pagTot=0;
        if(seccion==1){
            pagHor=11;
            pagTot= pagHor*horasSem*4;
        }
        if(seccion==2){
            pagHor=14;
            pagTot= pagHor*horasSem*4;
        }
        if(seccion==3){
            pagHor=18.5;
            pagTot= pagHor*horasSem*4;
        }
        return pagTot;
    };
    public  double Bonificacion(){
        return ((2016-super.anoIng)/3)*0.08*PagoTotal();
    };
    
    
    //Accesoeres
    
    
    public double getHorasSem() {
        return horasSem;
    }

    public void setHorasSem(double horasSem) {
        this.horasSem = horasSem;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }
    
    
    //Impresion
    
    
    

}
