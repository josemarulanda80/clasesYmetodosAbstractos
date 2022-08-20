/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author josem
 */
public class Atleta {
    int numeroAtleta;
    String nombre;
    float tiempoCarrera;

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    public String mostrarDatosGanador(){
        return "El numero del atleta es "+numeroAtleta+" y el nombre es "+nombre+ " con un tiempo es de "+tiempoCarrera;
        
    }
    
    
    
}
