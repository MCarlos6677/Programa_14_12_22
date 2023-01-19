/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Lenovo
 */
public class Vehiculo {
    
    private String modelo;    
    private String marca;
    private int nummatricula;
    private int año;

    public Vehiculo (){
    
    }
    
    
    public Vehiculo(String modelo, String marca, int nummatricula, int año){
        this.modelo = modelo;        
        this.marca = marca;        
        this.nummatricula = nummatricula;        
        this.año = año;  
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNummatricula() {
        return nummatricula;
    }

    public void setNummatricula(int nummatricula) {
        this.nummatricula = nummatricula;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
