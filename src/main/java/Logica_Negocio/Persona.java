
package Logica_Negocio;

/**
 *
 * @author 1002821333
 */
public class Persona {
    
    public String idPersona, nombrePersona, apellido;
    public Producto objProducto;

    public Persona() {
    }

    public Persona(String idPersona, String nombrePersona, String apellido, Producto objProducto) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.objProducto = objProducto;
    }  

    public String getId() {
        return idPersona;
    }

    public void setId(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombrePersona;
    }

    public void setNombre(String nombrePersona) {
        this.nombrePersona = nombrePersona;
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
