 class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public void verificarAnio(int anioIngresado) {
        if (anioIngresado >= 1900 && anioIngresado <= 2021) {
            anio = anioIngresado;
        } else {
            System.out.println("El año ingresado está fuera del rango permitido (1900-2021). Se usará el año por defecto (1900).");
        }
    }

    public int obtenerDiasEnMes() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = diasPorMes[mes];

        // Comprobar si el año es bisiesto y el mes es febrero
        if (mes == 2 && esBisiesto()) {
            dias = 29;
        }

        return dias;
    }

    public void diaAnterior() {
        if (dia > 1) {
            dia--;
        } else {
            if (mes > 1) {
                mes--;
                dia = obtenerDiasEnMes();
            } else {
                anio--;
                mes = 12;
                dia = 31;
            }
        }
    }

    public void diaSiguiente() {
        int diasEnMes = obtenerDiasEnMes();
        if (dia < diasEnMes) {
            dia++;
        } else {
            if (mes < 12) {
                mes++;
                dia = 1;
            } else {
                anio++;
                mes = 1;
                dia = 1;
            }
        }
    }

    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        fecha.verificarAnio(2021);
        fecha.mes = 10; // Mes de octubre

        System.out.println("Día anterior: ");
        fecha.diaAnterior();
        System.out.println("Día: " + fecha.dia + ", Mes: " + fecha.mes + ", Año: " + fecha.anio);

        System.out.println("\nDía posterior: ");
        fecha.diaSiguiente();
        System.out.println("Día: " + fecha.dia + ", Mes: " + fecha.mes + ", Año: " + fecha.anio);

        System.out.println("\nEs año bisiesto: " + fecha.esBisiesto());
    }
}
