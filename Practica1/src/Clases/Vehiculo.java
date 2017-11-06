package Clases;

public class Vehiculo {
    
    int codVeh;
    int nroMat;
    int ano;
    int nroDias;
            
    public static int cuenta = 1;

    public Vehiculo() {
        this.codVeh = cuenta++;
    }

    public Vehiculo(int nroMat, int ano, int nroDias) {
        this.codVeh = cuenta++;
        this.nroMat = nroMat;
        this.ano = ano;
        this.nroDias = nroDias;
    }
    
    
    public double precioBase(){
        return 60*nroDias;
    }

    
    
    public int getNroMat() {
        return nroMat;
    }

    public void setNroMat(int nroMat) {
        this.nroMat = nroMat;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNroDias() {
        return nroDias;
    }

    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }
    
   
    
    @Override
    public String toString() {
        String cad = "#Vehiculo:"+codVeh + 
                    "\n No Matricula:"+nroMat+
                    "\n Ano:" + ano+
                    "\n Nro Dias de Alquiler:" + nroDias;
        return cad;
    }
    
    
    
    
    
}
