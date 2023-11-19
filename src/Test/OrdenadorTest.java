package Test;

import Main.Ordenador;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class OrdenadorTest {

    @Test
    public void testOrdenarNumerosDesordenado() {
        // Caso de prueba: Arreglo desordenado
        int[] numerosDesordenados = {5, 2, 8, 1, 6};
        int[] resultadoEsperadoDesordenado = {1, 2, 5, 6, 8};
        Ordenador.ordenarNumeros(numerosDesordenados);
        assertArrayEquals(resultadoEsperadoDesordenado, numerosDesordenados);
    }

    @Test
    public void testOrdenarNumerosOrdenado() {
        // Caso de prueba: Arreglo ya ordenado
        int[] numerosOrdenados = {1, 2, 3, 4, 5};
        int[] resultadoEsperadoOrdenado = {1, 2, 3, 4, 5};
        Ordenador.ordenarNumeros(numerosOrdenados);
        assertArrayEquals(resultadoEsperadoOrdenado, numerosOrdenados);
    }

    @Test
    public void testOrdenarNumerosRepetidos() {
        // Caso de prueba: Arreglo con elementos repetidos
        int[] numerosRepetidos = {4, 2, 1, 4, 3, 2};
        int[] resultadoEsperadoRepetidos = {1, 2, 2, 3, 4, 4};
        Ordenador.ordenarNumeros(numerosRepetidos);
        assertArrayEquals(resultadoEsperadoRepetidos, numerosRepetidos);
    }

    @Test
    public void testOrdenarNumerosVacio() {
        // Caso de prueba: Arreglo con elementos repetidos
        int[] numerosRepetidos = {};
        int[] resultadoEsperadoRepetidos = {};
        Ordenador.ordenarNumeros(numerosRepetidos);
        assertArrayEquals(resultadoEsperadoRepetidos, numerosRepetidos);
    }
}
