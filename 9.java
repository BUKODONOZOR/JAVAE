class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices() {
        double discriminante = getDiscriminante();
        return discriminante >= 0;
    }

    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        return discriminante == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double discriminante = getDiscriminante();
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("No tiene raíces reales.");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("Raíz única: " + raiz);
        } else {
            System.out.println("No tiene una única raíz real.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            System.out.println("Tiene dos soluciones:");
            obtenerRaices();
        } else if (tieneRaiz()) {
            System.out.println("Tiene una única solución:");
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }

    public static void main(String[] args) {
        Raices ecuacion1 = new Raices(1, -3, 2);
        ecuacion1.calcular();

        Raices ecuacion2 = new Raices(1, -2, 1);
        ecuacion2.calcular();

        Raices ecuacion3 = new Raices(1, 2, 3);
        ecuacion3.calcular();
    }
}
