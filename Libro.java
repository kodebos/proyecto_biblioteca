public class Libro {
    // Caracteristicas del Libro
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;

    /**
     * Ejecución al crear un nuevo libro
     */
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }

    // Obtencion de informacion
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPagina() {
        return numPaginas;
    }

    public boolean estaPrestado() {
        return prestado;
    }
}