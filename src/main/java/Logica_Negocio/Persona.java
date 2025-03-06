
package Logica_Negocio;

/**
 *
 * @author 1002821333
 */
public class Persona {
    
    public String id, nombre, apellido;
    public Producto objProducto;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, Producto objProducto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.objProducto = objProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }
    
    
}
