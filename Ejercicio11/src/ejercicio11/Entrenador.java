/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author josem
 */
public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }
    public String getEstrategia(){
        return estrategia;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un partido de Futbol");
    }

    @Override
    public void Entrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }
    
    public void PlanificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }

  
    
}
