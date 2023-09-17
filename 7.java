import java.util.Date;

class Auto {
    private String nombreDueño;
    private Date fechaVencimientoCarnet;
    private String color;
    private String modelo;
    private int kmEnMotor;

    public Auto(String nombreDueño, Date fechaVencimientoCarnet, String color, String modelo) {
        this.nombreDueño = nombreDueño;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
        this.kmEnMotor = 7500; // Valor inicial por defecto
    }

    public void cargarFichaAuto(String nombreDueño, Date fechaVencimientoCarnet, String color, String modelo) {
        this.nombreDueño = nombreDueño;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
    }

    public void cambiarTitularidad(String nuevoDueño) {
        this.nombreDueño = nuevoDueño;
    }

    public void indicarTrayectoRecorrido(int kmRecorridos) {
        this.kmEnMotor += kmRecorridos;
    }

    public boolean necesitaService() {
        return kmEnMotor >= 10000;
    }

    public static void main(String[] args) {
        // Crear un objeto Auto
        Auto miAuto = new Auto("Juan Perez", new Date(), "Rojo", "Sedán");

        // Cargar la ficha del auto
        miAuto.cargarFichaAuto("Ana García", new Date(), "Azul", "SUV");

        // Cambiar la titularidad del vehículo
        miAuto.cambiarTitularidad("Carlos López");

        // Indicar un trayecto recorrido
        miAuto.indicarTrayectoRecorrido(1000000000);

        // Comprobar si necesita service
        if (miAuto.necesitaService()) {
            System.out.println("Es necesario realizar un service al vehículo.");
        } else {
            System.out.println("No es necesario realizar un service al vehículo.");
        }
    }
}
