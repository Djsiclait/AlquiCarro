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
    public String Capacidad;
    public int IDCarro;

 public Carro( String Marca, String Modelo, int Año, int Precio, int Deposito, String Capacidad, int IDCarro) {
    this.Marca = Marca;
    this.Modelo = Modelo;
    this.Año = Año;
    this.Precio = Precio;
    this.Deposito = Deposito;
    this.Capacidad = Capacidad;
    this.IDCarro = IDCarro;
    
   }

    Carro(String string) {
    }

    Carro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getDeposito() {
        return Deposito;
    }

    public void setDeposito(int Deposito) {
        this.Deposito = Deposito;
    }

    public int getIDCarro() {
        return IDCarro;
    }

    public void setIDCarro(int IDCarro) {
        this.IDCarro = IDCarro;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    @Override
    public String toString() {
    return "\nMarca= "+Marca+"\nModelo= "+Modelo+"\nAño= "+Año+"\nPrecio= "+Precio+"\nDeposito= "+Deposito+"\nCapacidad= "+Capacidad+"\nIDCarro="+IDCarro+"\n";
    }
    
    
}
