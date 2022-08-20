/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static int menorTiempo(Atleta atletas[]){
        int indice=0;
        float tiempo;
        tiempo= atletas[0].getTiempoCarrera();
        for (int i = 0; i <atletas.length; i++) {
            if(atletas[i].getTiempoCarrera()<tiempo){
                tiempo=atletas[i].getTiempoCarrera();
                indice=i;            }
            
        }
        
        return indice;
    }
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtleta, menorTiempo;
        float tiempoCarrera;
        System.out.println("Ingrese el numero de atletas");
        nAtleta= entry.nextInt();
        
       Atleta atletas[]=new Atleta[nAtleta];
       
        for (int i = 0; i < nAtleta; i++) {
            System.out.println("\nDigite la información del atleta "+(i+1));
            System.out.println("Ingrese el numero del atleta");
            numeroAtleta= entry.nextInt();
            System.out.println("Ingrese el nombre del atleta");
            nombre=entry.next();
            System.out.println("Ingrese el tiempo de la carrera");
            tiempoCarrera=entry.nextFloat();
            atletas[i]= new Atleta(numeroAtleta,nombre,tiempoCarrera);
         
        }
        
        menorTiempo= menorTiempo(atletas);
        
        System.out.println(atletas[menorTiempo].mostrarDatosGanador());
    }
            
}
