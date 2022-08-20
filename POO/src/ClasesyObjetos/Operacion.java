/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Operacion {
    // Atributos
//    int suma;
  //  int resta;
   // int multiplicacion;
    //int division;
    
    //Métodos
    
    //Método para pedirle a un usuario que nos digite 2 números 

    public int sumar(int numero1, int numero2){
        int suma= numero1+numero2;
        return suma;
    }
    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
        
    }
    public int multiplicar(int numero1, int numero2){
        int multiplicacion= numero1*numero2;
        return multiplicacion;
        
    }
    public int dividir(int numero1, int numero2){
        int division=numero1/numero2;
        return division;
    }
    public void mostrarResultados(int numero1,int numero2){
        System.out.println("La suma es: "+ sumar(numero1,numero2));
        System.out.println("La resta es: "+restar(numero1,numero2));
        System.out.println("la multiplicacion es: "+multiplicar(numero1,numero2));
        System.out.println("la dividision es "+dividir(numero1,numero2));
    }


    
    
}
