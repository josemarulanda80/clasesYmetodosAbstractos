/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static void main(String[] args){
        Scanner entry=new Scanner(System.in);
        NumeroComplejo numero1,numero2,sum,mult;
        double a,b,c,d;
        int opcion=0,numero=0;
        
        do{
            System.out.println("\t.: Operaciones con numeros Complejos:.");
            System.out.println("1. Sumar dos numeros complejos ");
            System.out.println("2. Multiplicar dos numeros complejos");
            System.out.println("3. Comparar dos numeros complejso");
            System.out.println("4. Multiplicar un mnumero complejo por un entero");
            System.out.println("Salir");
            opcion=entry.nextInt();
           
        }while(opcion!=5);
        switch (opcion){
            case 1: System.out.println("\n Digite el primer numero complejo:");
                System.out.println("Digite la parte real: ");
                a= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                b=entry.nextDouble();
                System.out.println("\n Digite el segundo numero complejo:");
                System.out.println("Digite la parte real: ");
                c= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                d=entry.nextDouble();
                numero1 =new NumeroComplejo(a,b);
                numero2 =new NumeroComplejo(c,d);
                sum=numero1.sumarNumerosComplejos(numero2);
                System.out.println("La de los numeros complejos es " + sum.getA()+" i"+sum.getB());
                break;
                
            case 2: System.out.println("\n multiplicar dos numeros complejos");
                System.out.println("Digite la parte real: ");
                a= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                b=entry.nextDouble();
                System.out.println("\n Digite el segundo numero complejo:");
                System.out.println("Digite la parte real: ");
                c= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                d=entry.nextDouble();
                numero1 =new NumeroComplejo(a,b);
                numero2 =new NumeroComplejo(c,d);
                mult= numero1.calcularProducto(numero2);
                System.out.println("La multiplicación es "+mult.getA() +"i"+mult.getB());
                break;
            
            case 3:System.out.println("\n multiplicar dos numeros complejos");
                System.out.println("Digite la parte real: ");
                a= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                b=entry.nextDouble();
                System.out.println("\n Digite el segundo numero complejo:");
                System.out.println("Digite la parte real: ");
                c= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                d=entry.nextDouble();
                numero1 =new NumeroComplejo(a,b);
                numero2 =new NumeroComplejo(c,d);
                if (numero1.probarIgualdad(numero2)){
                    System.out.println("Los dos numeros complejos son iguales");
                    
                }
                else{
                    System.out.println("Los dos numeros conplejos son diferentes");
                }
                break;
            case 4: System.out.println("\n multiplicar dos numeros complejos");
                System.out.println("Digite la parte real: ");
                a= entry.nextDouble();
                System.out.println("Digite la parte imaginarias");
                b=entry.nextDouble();
                System.out.println("ingrese el numero entero");
                numero = entry.nextInt();
                numero1 = new NumeroComplejo(a,b);
                mult= numero1.multiplicarPorEntero(numero);
                
                System.out.println("la multiplicación entera  es "+mult.getA() +"i"+mult.getB());
                break;
            case 5 : break;
            default: System.out.println("Se equivoco al ingresar la opción porfavor intentelo de nuevo");
            
                
        }
        
        

        
    }
}
