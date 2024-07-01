package VentaDeLibros;

public class Libros {
    String nombre_libro;
    String creador;
    double costo;

    public Libros(String nombre_libro, String creador, double costo){
        this.nombre_libro
 = nombre_libro
;
        this.creador = creador;
        this.costo = costo;
    }

    public void mostrarDetalles() {
        System.out.println("El nombre_libro
 del libro es " + nombre_libro
 + " y el creador del libro es " + creador + " con un costo de " + costo);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.costo = nuevoPrecio;
    }
}