import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private String nombre;

    /**
     * Creacion de una biblioteca vacia
     */

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un libro a la biblioteca
     */

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    /**
     * Muestra todos los libros
     */

    public void mostrarTodosLosLibros() {
        System.out.println("\n=== Biblioteca: " + nombre + "===");
        System.out.println("Total de libros: " + libros.size());
    }

    if (libros.isEmpty()) {
        System.out.println("No hay libros en la biblioteca");
        return;
    }

    for (int i = 0; i < libros.size(); i++) {
        System.out.println("\n Libro #" + (i + 1));
        Libro libro = libros.get(i);
        libro.mostrarInfo();
    }
}
