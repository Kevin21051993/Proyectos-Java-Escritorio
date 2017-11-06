package Clases;

public class Camion extends Vehiculo{
    
    double nroTonel;
    
    public static double sumaTotCamion = 0;

    public Camion(double nroTonel, int nroMat, int ano, int nroDias) {
        super(nroMat, ano, nroDias);
        this.nroTonel = nroTonel;
        sumaTotCamion += super.precioBase()+ this.Adicional(); 
    }

    public double Adicional()
    {
        return 40*nroTonel;
    }

    public double getNroTonel() {
        return nroTonel;
    }

    public void setNroTonel(double nroTonel) {
        this.nroTonel = nroTonel;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\n Adicional por Camion:"+this.Adicional();
    }
    
    
    
    
   
}
