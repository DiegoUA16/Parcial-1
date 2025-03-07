/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import Helpers.HelperValidacion;
import java.util.Scanner;

/**
 *
 * @author 1002821333
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id, nombre, descripcion;
        String nombrePersona, apellido, idPersona;

        Producto objProducto;
        Persona objPersona;

        int rta, conteo;

        System.out.print("Digite el nombre del producto: ");
        nombre = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.print("Digite el nombre del producto: ");
            nombre = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.print("Digite el nombre del producto: ");
            nombre = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);

        }

        ///-------------------------------------------------------------
        System.out.print("Digite el ID del producto: ");
        id = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(id);

        while (rta > 0) {
            System.out.print("Digite el ID del producto: ");
            id = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(id);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id);

        while (conteo != 0) {
            System.out.print("Digite el ID del producto: ");
            id = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id);

        }

        ///-------------------------------------------------------------
        System.out.print("Digite la descripcion del producto: ");
        descripcion = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.print("Digite la descripcion del producto: ");
            descripcion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodoDireccion(descripcion);

        while (conteo != 0) {
            System.out.print("Digite la descripcion del producto:");
            descripcion = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoDireccion(descripcion);

        }
        objProducto = new Producto(nombre, id, descripcion); 

        ///----------------------///
        System.out.print("Digite el nombre de la persona: ");
        nombrePersona = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(nombrePersona);

        while (rta > 0) {
            System.out.print("Digite el nombre de la persona: ");
            nombrePersona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombrePersona);
        }

        conteo = HelperValidacion.ValidarTodo(nombrePersona);

        while (conteo != 0) {
            System.out.print("Digite el nombre de la persona:  ");
            nombrePersona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombrePersona);

        }
///---------------------------------------------------------------------------
        System.out.print("Digite el apellido de la persona: ");
        apellido = scan.nextLine();

        rta = HelperValidacion.ValidarTodoSerial(apellido);

        while (rta > 0) {
            System.out.print("Digite el apellido de la persona: ");
            apellido = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(apellido);
        }

        conteo = HelperValidacion.ValidarTodoSerial(apellido);

        while (conteo != 0) {
            System.out.print("Digite el apellido de la persona: ");
            apellido = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(apellido);

        }
        //--------------------------------------------------------------
        System.out.print("Digite el id de la persona: ");
        idPersona = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(idPersona);

        while (rta > 0) {
            System.out.print("Digite el id de la persona: ");
            idPersona = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(idPersona);
        }

        conteo = HelperValidacion.ValidarTodoLetra(idPersona);

        while (conteo != 0) {
            System.out.print("Digite el id de la persona: ");
            idPersona = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(idPersona);

        }

        //-------------------------------------------------------------
        objPersona = new Persona(nombrePersona, apellido, idPersona, objProducto);

        Helpers.HelperImpresion.ImprimirPersona(objPersona);

    }
    
}