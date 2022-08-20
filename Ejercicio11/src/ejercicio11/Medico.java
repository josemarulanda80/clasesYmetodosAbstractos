/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author josem
 */
public class Medico extends Persona{
    String titulacion;
    int añosExperencia;

    public Medico(String titulacion, int añosExperencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperencia = añosExperencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperencia() {
        return añosExperencia;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Da asistencia  en un partido de futbol");    }
    

    @Override
    public void Entrenamiento() {
        System.out.println("Da asistencia en un entrenamiento");
    }
    public void curarLesion(){
        System.out.println("Curar Lesion");
        
    }
    
    
}
