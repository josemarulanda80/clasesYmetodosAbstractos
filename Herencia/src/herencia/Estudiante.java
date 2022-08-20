/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author josem
 */
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

   
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\napellido"+getApellido()
                +"\nEdad: "+getEdad()
                +"\nCodigo Estudiante: "+codigoEstudiante+
                "\nNota final: "+notaFinal);
        
    }
    
    
    
    
    
}
