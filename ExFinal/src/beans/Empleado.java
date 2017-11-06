
package beans;

public class Empleado extends Personal{
    
    //Atributos
    double pagoDia;
    int nDias;
    
    //Variables globales
    public static double smEmp=0;
    
    //Constructores

    public Empleado() {
        
    }
    public Empleado(double pagoDia, int nDias, String codPer, String nombre, int anoIng) {
        super(codPer, nombre, anoIng);
        this.pagoDia = pagoDia;
        this.nDias = nDias;
        smEmp += this.PagoTotal();
    }
    
    
    //Metodos
    public  double PagoTotal(){
        return pagoDia*nDias;
    };
    public  double Bonificacion(){
        return ((2016-super.anoIng)/5)*0.10*PagoTotal();
    };
    
    
    //Accesoeres
    
    public double getPagoDia() {
        return pagoDia;
    }

    public void setPagoDia(double pagoDia) {
        this.pagoDia = pagoDia;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }
    
    
    //Impresion
    
    
    
}
