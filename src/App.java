import metodos.Shell;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[] = {   12,     -7,     25,     0,      -15,    33,     19,     -22,        5,      48,     -3};
        System.out.println("Arreglo original:");
        Shell.imprimir(arreglo);
        Shell.ordenar(arreglo);
        System.out.println("Arreglo ordenado:");
        Shell.imprimir(arreglo);
    }
}
