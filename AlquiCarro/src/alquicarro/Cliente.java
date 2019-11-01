
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquicarro;

/**
 *
 * @author Alfredo G.
 */
public class Cliente extends Persona{
    
    private String Identificacion;
    
    public Cliente(String Nombre, String Direccion, String Telefono, String Identificacion){
        super(Nombre, Direccion, Telefono);
        this.Identificacion = Identificacion;
    }

      public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    
    public void Saludo() {
        System.out.println("Hola, Mi nombre: " +Nombre);
    }
}
