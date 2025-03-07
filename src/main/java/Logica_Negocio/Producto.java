package Logica_Negocio;

/**
 *
 * @author 1002821333
 */
public class Producto {

    public String nombre, id , descripcion;

    public Producto(String nombre, String id, String descripcion) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
}
