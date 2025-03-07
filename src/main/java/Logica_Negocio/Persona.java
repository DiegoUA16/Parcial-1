
package Logica_Negocio;

/**
 *
 * @author 1002821333
 */
public class Persona {
    
    public String nombrePersona, apellido, idPersona;
    public Producto objProducto;

    public Persona(String nombrePersona, String apellido, String idPersona, Producto objProducto) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.idPersona = idPersona;
        this.objProducto = objProducto;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

   
       
}
