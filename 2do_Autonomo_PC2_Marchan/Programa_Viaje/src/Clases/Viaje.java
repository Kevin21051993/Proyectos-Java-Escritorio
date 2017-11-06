
package Clases;
public abstract class Viaje {
    
    int NroDoc;
    String Nombre;
    int Nrode;
    static int cod = 1000;

    public Viaje() {
        NroDoc = cod++;
    }

    public Viaje(String Nombre) {
        this.NroDoc = cod++;
        this.Nombre = Nombre;
    }
    
    public abstract double Pago();
    
    public abstract double Igv();
    
    public abstract double Total();
    
    ////////////////////////////////////////////////////////////////////////////

    public int getNroDoc() {
        return NroDoc;
    }

    public void setNroDoc(int NroDoc) {
        this.NroDoc = NroDoc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    ////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString(){
        String cad = "Número del Documento: " + NroDoc +
                     "\nNombre del pasajero: " + Nombre +
                     "\nPago: " + Pago() +
                     "\nIgv: " + Igv() +
                     "\nPago Total: " + Total();
        return cad;
        }
}
