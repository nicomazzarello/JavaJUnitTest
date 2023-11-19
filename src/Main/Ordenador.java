package Main;

public class Ordenador {
    // Función para ordenar un arreglo de números usando el algoritmo Bubble Sort
    public static void ordenarNumeros(int[] array) {
        int n = array.length;
        boolean intercambiado;

        do {
            intercambiado = false;

            for (int i = 1; i < n; i++) {
                // Comprobar si los elementos están en orden ascendente
                if (array[i - 1] > array[i]) {
                    // Intercambiar elementos si están fuera de orden
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    // Marcar que se realizó un intercambio
                    intercambiado = true;
                }
            }

            // Reducir el tamaño del rango de elementos no ordenados
            n--;

        } while (intercambiado);
    }
}
