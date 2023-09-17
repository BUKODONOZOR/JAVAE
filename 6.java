import java.util.Random;
class SopaDeLetras {
    private char[][] matriz;
    private String palabra;

    public SopaDeLetras() {
        matriz = new char[10][10];
        palabra = "palabras";
        llenarMatriz();
    }

    private void llenarMatriz() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }
        // Colocar la palabra en orden horizontal
        int fila = random.nextInt(10);
        int columna = random.nextInt(6);
        for (int i = 0; i < palabra.length(); i++) {
            matriz[fila][columna + i] = palabra.charAt(i);
        }
    }

    public void buscarPalabra(String palabra) {
        boolean encontrada = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palabra.charAt(0)) {
                    if (buscarHorizontal(i, j, palabra) || buscarVertical(i, j, palabra)) {
                        System.out.println("La palabra '" + palabra + "' comienza en la posición (" + i + ", " + j + ").");
                        encontrada = true;
                        break;
                    }
                }
            }
            if (encontrada) {
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra '" + palabra + "' no se encontró en la matriz.");
        }
    }

    private boolean buscarHorizontal(int fila, int columna, String palabra) {
        if (columna + palabra.length() > 10) {
            return false;
        }
        for (int i = 0; i < palabra.length(); i++) {
            if (matriz[fila][columna + i] != palabra.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean buscarVertical(int fila, int columna, String palabra) {
        if (fila + palabra.length() > 10) {
            return false;
        }
        for (int i = 0; i < palabra.length(); i++) {
            if (matriz[fila + i][columna] != palabra.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void imprimirSopa() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SopaDeLetras sopa = new SopaDeLetras();
        sopa.imprimirSopa();
        sopa.buscarPalabra("palabras");
    }
}
