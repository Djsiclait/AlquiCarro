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
public class Carro {
    
    public String Marca;
    public String Modelo;
    public int Año;
    public int Precio;
    public int Deposito;
    public String IDCarro;
    public int Capacidad;

    public Carro(String Marca, String Modelo, int Año, int Precio, int Deposito, String IDCarro, int Capacidad) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Precio = Precio;
        this.Deposito = Deposito;
        this.IDCarro = IDCarro;
        this.Capacidad = Capacidad;
    }
    
    
}
