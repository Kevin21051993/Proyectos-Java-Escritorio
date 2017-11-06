
package Clases;
import java.util.*;
public class Prueba1 {

    public static void main(String[] args) {
        List <Viaje> lis = new ArrayList();
        lis.add(new Pasajero(1,"Alexis Marchan"));
        lis.add(new Encomienda("Ica",3, 20,"Juan Sanchez"));
        lis.add(new Pasajero(3,"Luisa Martinez"));
        lis.add(new Encomienda("Tacna",5, 15,"Tommy Fernandez"));
        
        for(Viaje x:lis){
            System.out.println(x.toString());
            System.out.println("===========");
            }
        
        System.out.println("SOLO PASAJERO:");
        for(Viaje x:lis){
            if (x instanceof Pasajero){
                System.out.println(x.toString());
                System.out.println("==========="); 
                }
            } 
        
        System.out.println("SOLO ENCOMIENDA:");
        for(Viaje x:lis){
            if (x instanceof Encomienda){
                System.out.println(x.toString());
                System.out.println("==========="); 
                }
        }
    }
    
}
