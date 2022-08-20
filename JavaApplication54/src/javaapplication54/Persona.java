/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication54;

/**
 *
 * @author josem
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public Persona(String dni) {
        this.dni = dni;
    }
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y  estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He corrido "+km+ " kilometros");
    }
    
    
    
}
