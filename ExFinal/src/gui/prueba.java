
package gui;

import java.util.ArrayList;
import java.util.List;
import beans.*;
import java.util.Scanner;



public class prueba {
    
    
    
    List<Personal> lis = new ArrayList();
    
    public static void main(String[] args) {
            int opcion=1;
            todos();
            
            while (!(opcion==6)){
                System.out.println("Escoja el tipo de proceso a realizar: (-1 para salir)");
                System.out.println("1. Insertar Empleado");
                System.out.println("2. Insertar Obrero");
                System.out.println("3. Listar solo Empleados");
                System.out.println("4. Listar solo Obreros");
                System.out.println("5. Listar Pagos Totales");
                System.out.println("6. Salir");
                System.out.println("==================================");

                Scanner teclado = new Scanner(System.in);
                opcion= teclado.nextInt();
                if (opcion==6)
                    break;
                else{
                    
                    if (opcion==1){
                        System.out.println("Insertar PagoPorDia y DiasTrabajados");
                        System.out.println("Pago por dia: ");
                        double pagPorDia= teclado.nextDouble();
                        System.out.println("Dias Trabajdos: ");
                        int numDias= teclado.nextInt();
                        Empleado emp = new Empleado();





                    }
                    if (opcion==2){




                    }
                    if (opcion==3){




                    }
                    if (opcion==4){




                    }
                    if (opcion==5){




                    }
                    
            
                }
            
            }
            
            
            
        
        
        
        
    }
    
    void todos(){
        System.out.println("Lista de todo el Personal");;
        for(Personal x:lis){
            System.out.println(x.Print());
            System.out.println("\n===========\n");
        }
    }  
    void LisEmp(){
        System.out.println("Lista de Empleados\n");
        for(Personal x:lis){
            if(x instanceof Empleado){
                System.out.println(x.Print());
                System.out.println("\n===========\n");
            }
        }
    } 
    void LisObre(){
        System.out.println("Lista de Obreros\n");
        for(Personal x:lis){
            if(x instanceof Obrero){
                System.out.println(x.Print());
                System.out.println("\n===========\n");
            }
        }
    }
    
}
