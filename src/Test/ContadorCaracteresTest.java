package Test;

import Main.ContadorCaracteres;
import org.junit.Assert;
import org.junit.Test;

public class ContadorCaracteresTest {

    @Test
    public void testContarCaracteresCadenaNoVacia() {
        // Caso de prueba: Cadena no vacía
        Assert.assertEquals(10, ContadorCaracteres.contarCaracteres("Hola Mundo"));
    }
    @Test
    public void testContarCaracteresCadenaVacia() {
        // Caso de prueba: Cadena vacía
        Assert.assertEquals(0, ContadorCaracteres.contarCaracteres(""));
    }

    @Test
    public void testContarCaracteresConEspacios() {
        // Caso de prueba: Cadena con espacios
        Assert.assertEquals(13, ContadorCaracteres.contarCaracteres("¡Hola, Mundo!"));
    }

    @Test
    public void testContarCaracteresCaracteresEspeciales() {
        // Caso de prueba: Cadena con caracteres especiales
        Assert.assertEquals(7, ContadorCaracteres.contarCaracteres("123-456"));
    }

    @Test
    public void testContarCaracteresMayusculas() {
        // Caso de prueba: Cadena con mayúsculas y minúsculas
        Assert.assertEquals(10, ContadorCaracteres.contarCaracteres("AbCdEfGhIj"));
    }
}
