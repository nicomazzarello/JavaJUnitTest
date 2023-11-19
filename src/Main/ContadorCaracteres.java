package Main;

public class ContadorCaracteres {
    // Función para contar la cantidad de caracteres en una oración
    public static int contarCaracteres(String oracion) {
        int contador = 0;

        // Recorrer la cadena y contar cada carácter
        for (int i = 0; i < oracion.length(); i++) {
            contador++;
        }

        return contador;
    }
}
