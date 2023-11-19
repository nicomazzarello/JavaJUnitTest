package Main;

public class Palindromo {
    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String str) {
        // Eliminar espacios y convertir a minúsculas para hacer la comparación sin distinción de mayúsculas
        String cadenaProcesada = str.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su inversa
        return cadenaProcesada.contentEquals(new StringBuilder(cadenaProcesada).reverse());
    }
}