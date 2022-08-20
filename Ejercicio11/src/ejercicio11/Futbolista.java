/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author josem
 */
public class Futbolista extends Persona {
    int dorsal;
    String posición;

    public Futbolista(int dorsal, String posición, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posición = posición;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosición() {
        return posición;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega el partido de Futbol");
    }

    @Override
    public void Entrenamiento() {
        System.out.println("Entrena");
        }
    public void Entrevista(){
        System.out.println("Da una entrevista");
        
    }
    
}
