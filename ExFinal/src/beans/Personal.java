package beans;

import java.text.DecimalFormat;

public abstract class Personal {
    
    //Atributos
    String codPer;
    String nombre;
    int anoIng;
    
    
    //Variables globales
    public static int cuenta=1000;
    DecimalFormat objFormat = new DecimalFormat("##.##");
    
    //Constructores

    public Personal() {
        this.codPer = ""+(++cuenta);
    }

    public Personal(String codPer, String nombre, int anoIng) {
        this.codPer = ""+(++cuenta);
        this.nombre = nombre;
        this.anoIng = anoIng;
    }
    
    //Metodos
    public abstract double PagoTotal();
    public abstract double Bonificacion();
    public  double Afp(){
        return 0.11*PagoTotal();
    }
    public double PagoNeto(){
        return PagoTotal()+Bonificacion()-Afp();
    }
    
    //Accesores
    
    public String getCodPer() {
        return codPer;
    }

    public void setCodPer(String codPer) {
        this.codPer = codPer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoIng() {
        return anoIng;
    }

    public void setAnoIng(int anoIng) {
        this.anoIng = anoIng;
    }
    
    //Impresion del objeto

    
    public String Print(){
        String cadena = "Codigo: "+codPer+
                         "\n Nombre: "+nombre+
                         "\n Edad: "+anoIng+
                         "\n PagoTotal: "+objFormat.format(PagoTotal())+
                         "\n Bonificacion: "+objFormat.format(Bonificacion())+
                         "\n AFP: "+objFormat.format(Afp())+
                         "\n Pago Total: "+objFormat.format(PagoNeto());
        
        return cadena;
    }
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    

