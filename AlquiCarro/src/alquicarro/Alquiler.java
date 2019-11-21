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
        public String IDagente;
        public String Carro;
        public int SubTotal;
        public int ITBIS;
        public int Total;
        public String fecha;
        public String Condicion;

    public Alquiler(String Cliente, String IDagente, String Carro, int SubTotal, int ITBIS, int Total, String fecha, String Condicion) {
        this.Cliente = Cliente;
        this.IDagente = IDagente;
        this.Carro = Carro;
        this.SubTotal = SubTotal;
        this.ITBIS = ITBIS;
        this.Total = Total;
        this.fecha = fecha;
        this.Condicion = Condicion;
    }

    Alquiler(int idcliente, int idagente, int idcarro, int subtotal, int itbis, int total, int fecha, String condicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
}

