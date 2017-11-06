
package Clases;

public class Microbus extends Vehiculo{
    
    double kilometros;
    public static double sumaTotMicro = 0;

    public Microbus(double kilometros,int nroMat, int ano, int nroDias) {
        super(nroMat,ano,nroDias);
        this.kilometros = kilometros;
        sumaTotMicro += super.precioBase()+ this.Adicional(); 
    }
    
    public double Adicional()
    {
        return 10*(kilometros/15);
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Adicional por Microbus:"+this.Adicional();
    }
    
    
    
}
