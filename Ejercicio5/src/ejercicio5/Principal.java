/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static int indiceMayorArea( Triangulo_Isosceles isoseles[]){
        double areaRec;
        int indice = 0;
        
        areaRec=isoseles[0].obtenerArea();
        
       
        for (int i = 0; i <isoseles.length ; i++) {
            if(isoseles[i].obtenerArea()>areaRec){
                areaRec=isoseles[i].obtenerArea();
                indice=i;
               
                
            }
        }
         return indice;
    }
    public static void main(String[] args){
      Scanner entry = new Scanner(System.in);
      double  lado,base;
      int number;
      System.out.println("Cual es el numero de triangulos");
      number = entry.nextInt();
      Triangulo_Isosceles isoceles[] = new Triangulo_Isosceles[number];
 
        for (int i = 0; i < number; i++) {
            System.out.println("\nIngrese la informacion del triangulo "+(i+1));
            System.out.println("Ingrese la base");
            base=entry.nextDouble();
            System.out.println("Ingrese el lado");
            lado=entry.nextDouble();
            isoceles[i]=new Triangulo_Isosceles(base,lado);
        }
        int indice = indiceMayorArea(isoceles);
        
        System.out.println(isoceles[indice].mostrarDatos() + "con un area de: "+isoceles[indice].obtenerArea());

    }

      
            
}
