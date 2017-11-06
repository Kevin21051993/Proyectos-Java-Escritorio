package Clases;

public class Seguro {
    int codPac;
    String nombre;
    int tipo;
    int sexo;  //1=masculino  0=femenino
    double gasto;
    //----------------------------------------------------------------------------------------------------------------------------------------------
    //Variables que se usarán en al programa
    static int cuenta=1001;      
    public static double sumaDesc=0;
    public static double sumaPagosTot=0;

    public Seguro() {
        codPac=++cuenta;
        sumaDesc += Descuento();
        sumaPagosTot += TotalPagar();
    }

    public Seguro(String nombre, int tipo, int sexo, double gasto) 
    {
        codPac=++cuenta;
        this.codPac = codPac;
        this.nombre = nombre;
        this.tipo = tipo;
        this.sexo = sexo;
        this.gasto = gasto;
        sumaDesc += Descuento();
        sumaPagosTot += TotalPagar();
    }

    public double Descuento()
    {   double desc=0;
        switch(tipo)
        {    
            case 1: desc=0.10*gasto;
            case 2: desc=0.15*gasto;    
            case 3: desc=0.20*gasto;
            case 4: desc=0.00*gasto; 
        }
        return desc;
    }
    public double TotalPagar()
    {
        return (gasto-Descuento());
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }
    
    
    @Override
    public String toString() {
        String sex;
        if(sexo==1)
            sex="Masculino";
        else
            sex="Femenino";
        
        String cadena=  "Codigo:"+codPac+
                        "\n Nombre:"+nombre+
                        "\n Tipo:"+tipo+
                        "\n Sexo:"+sex+
                        "\n Gasto:"+gasto+
                        "\n Descuento:"+Descuento()+
                        "\n Total a Pagar:"+TotalPagar();
        return cadena;
    }
    
    
}
