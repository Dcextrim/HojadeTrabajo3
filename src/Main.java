public class Main {
    public static void main(String[] args) {
        // Generar números aleatorios
        int[] numerosAleatorios = Randnum.rand();
        
        // Ordenar los números utilizando GnomeSort
        GnomeSort.gnomeSort(numerosAleatorios);
        
        // Imprimir los números ordenados
        System.out.println("Números ordenados:");
        for (int num : numerosAleatorios) {
            System.out.println(num);
        }
    }
}
