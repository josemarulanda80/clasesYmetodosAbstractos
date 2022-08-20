/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author josem
 */
public class Triangulo extends Poligono {

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", numero de lados:" + super.toString() + '}';

    }
    
    @Override
    public double area(){
        double p=(lado1+lado2+lado3);
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }

}
