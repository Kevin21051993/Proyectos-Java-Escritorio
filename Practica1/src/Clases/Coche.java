
package Clases;

public class Coche extends Vehiculo{
    
    
    public static double sumaTotCoche = 0;

    public Coche(int nroMat, int ano, int nroDias) {
        super(nroMat,ano,nroDias);
        sumaTotCoche += super.precioBase()+ this.Adicional(); 
    }
    
    public double Adicional()
    {
        return 5*super.nroDias;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\n Adicional por Coche:"+Adicional();
    }
    
}
