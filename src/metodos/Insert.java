package metodos;

public class Insert {
    public static void ordenar(int[] arreglo,boolean asc) {

        System.out.println("==== METODO INSERCION ==== \n");
        int i;
        int j;
        int movimiento= 1;

        for ( i = 1; i < arreglo.length; i++) {

            j =i;
            int aux = arreglo[i];
            boolean cambio = false;

            System.out.print("I" + movimiento + "   ");
            

            while (j > 0 && orden(arreglo[j-1],aux, asc)) {

                arreglo[j]=arreglo[j-1];
                j--;
                cambio=true;

              
            }
            for(int numeros : arreglo){
                System.out.print(numeros + "");
            }
            int numeros;
            if(j> 0){
                numeros = j - 1;

            }else{
                numeros =-1;

            }
            String cambionumero;
            if(cambio){
                cambionumero= "si";

            }else cambionumero = "no";
            System.out.print("  a= "+ numeros);

            if (numeros != -1) {
                System.out.print("  [a]= " + arreglo[numeros]);

                
            }else{
                System.out.print("  [a]=-");

            }
            System.out.print("  b= " + j);
            System.out.print("  [b]= " + arreglo[j]);

            System.out.println("   cambio= " + cambionumero);

            movimiento++;
        }
        System.out.println("\n === Arreglo Ordenado === ");
        imprimir(arreglo);

    }

    public static void imprimir(int[] arreglo) {
        for (int n : arreglo) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static boolean orden(int a,int b, boolean asc){
        if (asc) {
            return a> b; //ascendente
        }else{
            return a< b; // descendente
        }
    }
}
