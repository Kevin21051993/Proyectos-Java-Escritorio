package pc2_poo_sancho_navarro_kevin;

public class Programador extends Empleado{
    //Atributos
    double hrs;
    
    //Variables globales
    public static double smPgProg=0;
    public static double smAfpProg=0;
    //Constructores
    public Programador() {
    }
    public Programador(double hrs, String nombre, int edad, int sexo) {
        super(nombre, edad, sexo);
        this.hrs = hrs;
        smPgProg += super.PagoTotal();
        smAfpProg += super.Afp();
    }

    //Metodos
    public double Pago(){
        double pgxH=0,pag;
        if(super.Clasificacion().equals("Principiante"))
            pgxH=10;
        if(super.Clasificacion().equals("Intermedio"))
            pgxH=15;
        if(super.Clasificacion().equals("Senior"))
            pgxH=20;
        pag= pgxH*hrs;
        return pag;
    }
    
    //Accesores
    public double getHrs() {
        return hrs;
    }
    public void setHrs(double hrs) {
        this.hrs = hrs;
    }
    
    //Impresion del objeto
    
    
}
