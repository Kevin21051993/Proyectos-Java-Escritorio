package beans;

public class Telefono {
    
    String numTel;
    String nombCli;
    int tipo;
    int cantidad;

    public Telefono() {
    }
    public Telefono(String numTel, String nombCli, int tipo, int cantidad) {
        this.numTel = numTel;
        this.nombCli = nombCli;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    //--------------------------------------------------------------------------
    public String TipoU(){
        String tipoCad="";
        switch(tipo){
            case 1: tipoCad="Local";break;
            case 2: tipoCad="Extranjero";break;
            case 3: tipoCad="Movile";break;
        }
        return tipoCad;
    }
    public double Pago(){
        double pago=0;
        switch(tipo){
            case 1: pago=0.20*cantidad;break;
            case 2: pago=0.40*cantidad;break;
            case 3: pago=0.50*cantidad;break;
        }
        return pago;
    }
    public double IGV(){
        return 0.18*Pago();
    }
    public double Total(){
        return Pago()+IGV();
    }
    //--------------------------------------------------------------------------
    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getNombCli() {
        return nombCli;
    }

    public void setNombCli(String nombCli) {
        this.nombCli = nombCli;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
