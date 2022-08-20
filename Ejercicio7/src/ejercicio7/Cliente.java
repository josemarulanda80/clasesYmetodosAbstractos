/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author josem
 */
public class Cliente {
    private String nombre,apellido,dni;
    private Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
    
    public double consultar_saldo(int n){
        return cuentas[n].getSaldo();
        
    }
    public void ingresar_dinero(int n,double cantidad){
         cuentas[n].ingresarDinero(cantidad);
    }
    public void retirar_dinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
        
    }
}
