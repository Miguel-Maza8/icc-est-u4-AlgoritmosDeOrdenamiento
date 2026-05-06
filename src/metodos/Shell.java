package metodos;

public class Shell {
     public static void ordenar (int[] arreglo,boolean asc) {
        int totalComparaciones = 0;
        int totalIteraciones = 0;
        int totalCambios = 0;
        
        int i ;
        int j ;
        int gap = arreglo.length / 2;
        int movimiento = 1;
         
        while (gap > 0) {
            
        
            for (i = gap; i < arreglo.length; i++) {
                totalIteraciones++;
                j = i ;
                int aux = arreglo[i];
                boolean cambio= false;
                totalComparaciones++;
                   System.out.print("I" + movimiento + "  ");
                while (j >= gap && ordenar( arreglo[j - gap],aux,asc)) {
                    totalCambios++;
                    arreglo[j]= arreglo[j-gap];
                    j -= gap;
                    cambio=true;
                }
                arreglo[j]= aux;
                System.out.print("I" + movimiento );
                for (int n : arreglo) {
                    System.out.print(n + " ");

                }
                int numeros;
                if (j>= gap) { totalComparaciones++;
                    numeros = j - gap;
                    
                }else{
                    numeros= -1;
                }
                String cambionumero;
                
                if (cambio) {
                    cambionumero ="si";
                }else{
                    cambionumero="no";
                }
                
                System.out.print("  Gap: "+ gap  );
                System.out.print("  a= "+ numeros  );
                if (numeros !=-1) {
                    System.out.print("  [a]="+ arreglo[numeros]);
                }else{
                    System.out.print("  [a]=-");
                }
                System.out.print("  b="+ j);
                System.out.print("  [b]="+ arreglo[j]);
                System.err.println("   cambio= "+ cambionumero);

                movimiento++;
             }   
             gap /= 2;    
       } 
       System.out.println("\n Arreglo Ordenado");     
       imprimir(arreglo); 
       System.out.println();
        System.out.println("comparaciones: " + totalComparaciones);
        System.out.println("cambios: " + totalCambios);
        System.out.println("iteraciones: " + totalIteraciones);
    }

    public static void imprimir (int arreglo[]) {
        for (int numeros  : arreglo){

            System.out.print(numeros + " "); 

        }
        System.out.println();
        
        
        
     }
     public static boolean ordenar(int numeros, int b , boolean asc) {
        if (asc) {
            return numeros<b; //descendente
        }else{
            return numeros> b; // ascendente
        }

        
     }

}