class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tiempo(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora inválida");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos inválidos");
        }
    }

    public void imprimirHoraCompleta() {
        System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
    }


public static void main(String[] args) throws InterruptedException {
    Tiempo tiempo = new Tiempo(12, 30, 45);

    while (true) {
        tiempo.imprimirHoraCompleta();
        Thread.sleep(1000);
        tiempo.setSegundos(tiempo.getSegundos() + 1);

        if (tiempo.getSegundos() == 60) {
            tiempo.setSegundos(0);
            tiempo.setMinutos(tiempo.getMinutos() + 1);
        }

        if (tiempo.getMinutos() == 60) {
            tiempo.setMinutos(0);
            tiempo.setHora(tiempo.getHora() + 1);
        }

        if (tiempo.getHora() == 24) {
            tiempo.setHora(0);
        }
    }
}
}