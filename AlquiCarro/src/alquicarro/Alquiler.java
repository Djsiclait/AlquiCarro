/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquicarro;

/**
 *
 * @author user
 */
public class Alquiler {
    
   public String Cliente;
   public String Agente;
   public String Carro;
   public int SubTotal;
   public int ITBIS;
   public int Total;
   public String fecha;
   public String Condicion;

    public Alquiler(String Cliente, String Agente, String Carro, int SubTotal, int ITBIS, int Total, String fecha, String Condicion) {
        this.Cliente = Cliente;
        this.Agente = Agente;
        this.Carro = Carro;
        this.SubTotal = SubTotal;
        this.ITBIS = ITBIS;
        this.Total = Total;
        this.fecha = fecha;
        this.Condicion = Condicion;
    }
   
   
    
}

