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
    
    public static String Identificacion;
    
    public Cliente(String Nombre, String Direccion, int Telefono, int Identificacion){
        super(Nombre, Direccion, Telefono);
        
    }

      public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    
    @Override
    public String toString() {
        return "Identificacion: "+Identificacion+"\nNombre: "+Nombre+""
                + "\nDireccion: "+Direccion+"\nTelefono: "+Telefono;
    }

    
}
