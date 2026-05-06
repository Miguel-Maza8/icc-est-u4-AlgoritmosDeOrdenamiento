import java.util.Scanner;
import metodos.Insert;
import metodos.Shell;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[] = {   12,     -7,     25,     0,      -15,    33,     19,     -22,        5,      48,     -3};
        
        try (//int arreglo2[]= arreglo.clone();
        Scanner entrada = new Scanner(System.in)) {
            int opcion = 0;
            while( opcion != 2) {
                System.out.println("----Progama de ordenamiento----");
                System.out.println("1. Ejecutar ordenamiento");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = entrada.nextInt();
                
                if (opcion < 0 || opcion > 2) {
                   System.out.println(" El numero esta fuera de rango");
                } else if (opcion == 1) {
                  while (opcion !=3) {
                    System.out.println("1. Inserccion ");
                    System.out.println("2.Shell ");
                    System.out.println("3. Regresar al menu principal");
                    System.out.println("Seleccione una opción: ");
                    opcion = entrada.nextInt();
                    if (opcion < 0 || opcion > 3) {
                        System.out.println("El numero esta fuera de rango");
                    
                    } else if (opcion == 1) {
                        System.out.println("Inserccion ascendente: (true o false):");
                        boolean asc1 = entrada.nextBoolean();
                        if ( asc1 == true) {
                          System.out.println("Ordenamiento ascendente:");
                          Insert.ordenar(arreglo, asc1);  
                             
                        }else {
                          System.out.println("Ordenamiento descendente:");
                          Insert.ordenar(arreglo, asc1);  
                          
                        }
                    } else if (opcion == 2) {
                        System.out.println("Shell ascendente: (true o false):");
                        boolean asc = entrada.nextBoolean();
                        if (asc == true) {
                            System.out.println("Ordenamiento ascendente:");
                            Shell.ordenar(arreglo, asc);  
                            
                        }else {
                            System.out.println("Ordenamiento descendente:");
                            Shell.ordenar(arreglo, asc);  
                            

                         }
                    }      
                    }   
                } else if (opcion == 2) {
                     System.out.println("Gracias por usar el progama");

                } else {
                    System.out.println("No se permiten valores de tipo letra");
                    
                } 
                    
       
           }   } 
            
    }
     
       
 }
  