class Pass {
    private String pass;
    private String nombre;
    private int dni;
    private boolean contraseñaEstablecida;

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
        this.contraseñaEstablecida = true;
    }

    public void crearPass(String contraseña) {
        if (contraseña.length() == 10) {
            pass = contraseña;
            contraseñaEstablecida = true;
            System.out.println("Contraseña establecida con éxito.");
        } else {
            System.out.println("La contraseña debe tener una longitud de 10 caracteres.");
        }
    }

    public String analizarPass() {
        if (pass.contains("z") && pass.contains("a")) {
            return "NIVEL ALTO";
        } else if (pass.contains("z")) {
            return "NIVEL MEDIO";
        } else {
            return "NIVEL BAJO";
        }
    }

    public void modificarNombre(String contraseña, String nuevoNombre) {
        if (contraseñaEstablecida && pass.equals(contraseña)) {
            nombre = nuevoNombre;
            System.out.println("Nombre modificado con éxito.");
        } else {
            System.out.println("No tienes permiso para modificar el nombre.");
        }
    }

    public void modificarDNI(String contraseña, int nuevoDNI) {
        if (contraseñaEstablecida && pass.equals(contraseña)) {
            dni = nuevoDNI;
            System.out.println("DNI modificado con éxito.");
        } else {
            System.out.println("No tienes permiso para modificar el DNI.");
        }
    }

    public static void main(String[] args) {
       
        Pass usuario = new Pass("123456789z","juan",  123456);

        // Menú de opciones
        System.out.println("Menú de opciones:");
        System.out.println("A) Ingresar la contraseña");
        System.out.println("B) Mostrar el nivel de la contraseña");
        System.out.println("C) Modificar contraseña");
        System.out.println("D) Modificar nombre");
        System.out.println("E) Modificar DNI");

        // Simulación de selección de opción (debes implementar la lógica de tu menú)
        String opcion = "B"; // Cambia la opción según tus necesidades

        switch (opcion) {
            case "A":
                usuario.crearPass("nuevaContraseña");
                break;
            case "B":
                if (usuario.contraseñaEstablecida) {
                    System.out.println("Nivel de la contraseña: " + usuario.analizarPass());
                } else {
                    System.out.println("La contraseña no ha sido establecida.");
                }
                break;
            case "C":
                usuario.modificarNombre("contraseña123", "Nuevo Nombre");
                break;
            case "D":
                usuario.modificarDNI("contraseña123", 87654321);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
