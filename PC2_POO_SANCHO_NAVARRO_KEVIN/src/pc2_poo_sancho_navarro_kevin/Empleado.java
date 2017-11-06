
package pc2_poo_sancho_navarro_kevin;

import java.text.DecimalFormat;

public abstract class Empleado {
    //Atributos
    int codigo;
    String nombre;
    int edad;
    int sexo;
    
    //Variables globales
    public static int cuenta = 1000;
    DecimalFormat objFormat = new DecimalFormat("##.##");
    
    //Constructores
    public Empleado() {
        this.codigo = ++cuenta;
    }
    public Empleado(String nombre, int edad, int sexo) {
        this.codigo = ++cuenta;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Métodos
    public String Clasificacion(){
        String clasif="";
        if(edad<=21)
            clasif="Principiante";
        if((edad>=22) && (edad<=35))
            clasif="Intermedio";
        if(edad>35)
            clasif="Senior";
        return clasif;
    }
    
    public abstract double Pago();
    
    public double Afp(){
        return 0.11*Pago();
    }
    public double PagoTotal(){
        return Pago()-Afp();
    }
    
    //Accesores
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    //Impresion del objeto
    public String Print(){
        String sex;
        if(sexo==1)
            sex="Masculino";
        else
            sex="Femenino";
        String cadena = "Codigo: "+codigo+
                         "\n Nombre: "+nombre+
                         "\n Edad: "+edad+
                         "\n Sexo: "+sex+
                         "\n Clasificacion: "+Clasificacion()+
                         "\n Pago: "+objFormat.format(Pago())+
                         "\n AFP: "+objFormat.format(Afp())+
                         "\n Pago Total: "+objFormat.format(PagoTotal());
        
        return cadena;
    }
    
    
    
    
}
