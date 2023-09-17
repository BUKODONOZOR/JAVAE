import java.util.Scanner;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
        // Constructor por defecto
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del celular: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el precio del celular: ");
        precio = scanner.nextDouble();

        scanner.nextLine(); // Consumir la línea en blanco

        System.out.print("Ingrese el modelo del celular: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese la memoria RAM del celular: ");
        memoriaRam = scanner.nextInt();

        System.out.print("Ingrese el almacenamiento del celular: ");
        almacenamiento = scanner.nextInt();

        System.out.println("Ingrese el código de 7 números del celular:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
    }

    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de 7 números del celular:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información del celular:");
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria RAM: " + memoriaRam);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.print("Código: ");
        for (int num : codigo) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Movil celular = new Movil();
        celular.cargarCelular();
        celular.mostrarInformacion();
    }
}
