/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquicarro;

import java.util.*;
/**
 *
 * @author user
 */
public class AlquiCarro {
    
    // TODO: crear las listas de los objetos

    public static void main(String[] args) {
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
       System.out.println("\t7. Ver Registro de Alquileres");
       
       
       System.out.println("Cobros");
       System.out.println("\t8. Cobrar Alquiler");
       
       // Capturar respuesta del usuario 
       String respuesta; // variable para guardar entradsa del usuario
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Respuesta: ");
       respuesta = entrada.nextLine();
       
       System.out.println(respuesta);
    }
    
    public static void RegistrarCliente(){
        
    }
    
    public static void RegistrarCarro(){
        
    }
    
    public static void RegistrarAgente(){
        
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
        
    }
}
