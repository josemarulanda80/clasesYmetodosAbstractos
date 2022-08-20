/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Principal {
    public static int buscarNumeroCuenta(Cuenta cuentas[],int n){
        int i=0,indice=0;
        boolean encontrado=true;
        //Busqueda Secuencial
        while((i<cuentas.length)&&(encontrado==false)){
            if (cuentas[i].getNumeroCuenta()==n) {
                encontrado=true;
                indice =i;
                
            }
            i++;
            
        }
        if (encontrado==false) {
            indice=-1;
        }
            return indice;
        
    }
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre,apellido,dni;
        int nCuentas,numeroCuenta,opcion,indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.println("Digite el nimbre del cliente:");
        nombre= entrada.nextLine();
        System.out.println("Digite el apellido del cliente");
        apellido= entrada.nextLine();
        System.out.println("Digite el DNI del cliente");
        dni=entrada.nextLine();
        System.out.println("Numero de cuentas que tiene el cliente");
        nCuentas = entrada.nextInt();
        
        cuentas = new Cuenta[nCuentas];
        
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta "+(i+1)+":");
            System.out.println("Digite el numero de cuenta:");
            numeroCuenta = entrada.nextInt();
            System.out.println("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();
            
            cuentas[i]=new Cuenta(numeroCuenta, saldo);
            
            
        }
        cliente = new Cliente(nombre,apellido,dni,cuentas);
        
        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresa dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. salir");
            System.out.println("Digite la opción de menú:");  
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: System.out.println("\n digite el numero de cuenta:");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);
                    
                    if (indiceCuenta ==-1) {
                        System.out.println("\n El numero de ucenta ingresado no existe");
                        
                    }
                    else{
                        System.out.println("\n Digite la cantidad de dinero a ingresar");
                        cantidad= entrada.nextDouble();
                        
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado exitosamente");
                        System.out.println("saldo disponible:"+cliente.consultar_saldo(indiceCuenta));
                        
                        
                    }
                    break;
                case 2: System.out.println("\n Digite el numero de cuenta");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);
                        if (indiceCuenta==-1) {
                            System.out.println("\n El numero de cuenta ingresado no existe");
                        
                        
                    }else{
                            System.out.println("\n Digite la cantidad de dinero que desea retirar:");
                            cantidad = entrada.nextDouble();
                            if (cantidad>cliente.consultar_saldo(indiceCuenta)) {
                                System.out.println("El saldo es insuficiente");
                                
                                
                            }else{
                                cliente.retirar_dinero(indiceCuenta, cantidad);
                                System.out.println("\n Retiro realizado correctamente");
                                System.out.println("saldo disponible "+ cliente.consultar_saldo(opcion));
                            }
                            
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\n retiro relizado correctamente");
                            System.out.println("Saldo disponible: " +cliente.consultar_saldo(indiceCuenta));
                        }
                
                    break;
                case 3: System.out.println("\n Digite el numero de cuenta");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);
                        if (indiceCuenta==-1) {
                            System.out.println("\n El numero de cuenta ingresado no existe");
                        
                        
                    }else{
                            System.out.println("\nSaldo disponible: "+cliente.consultar_saldo(indiceCuenta));
                            
                           
                        }
                        break;
                        
                
                case 4: break;
                default: System.out.println("Erro, no ha escogido una opción valida ");
                    
                    
            }
            
        } while (opcion !=4);
        
                
        
        
    }
    
}
