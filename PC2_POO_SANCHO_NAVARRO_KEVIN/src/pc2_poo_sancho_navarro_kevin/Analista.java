package pc2_poo_sancho_navarro_kevin;

public class Analista extends Empleado{
    //Atributos
    int anosExp;
    int diasLab;
    //Variables globales
    public static double smPgAn=0;
    public static double smAfpAn=0;
    //Constructores
    public Analista() {
    }
    public Analista(int anosExp, int diasLab, String nombre, int edad, int sexo) {
        super(nombre, edad, sexo);
        this.anosExp = anosExp;
        this.diasLab = diasLab;
        smPgAn += super.PagoTotal();
        smAfpAn += super.Afp();
    }

    //Metodos
    public double Pago(){
        double pgxD=0,pag;
        if(anosExp<=3)
            pgxD=100;
        if(anosExp>=4 && anosExp<=8)
            pgxD=140;
        if(anosExp>8)
            pgxD=180;
        pag= pgxD*diasLab;
        return pag;
    }
    
    //Accesores
    public int getAnosExp() {
        return anosExp;
    }
    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }
    public int getDiasLab() {
        return diasLab;
    }
    public void setDiasLab(int diasLab) {
        this.diasLab = diasLab;
    }
    
    //Impresion del objeto

    
    
}
