/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado1,lado2;
        Cuadrilatero c1;
        lado1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 2"));
        
        if (lado1==lado2) {
          c1 = new Cuadrilatero(lado1);
            
        }else{
          c1 = new Cuadrilatero(lado1,lado2);
            
        }
        System.out.println("El perimetro es "+c1.getPerimetro());
        System.out.println("El area es "+c1.getArea());
        
    }
    
}
