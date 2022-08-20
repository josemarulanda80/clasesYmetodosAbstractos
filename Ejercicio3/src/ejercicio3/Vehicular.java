/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author josem
 */
public class Vehicular {
    String marca,modelo;
    float precio;

    public Vehicular(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public float getPrecio(){
        return precio;
    }
    public String mostrarDatos(){
        return "La marca del vehiculo es "+ marca +" con modelo "+modelo +" con un valor de "+ precio;
        
    }
    
}
