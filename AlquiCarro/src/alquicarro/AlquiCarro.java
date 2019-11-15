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
    static ArrayList<Carro> listaCarro = new ArrayList<>();
    static List<String> listCliente;
    
    public static void main(String[] args) {
        // Lista de Carros
        listaCarro.add(new Carro("Toyota","Camri",2014,750000,0,"6 Personas",1));
        listaCarro.add(new Carro("Toyota","4Runner",2020,3000000,0,"6 Personas",2));
        listaCarro.add(new Carro("Lexus","LX570",2020,8000000,0,"6 personas",3));
        listaCarro.add(new Carro("Toyota","Land Cruirse PradoVXL",2020,4500000,0,"6 Personas",4));
        listaCarro.add(new Carro("Hyundai","Sante fe Sport",2020,2500000,0,"6 Personas",5));
        listaCarro.add(new Carro("Isuzu","DMAX",2020,2650000,0,"6 Personas",6));
        listaCarro.add(new Carro("Kia","Sorento",2020,2000000,0,"6 Personas",7));
        listaCarro.add(new Carro("MercedesBenz","Clase Gle450",2020,4000000,0,"6 Personas",8));
        listaCarro.add(new Carro("BMW","Serie X5",2020,5500000,0,"6 Personas",9));
        listaCarro.add(new Carro("Nissan","Frontier",2020,2000000,0,"6 Personas",10));

        String respuesta; // variable para guardar entradsa del usuario
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
                    System.out.println("\n\n\t¡Gracias por preferir AlquiCarro! Hasta la proxima...");
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
                    ListarCarros();
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
    }
    
    public static void RegistrarCliente(){
     
    }
    
    public static void RegistrarCarro(){
        // Capturar la informacion del usuario
       Scanner teclado= new Scanner(System.in);

       System.out.println("Marca: ");
       String Marca= teclado.nextLine();    // Capturando la marca del carro.
       
       System.out.println("Modelo: ");
       String Modelo= teclado.nextLine();   // Capturando el modelo del carro.
       
       System.out.println("Capacidad: ");
       String Capacidad = teclado.nextLine();   // Capturando la capacidad del carro.
       
       System.out.println("Año: ");
       int Ano = teclado.nextInt();         // Capturando el año del carro.
       
       System.out.println("Precio: ");
       int Precio = teclado.nextInt();      // Capturando el precio del carro.
       
       System.out.println("Deposito: ");
       int Deposito = teclado.nextInt();    // Capturando el deposito del carro.
       
       System.out.println("IDCarro: ");
       int IDCarro = teclado.nextInt();     // Capturando el id del carro
       
       listaCarro.add(new Carro(Marca,Modelo,Ano,Precio,Deposito,Capacidad,IDCarro));

       System.out.println(" \t 'Informacion Capturada' ");
       
       ListarCarros();
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
    
    public static String ListarClientes(){
        
        String result = "";
        
        for (int i = 0; i < listCliente.size(); i++) {
            result += listCliente.get(i).toString();
        }
        
        return result;
    }
    
    public static void ListarCarros(){
        listaCarro.stream().forEach((carro) -> {
            System.out.println(carro);
        });      
    }
    
    public static void ListarAgentes(){
        
    }
    
    public static void CobrarAlquiler(){
        System.out.println("Cobros");
    }
}
