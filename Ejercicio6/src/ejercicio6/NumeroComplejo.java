/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author josem
 */
public class NumeroComplejo {
    private double a,b;

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public NumeroComplejo sumarNumerosComplejos(NumeroComplejo c){
        NumeroComplejo suma= new NumeroComplejo(a+c.getA(),b+c.getB());
        return suma;
    }
    public NumeroComplejo restarNumerosComplejos(NumeroComplejo c){
        NumeroComplejo resta= new NumeroComplejo(a-c.getA(),b-c.getB());
        return resta;
    }
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo(a*c.getA()-b*c.getB(),(a*c.getB()+b*c.getA()));
        return mult;
    }
    
    public boolean  probarIgualdad(NumeroComplejo c){
        if(c.getA()==a){
            if (c.getB()==b) {
                System.out.println("Son iguales");
                return true;
            }else{
                System.out.println("No son iguales");
                return false;
            }
        }
        return false;
    }
    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo mult = new NumeroComplejo(a*x,b*x);
        return mult;
    }
    

    
}
