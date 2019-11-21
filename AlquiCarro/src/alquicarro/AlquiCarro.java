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
    static ArrayList<Cliente> listaCliente= new ArrayList<>();
    static ArrayList<Alquiler> listaAlquiler= new ArrayList<>();
    
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
       Scanner teclado= new Scanner(System.in);
       System.out.println("Registrar Cliente");
      
       System.out.println("Nombre: ");       
       String nombre= teclado.nextLine();   //Capturando el nombre del cliente.
       
       System.out.println("Direccion: ");    
       String direccion= teclado.nextLine();  //Capturando la direccion del cliente.
       
       System.out.println("Telefono: ");
       int telefono= teclado.nextInt();    //Capturando el telefono del cliente. 
       
       System.out.println("ID del Cliente: ");
       int identificacion= teclado.nextInt();   //Capturando la identificacion del cliente.
       
       listaCliente.add(new Cliente(nombre,direccion,telefono,identificacion));
       
       System.out.println(" \t 'Informacion Capturada' ");
          
       ListarClientes();
    }
    
    public static void RegistrarCarro(){
        // Capturar la informacion del usuario
       System.out.println("Registro de carro");
       Scanner teclado= new Scanner(System.in);

       System.out.println("Marca: ");
       String marca= teclado.nextLine();    // Capturando la marca del carro.
       
       System.out.println("Modelo: ");
       String modelo= teclado.nextLine();   // Capturando el modelo del carro.
       
       System.out.println("Capacidad: ");
       String capacidad = teclado.nextLine();   // Capturando la capacidad del carro.
       
       System.out.println("Año: ");
       int ano = teclado.nextInt();         // Capturando el año del carro.
       
       System.out.println("Precio: ");
       int precio = teclado.nextInt();      // Capturando el precio del carro.
       
       System.out.println("Deposito: ");
       int deposito = teclado.nextInt();    // Capturando el deposito del carro.
       
       System.out.println("IDCarro: ");
       int iDCarro = teclado.nextInt();     // Capturando el id del carro
       
       listaCarro.add(new Carro(marca,modelo,ano,precio,deposito,capacidad,iDCarro));

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
        Persona.Telefono = entrada.nextInt();
        
        System.out.println("Ingrese el ID: ");
        Agente.IDagente = entrada.nextLine();
        
        System.out.println("Ingrese el Sueldo: ");
        Agente.Sueldo = entrada.nextInt();
        
        listAgente.add(Persona.Nombre+Persona.Direccion+Persona.Telefono+
                Agente.IDagente+Agente.Sueldo);
    }
    
    public static void RealizarAlquiler(){
       System.out.println("Registro de Alquiler");  
       Scanner teclado= new Scanner(System.in);
      
       System.out.println("ID del Cliente:  ");
       int idcliente= teclado.nextInt();        //Capturando ID del Cliente.
       
       System.out.println("ID del Agente:  ");
       int idagente= teclado.nextInt();        //Capturando ID del Agente.
      
       System.out.println("ID del Carro:  ");
       int idcarro= teclado.nextInt();      //Capturando ID del Carro. 
      
       System.out.println("Sub Total: ");
       int subtotal= teclado.nextInt();   //Capturando el SubTotal.
      
       System.out.println("ITBIS: ");
       int itbis= teclado.nextInt();    //Capturando el ITEBIS.
      
       System.out.println("Total: ");
       int total= teclado.nextInt();    //Capturando el Total.
      
       System.out.println("Fecha: ");
       int fecha= teclado.nextInt();       // Capturando la fecha en que fue realizado.
      
       System.out.println("Condicion: ");
       String condicion= teclado.nextLine();  //Capturando la condicion. 
      
       listaAlquiler.add(new Alquiler(idcliente,idagente,idcarro,subtotal,itbis,total,fecha,condicion));
      
       System.out.println(" \t 'Informacion Registrada' ");
      
       ListarAlquileres();
      
    }
    
    public static void ListarAlquileres(){
        
            for (int i = 0; i < listaAlquiler.size(); i++) {
               listaAlquiler.get(i).toString();
        }
    }
    
    public static String ListarClientes(){
        
        String result = "";
        
        for (int i = 0; i < listaCliente.size(); i++) {
            result += listaCliente.get(i).toString();
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
