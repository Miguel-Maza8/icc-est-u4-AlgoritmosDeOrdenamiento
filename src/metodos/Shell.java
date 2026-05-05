package metodos;

public class Shell {
     public static void ordenar (int[] arreglo) {
        
        int i ;
        int j ;
        int gap = arreglo.length / 2;
        boolean asc ;
        while (gap > 0) {
        
            for (i = gap; i < arreglo.length; i++) {
                j = i - gap;
                int aux = arreglo[i];
                asc = false;
                while ( !asc  && j>=0 && aux < arreglo[j]) {
                      System.out.print("I1:   ");
                      imprimir(arreglo);
                      System.out.print( "                        \t Gap: " + gap);
                    
                                        
                
                                         
                    
                    arreglo[j + gap] = arreglo[j];
                    
                    if (j >= gap) {
                        j -= gap;
                    } else {
                        asc = true;
                    System.out.println();
                    }
                    if (asc ) {
                        arreglo[j] = aux;
                    
                    } else {
                        arreglo[j + gap] = aux;
                    
                    }
                    System.out.println("insertando: " + aux);
                    imprimir(arreglo);

                    
                }
     
             }   
             gap /= 2;    
       }       
    }

    public static void imprimir (int arreglo[]) {
        for (int numeros  : arreglo){

            System.out.print(numeros + " "); 

        }
        System.out.println();
        
        
        
    }

}
