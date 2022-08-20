/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication54;

/**
 *
 * @author josem
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona("José Alejandro Marulanda Marulanda ",25);
        
        Persona p2 =new Persona("123456");
        
        p1.correr();
        p2.correr(10);
        
    }
    
}
