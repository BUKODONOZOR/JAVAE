 class Triangulo {
    private double base;
    private double lado;
    private double altura;

    public Triangulo(double base, double lado, double altura) {
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + 2 * lado;
    }

    public String toString() {
        return "Triángulo: Base=" + base + ", Lado=" + lado + ", Altura=" + altura;
    }

    public static void main(String[] args) {
        Triangulo[] triangulos = new Triangulo[4];

        triangulos[0] = new Triangulo(5.0, 4.0, 3.0);
        triangulos[1] = new Triangulo(6.0, 4.0, 4.0);
        triangulos[2] = new Triangulo(8.0, 5.0, 6.0);
        triangulos[3] = new Triangulo(7.0, 5.0, 5.0);

        double maxArea = 0;
        Triangulo trianguloMaxArea = null;

        for (Triangulo triangulo : triangulos) {
            double area = triangulo.calcularArea();
            System.out.println(triangulo.toString() + " - Área: " + area);

            if (area > maxArea) {
                maxArea = area;
                trianguloMaxArea = triangulo;
            }
        }

        if (trianguloMaxArea != null) {
            System.out.println("\nTriángulo con el área más grande:");
            System.out.println(trianguloMaxArea.toString() + " - Área: " + maxArea);
        }
    }
}
