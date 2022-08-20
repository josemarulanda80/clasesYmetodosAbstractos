/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author josem
 */
public class Sucursal {
   private int numeroSucursal;
   private String direccion,ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String mostrarDatosPaquete(){
        return "Numero paquete: "+ numeroSucursal
                +"\nDNI: "+direccion
                +"\nPeso:"+ciudad;
    }
    public double calcular_precio (Paquete t){
        double precio;
        precio = t.getPeso();
        if (t.getPrioridad()==1) {
            precio+=10;
            
        }
        if (t.getPrioridad()==2) {
            precio+=20;
            
        }
        return precio;
    }
  
}
