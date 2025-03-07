/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;

public class HelperImpresion {

    public static void ImprimirPersona(Persona objPersona) {

        System.out.println("----------------------------------");
        System.out.println(" *** IMPRESION DE DATOS *** ");
        System.out.println("");
        System.out.println(" - PERSONAS - \n");
        System.out.println("El nombre de la persona es:  " + "\t" + objPersona.getNombrePersona());
        System.out.println("El apellido de la persona es:" + "\t" + objPersona.getApellido());
        System.out.println("La cedula de la persona es:  " + "\t" + objPersona.getIdPersona());
        System.out.println("");
        System.out.println(" - PRODUCTOS - \n");
        System.out.println("Id del Producto          : " + "\t" + objPersona.getObjProducto().getId());
        System.out.println("El Nombre del producto es: " + "\t" + objPersona.getObjProducto().getNombre());
        System.out.println("Descripcion del producto : " + "\t" + objPersona.getObjProducto().getDescripcion());
    }
}
