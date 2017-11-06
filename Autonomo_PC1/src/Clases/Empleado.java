package Clases;


public class Empleado {
    
    int codEmp;
    String nombre;
    String cedula;
    int edad;
    double salario;
    
    
    public static int cuenta=0;
    public static int smSal=0;

    
    
    
    public Empleado() {
        this.codEmp = ++cuenta;
        smSal += salario;
    }

    public Empleado(String nombre, String cedula, int edad, double salario) {
        this.codEmp = ++cuenta;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        smSal += salario;
    }
    
    public String Clasificacion()
    {   String clasif="";
        if(edad<=21)
            clasif="Principiante";
        if((edad>=22) && (edad<=35))
            clasif="Intermedio";
        if(edad>35)
            clasif="Senior";
        return clasif;
    }
    
    public double AumentaSal(double porcentaje)
    {   
        return salario*(100+porcentaje)/100;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena = "Codigo: "+codEmp+
                        "\n Nombre: "+nombre+
                        "\n Cedula: "+cedula+
                        "\n Edad: "+edad+
                        "\n Salario: "+salario;
       return cadena;
    }
    
}
