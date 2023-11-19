package Test;

import Main.Palindromo;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {

    @Test
    public void testEsPalindromoEs() {
        // Caso de prueba: Palíndromo
        assertTrue(Palindromo.esPalindromo("reconocer"));
    }

    @Test
    public void testEsPalindromoNoEs() {
        // Caso de prueba: No palíndromo
        assertFalse(Palindromo.esPalindromo("hola"));
    }

    @Test
    public void testEsPalindromoEsConEspacios() {
        // Caso de prueba: Palíndromo con espacios
        assertTrue(Palindromo.esPalindromo("anita lava la tina"));
    }

    @Test
    public void testEsPalindromoCadenaVacia() {
        // Caso de prueba: Cadena vacía
        assertTrue(Palindromo.esPalindromo("")); // Consideramos una cadena vacía como palíndromo
    }
}
