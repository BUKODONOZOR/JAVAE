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

    public void buscarPalabra(String palabraBuscada) {
        boolean encontrada = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palabraBuscada.charAt(0)) {
                    if (buscarHorizontal(i, j, palabraBuscada) || buscarVertical(i, j, palabraBuscada)) {
                        System.out.println("La palabra '" + palabraBuscada + "' comienza en la posición (" + i + ", " + j + ").");
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
            System.out.println("La palabra '" + palabraBuscada + "' no se encontró en la matriz.");
        }
    }

    private boolean buscarHorizontal(int fila, int columna, String palabraBuscada) {
        if (columna + palabraBuscada.length() > 10) {
            return false;
        }
        for (int i = 0; i < palabraBuscada.length(); i++) {
            if (matriz[fila][columna + i] != palabraBuscada.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean buscarVertical(int fila, int columna, String palabraBuscada) {
        if (fila + palabraBuscada.length() > 10) {
            return false;
        }
        for (int i = 0; i < palabraBuscada.length(); i++) {
            if (matriz[fila + i][columna] != palabraBuscada.charAt(i)) {
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

        // Pedir al usuario la palabra a buscar
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingresa una palabra para buscar en la sopa de letras: ");
        String palabraBuscada = scanner.nextLine().toLowerCase();
        sopa.buscarPalabra(palabraBuscada);
        scanner.close();
    }
}
