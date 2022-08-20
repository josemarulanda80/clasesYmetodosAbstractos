/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author josem
 */
public class Triangulo_Isosceles {
    double base,lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    public double obtenerPerimetro(){
        double perimetro= base+2*lado;
        return perimetro;
    }
    public double obtenerArea(){
        double area=base*lado/2;
        return area;
                
    }
    public String mostrarDatos (){
        return "La base del triangulo es "+base+ " y el lado es "+ lado;
        
    }
}
