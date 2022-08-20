/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author josem
 */
public class Cuadrilatero {
    float lado1,lado2,area,perimetro;

    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
    }

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public float getPerimetro(){
        perimetro = lado1*2+lado2*2;
        return perimetro;
    }
    public float getArea(){
        area= lado1*lado2;
        return area;
    }
    
}
