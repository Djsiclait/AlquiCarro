/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquicarro;

import java.util.*;
<<<<<<< HEAD

=======
>>>>>>> e8296cca98d09fa5a2fb9658760cd94b383a1ae0
/**
 *
 * @author user
 */
<<<<<<< HEAD
=======

>>>>>>> e8296cca98d09fa5a2fb9658760cd94b383a1ae0
public class AlquiCarro{
 
    public static void main(String[] args) {
        String respuesta; // variable para guardar entradsa del usuario
<<<<<<< HEAD
        
       Scanner entrada = new Scanner(System.in); // instancia del lector de entrada de usuario
       
       boolean error = false;
       
       do{
       // Mensaje de Bienvenida
       System.out.println("Bienvenido a AlquiCarro: tu solición para alquiler de carros\n");
       
       // Presentando el menú al usuario
       System.out.println("Favor elegir la operación que deseas realizar:");
       
       System.out.println("Registración");
       System.out.println("\t1. Registrar Nuevo Cliente");
       System.out.println("\t2. Registrar Nuevo Carro");
       System.out.println("\t3. Registrar Nuevo Agente");
       System.out.println("\t4. Registrar Nuevo Alquiler");
       
       System.out.println("Consultas");
       System.out.println("\t5. Ver Registro de Clientes");
       System.out.println("\t6. Ver Registro de Carros");
       System.out.println("\t7. Registrar Nuevo Agente");
       System.out.println("\t8. Ver Registro de Alquileres");
       
       System.out.println("Cobros");
       System.out.println("\t9. Cobrar Alquiler");
       
       // Capturar respuesta del usuario
       System.out.println("Elegir el codigo de la operación o presionar 0 para cerrar la aplicación.");
           if (error) {
               System.out.println("Favor introducir una opcion válida");
               error = false;
           }
       System.out.print("Respuesta : ");
       respuesta = entrada.nextLine(); // capturando la respuesta del usuarios
       
       // Cerebro del la aplicación
       // Este parte permite el programa interpretar la entrada el usuario y ejecutar las funcionalidades elegidas
       switch(respuesta){
           case "0":
               break;
           case "1":
               RegistrarCliente();
               break;
           case "2":
               RegistrarCarro();
               break;
           case "3":
               RegistrarAgente();
               break;
           case "4":
               RealizarAlquiler();
               break;
           case "5":
               ListarClientes();
               break;
           case "6":
               // TODO: crear funccion listar carros
               break;
           case "7":
               ListarAgentes();
               break;
           case "8":
               ListarAlquileres();
               break;
           case "9":
               CobrarAlquiler();
               break;
           default:
               error = true;
               break;
       }
=======

        Scanner entrada = new Scanner(System.in); // instancia del lector de entrada de usuario
>>>>>>> e8296cca98d09fa5a2fb9658760cd94b383a1ae0
       
        boolean error = false;
       
        do{
        // Mensaje de Bienvenida
        System.out.println("Bienvenido a AlquiCarro: tu solición para alquiler de carros\n");

        // Presentando el menú al usuario
        System.out.println("Favor elegir la operación que deseas realizar:");

        System.out.println("Registración");
        System.out.println("\t1. Registrar Nuevo Cliente");
        System.out.println("\t2. Registrar Nuevo Carro");
        System.out.println("\t3. Registrar Nuevo Agente");
        System.out.println("\t4. Registrar Nuevo Alquiler");

        System.out.println("Consultas");
        System.out.println("\t5. Ver Registro de Clientes");
        System.out.println("\t6. Ver Registro de Carros");
        System.out.println("\t7. Registrar Nuevo Agente");
        System.out.println("\t8. Ver Registro de Alquileres");

        System.out.println("Cobros");
        System.out.println("\t9. Cobrar Alquiler");

        // Capturar respuesta del usuario
        System.out.println("Elegir el codigo de la operación o presionar 0 para cerrar la aplicación.");
            if (error) {
                System.out.println("Favor introducir una opcion válida");
                error = false;
            }
        System.out.print("Respuesta : ");
        respuesta = entrada.nextLine(); // capturando la respuesta del usuarios

        // Cerebro del la aplicación
        // Este parte permite el programa interpretar la entrada el usuario y ejecutar las funcionalidades elegidas
        switch(respuesta){
            case "0":
                break;
            case "1":
                RegistrarCliente();
                break;
            case "2":
                RegistrarCarro();
                break;
            case "3":
                RegistrarAgente();
                break;
            case "4":
                RealizarAlquiler();
                break;
            case "5":
                ListarClientes();
                break;
            case "6":
                // TODO: crear funccion listar carros
                break;
            case "7":
                ListarAgentes();
                break;
            case "8":
                ListarAlquileres();
                break;
            case "9":
                CobrarAlquiler();
                break;
            default:
                error = true;
                break;
        }

        }while(!respuesta.equals("0")); // mantener la applicacion corriendo hasta que el usuario elige cerrarlo con 0

        System.out.println("\n\n\t¡Gracias por preferir AlquiCarro! Hasta la proxima...");
    }
    
    public static void RegistrarCliente(){
        System.out.println("Registro de Cliente");
        Scanner entrada = new Scanner(System.in);
        List<String> listCliente = new ArrayList<String>();
        
        System.out.println("Ingrese el Nombre: ");
        Persona.Nombre = entrada.nextLine();
        System.out.println("Ingrese el Direccion: ");
        Persona.Direccion = entrada.nextLine();
        System.out.println("Ingrese el Telefono: ");
        Persona.Telefono = entrada.nextLine();
        System.out.println("Ingrese el Identificacion: ");
        Cliente.Identificacion = entrada.nextLine();
        
        listCliente.add(Persona.Nombre+Persona.Direccion+Persona.Telefono+Cliente.Identificacion);
    }
    
    public static void RegistrarCarro(){
        System.out.println("Registro de Carro");
        Scanner entrada = new Scanner(System.in);
        List<String> listCarro = new ArrayList<String>();
        
        System.out.println("Ingrese la Marca: ");
        Carro.Marca = entrada.nextLine();
        System.out.println("Ingrese el Modelo: ");
        Carro.Modelo = entrada.nextLine();
        System.out.println("Ingrese el Año: ");
        Carro.Año = entrada.nextInt();
        System.out.println("Ingrese el Precio: ");
        Carro.Precio = entrada.nextInt();
        System.out.println("Ingrese el Deposito: ");
        Carro.Deposito = entrada.nextInt();
        System.out.println("Ingrese el ID: ");
        Carro.IDCarro = entrada.nextLine();
        System.out.println("Ingrese la Capacidad: ");
        Carro.Capacidad = entrada.nextInt();
        
        listCarro.add(Carro.Marca+Carro.Modelo+Carro.Año+Carro.Precio+
                Carro.Deposito+Carro.IDCarro+Carro.Capacidad);
    }
    
    public static void RegistrarAgente(){
        System.out.println("Registro de Agente");
        Scanner entrada = new Scanner(System.in);
        List<String> listAgente = new ArrayList<String>();
        
        System.out.println("Ingrese el Nombre: ");
        Persona.Nombre = entrada.nextLine();
        System.out.println("Ingrese el Direccion: ");
        Persona.Direccion = entrada.nextLine();
        System.out.println("Ingrese el Telefono: ");
        Persona.Telefono = entrada.nextLine();
        System.out.println("Ingrese el ID: ");
        Agente.IDagente = entrada.nextLine();
        System.out.println("Ingrese el Sueldo: ");
        Agente.Sueldo = entrada.nextInt();
        
        listAgente.add(Persona.Nombre+Persona.Direccion+Persona.Telefono+
                Agente.IDagente+Agente.Sueldo);
    }
    
    public static void RealizarAlquiler(){
        
    }
    
    public static void ListarAlquileres(){
        
    }
    
    public static void ListarClientes(){
       
    }
    
    public static void ListarAgentes(){
        
    }
    
    public static void CobrarAlquiler(){
        
       System.out.println("Cobros");
    }
}
