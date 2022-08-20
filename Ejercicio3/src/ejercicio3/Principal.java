/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static int indiceCocheMBarato(Vehicular coches[]){
        float precio;
        int indice=0;
        
        precio = coches[0].getPrecio();
        
        for (int i = 0; i < coches.length; i++) {
            if (coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice=i;
            }
            
        }
        return indice;
        
        
    }
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numero, indicebarato;
        System.out.println("Ingresar el numero de vehiculos");
        numero = entry.nextInt();
        
        // se crean los objetos  para los coches
        Vehicular coches[] = new Vehicular[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("\nDigite las caracteristicas del coche"+(i+1)+":");
            System.out.println("Introduzca la marca: ");
            marca=entry.next();
            System.out.println("Introduzca el modelo: ");
            modelo = entry.next();
            System.out.println("Ingrese el valor del coche");
            precio = entry.nextFloat();
            coches[i]=new Vehicular(marca,modelo,precio);
        }
        indicebarato=indiceCocheMBarato(coches);
        
        
        String mostrarDatos = coches[indicebarato].mostrarDatos();
        System.out.println("La información del auto mas barato es: "+mostrarDatos);
        
        
        
        
        
        
    }
}
