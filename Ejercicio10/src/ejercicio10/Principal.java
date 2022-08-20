/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();
        
    }

    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                opcion = entry.nextInt();
            } while (opcion<1 || opcion >2);
          switch(opcion){
                case 1: llenarTriangulo();
                    break;
                case 2:llenarRectangulo();
                    break;
            
          }
            System.out.println("\nDesea introducir otro poligono[s/n]");
            respuesta=entry.next().charAt(0);
            System.out.println("");
        } while (respuesta =='s' || respuesta =='S');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.println("\nDigite el lado1 del triangulo: ");
        lado1=entry.nextDouble();
        System.out.println("\nDigite el lado2 del triangulo: ");
        lado2=entry.nextDouble();
        System.out.println("\nDigite el lado3 del triangulo: ");
        lado3=entry.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        
        poligono.add(triangulo);     
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.println("\nDigite de lado1 del rectangulo: ");
        lado1=entry.nextDouble();
        System.out.println("\nDigite el lado2 del rectangulo: ");
        lado2=entry.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
        
        
        
    }
    public static void mostrarResultados(){
        for (Poligono poli:poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: " +poli.area());
            System.out.println(" ");
        }
        
    }

}
