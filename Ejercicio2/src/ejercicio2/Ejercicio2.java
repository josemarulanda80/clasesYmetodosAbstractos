/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Ejercicio2 {
public static void main(String[] args){
    Scanner entry= new Scanner(System.in);
    Tablero t1;
    int x,y,increment=0,opcion;
    System.out.println("Ingrese la coordenada x");
    x= entry.nextInt();
    System.out.println("Ungrese la coordenada y");
    y= entry.nextInt();
   
    t1= new Tablero(x,y);
    do {
        System.out.println("\n\t.:Menu:.");
        System.out.println("1. Mover hacia ARRIBA");
        System.out.println("2. Mover hacia Abajo");
        System.out.println("3. Mover hacia la DERECHA");
        System.out.println("4. Mover hacia la IZQUIERDA");
        System.out.println("5. Salir");
        System.out.println("Digite la opción: ");
        opcion=entry.nextInt();
        
        if(opcion !=5){
            System.out.println("\nDigite la cantidad de espacios a moverse:");
            increment= entry.nextInt();
           
        }
        switch  (opcion){
            case 1 : t1.moverArriba(increment);
            case 2 : t1.moverAbajo(increment);
            case 3 : t1.moverDerecha(increment);
            case 4 : t1.moverIzquierda(increment);
            case 5 : break;
            default: System.out.println("Se equivoco al ingresar la ioción porfavor intentelo de nuevo");
            
        }
        
        
        
        System.out.println("\nPosicion Actual(X,Y): ("+t1.getX()+","+t1.getY()+")");
        
        
    } while (opcion !=5);
    
}
    
}
