package VentaDeLibros;

public class Libros{
    public static void main(String[] args) {
        Libro libro1 = new Libro("Servantes", "Julio Verne", 100.00);
        libro1.mostrarDetalles();
    
        libro1.actualizarPrecio(250.00);
        libro1.mostrarDetalles();
    }
}