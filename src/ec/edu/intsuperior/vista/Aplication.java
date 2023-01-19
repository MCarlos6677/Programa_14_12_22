/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Aplication {
    
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);

        Vehiculo v1= new Vehiculo ();
        v1.setModelo("BMW");
        System.out.println("Ingrese la marca");
        v1.setMarca(leer.next());
        
        
        System.out.println("El modelo del vehiculo es:"+v1.getModelo()+"\n"
                + "La marca es: "+v1.getMarca());
    }
    
}
