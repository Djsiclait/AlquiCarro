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
public class Agente extends Persona{

    public static String IDagente;
    public static int Sueldo;

    public Agente(String IDagente, int Sueldo, String Nombre, String Direccion, String Telefono) {
        super(Nombre, Direccion, Telefono);
        this.IDagente = IDagente;
        this.Sueldo = Sueldo;
    }

    public String getIDagente() {
        return IDagente;
    }

    public void setIDagente(String IDagente) {
        this.IDagente = IDagente;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
}
