/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author josem
 */
public class Rectangulo extends Poligono {
    private double lado1,lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return  "Rectangulo con \nlado1=" + lado1 + ", \nlado2=" + lado2 +"con numero de lados "+super.toString();  
        
    }
    @Override
    public double area(){
        double areaR=lado1*lado2;
        return areaR;
                
    }
    
    
}
