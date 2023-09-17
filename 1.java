import java.util.Scanner;

class Fraccion {
    int numerador1, denominador1, numerador2, denominador2;

    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }
}

class Servicio {
    Fraccion fraccion;

    public Servicio(Fraccion fraccion) {
        this.fraccion = fraccion;
    }

    public void sumar() {
        int numerador = (fraccion.numerador1 * fraccion.denominador2) + (fraccion.numerador2 * fraccion.denominador1);
        int denominador = fraccion.denominador1 * fraccion.denominador2;
        System.out.println("La suma de las fracciones es: " + numerador + "/" + denominador);
    }

    public void restar() {
        int numerador = (fraccion.numerador1 * fraccion.denominador2) - (fraccion.numerador2 * fraccion.denominador1);
        int denominador = fraccion.denominador1 * fraccion.denominador2;
        System.out.println("La resta de las fracciones es: " + numerador + "/" + denominador);
    }

    public void multiplicar() {
        int numerador = fraccion.numerador1 * fraccion.numerador2;
        int denominador = fraccion.denominador1 * fraccion.denominador2;
        System.out.println("La multiplicación de las fracciones es: " + numerador + "/" + denominador);
    }

    public void dividir() {
        int numerador = fraccion.numerador1 * fraccion.denominador2;
        int denominador = fraccion.denominador1 * fraccion.numerador2;
        System.out.println("La división de las fracciones es: " + numerador + "/" + denominador);
    }


public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese el primer numerado: ");
        int numerado1 = scanner.nextInt();

        System.out.print("Ingrese el primer denominado: ");
        int denominado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numerado: ");
        int numerado2 = scanner.nextInt();

        System.out.print("Ingrese el segundo denominado: ");
        int denominado2 = scanner.nextInt();

        Fraccion fraccion = new Fraccion(numerado1, denominado1, numerado2, denominado2);

        Servicio servicio = new Servicio(fraccion);

        System.out.println("Seleccione una opción:");
        System.out.println("  1. Sumar");
        System.out.println("  2. Restar");
        System.out.println("  3. Multiplicar");
        System.out.println("  4. Dividir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                servicio.sumar();
                break;
            case 2:
                servicio.restar();
                break;
            case 3:
                servicio.multiplicar();
                break;
            case 4:
                servicio.dividir();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}

}