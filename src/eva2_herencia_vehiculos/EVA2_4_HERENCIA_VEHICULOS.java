/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_herencia_vehiculos;

/**
 *
 * @author IvanTron
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Vehiculos {
    private String tipoCombustible;
    private int numLlantas;
    private int capacidadMotor;
    private int cilindrosMotor;
    private int capacidadPasajeros;
    private String Marca;
    private String Modelo;
    private int Año;

    public Vehiculos() {
        this.tipoCombustible = "";
        this.numLlantas = 0;
        this.capacidadMotor = 0;
        this.cilindrosMotor = 0;
        this.capacidadPasajeros = 0;
        this.Marca = "";
        this.Modelo = "";
        this.Año = 0;
    }

    public Vehiculos(String tipoCombustible, int numLlantas, int capacidadMotor, int cilindrosMotor, int capacidadPasajeros, String Marca, String Modelo, int Año) {
        this.tipoCombustible = tipoCombustible;
        this.numLlantas = numLlantas;
        this.capacidadMotor = capacidadMotor;
        this.cilindrosMotor = cilindrosMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
    }

    
    
    
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(int capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public int getCilindrosMotor() {
        return cilindrosMotor;
    }

    public void setCilindrosMotor(int cilindrosMotor) {
        this.cilindrosMotor = cilindrosMotor;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
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
    
    public void imprimirDatos() {
        System.out.println("Tipo de combustible: " +  this.tipoCombustible + "\nNumero de llantas: " + this.numLlantas + 
        "\nCapacidad del motor: " + this.capacidadMotor + " L" + "\nCilindros del motor: " + this.cilindrosMotor + 
        "\nCapacidad de pasajeros: " + this.capacidadPasajeros + "\nMarca: " +  this.Marca + "\nModelo: " +  this.Modelo + 
        "\nAño: " +  this.Año);
    }
}

