/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static int buscarSucursal (Sucursal t[],int numeroSucursal,int contadorSucursal){
        int indice=0;
        boolean encontrado=true;
        for (int i = 0; i < contadorSucursal; i++) {
            if (t[i].getNumeroSucursal()==numeroSucursal) {
                encontrado=true;
                indice=i;
                
            }    
        }
        if (encontrado==false) {
            indice=-1;
            
            
        }
        return indice;
        
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeroSucursal,numeroPaquete,prioridad,opcion,contadorSucursal=0,contadorPaquete=0,indiceSucursal;
        String direcion,ciudad,dni;
        double peso;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[]=new Paquete[100];
        
        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultado sucursal");
            System.out.println("4 consultar paquete");
            System.out.println("5 Mosttrar todas las sucursales");
            System.out.println("6 Mostrar todos los paquetes");
            System.out.println("7 salir");
            System.out.println("Digite la opcion de menu:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: System.out.println("\nDigite el numero de sucursal: ");
                        numeroSucursal=entrada.nextInt();
                        System.out.println("Digite la direccion: ");
                        direcion=entrada.nextLine();
                        System.out.println("Digite la ciudad");
                        ciudad=entrada.nextLine();
                        
                        sucursal[contadorSucursal]=new Sucursal(numeroSucursal,direcion,ciudad);
                        contadorSucursal++;
                        break;
                case 2: System.out.println("\nDigite el numero de Sucursal ");       
                        numeroSucursal= entrada.nextInt();
                        indiceSucursal = buscarSucursal(sucursal,numeroSucursal,contadorSucursal);
                        if (indiceSucursal==-1) {
                            System.out.println("La sucursal no existe");
                            
                        
                    }else {
                        System.out.println("\nDigite el numero de paquete");
                        numeroPaquete=entrada.nextInt();
                        System.out.println("Digite el dni de la persona: ");
                        dni = entrada.nextLine();
                        System.out.println("Digite el peso del paquete:");
                        peso= entrada.nextDouble();
                        System.out.println("Digite la propiedad (0=normal, 1=alta, 2= express)");
                        prioridad=entrada.nextInt();
                        
                        paquete[contadorPaquete]=new Paquete(numeroPaquete,dni,peso,prioridad);
                        
                        double precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
                        
                            System.out.println("\n El precio del pauqete es: "+ precioPaquete);
                            
                        
                
                        
                        contadorPaquete++;
                        
                        
                        
                        }
                        break;
                        
            }
           
            
        } while (opcion !=7);
                
    }
}
