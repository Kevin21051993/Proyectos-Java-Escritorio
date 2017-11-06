package Clases;

public class Programador extends Empleado{
    
    int codProg;
    int anoExp;
    String leng;
    
    
    public static int cuenta=0;
    public static int smSal=0;

    public Programador() {
        this.codProg = ++cuenta;
        super.codEmp = ++Empleado.cuenta;
        smSal += salario;
    }

    public Programador(int anoExp, String leng, String nombre, String cedula, int edad, double salario) {
        super(nombre, cedula, edad, salario);
        this.codProg = ++cuenta;
        super.codEmp = ++Empleado.cuenta;
        this.anoExp = anoExp; 
        this.leng = leng; 
        smSal += salario;
    }

    public int getAnoExp() {
        return anoExp;
    }

    public void setAnoExp(int anoExp) {
        this.anoExp = anoExp;
    }

    public String getLeng() {
        return leng;
    }

    public void setLeng(String leng) {
        this.leng = leng;
    }
    
    @Override
    public String toString() {
        String cadena = "Codigo: "+codProg+
                        "\n Nombre: "+super.nombre+
                        "\n Cedula"+super.cedula+
                        "\n Edad"+super.edad+
                        "\n Salario"+super.salario+
                        "\n Anos de experiencia: "+anoExp+
                        "\n Lenguaje que domina: "+leng;
       return cadena;
    }
    
}
