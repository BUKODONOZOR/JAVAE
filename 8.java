class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Cancion
        Cancion cancion1 = new Cancion(); // Crear una canción vacía
        Cancion cancion2 = new Cancion("Mi canción", "Autor desconocido"); // Crear una canción con título y autor

        // Acceder a los atributos utilizando getters
        System.out.println("Canción 1 - Título: " + cancion1.getTitulo() + ", Autor: " + cancion1.getAutor());
        System.out.println("Canción 2 - Título: " + cancion2.getTitulo() + ", Autor: " + cancion2.getAutor());

        // Modificar los atributos utilizando setters
        cancion1.setTitulo("Otra canción");
        cancion1.setAutor("Otro autor");

        // Acceder a los atributos actualizados
        System.out.println("Canción 1 - Título: " + cancion1.getTitulo() + ", Autor: " + cancion1.getAutor());
    }
}
