/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author josem
 */
public class Principal {
    public static void main(String[] args){
        
       // Vehiculo misVehiculos[]=new Vehiculo[4];
        
        //misVehiculos[0]=new Vehiculo("GH67","Ferrari","A89");
        //misVehiculos[1]=new VehiculoTurismo(4,"78HJ","Audi","P14");
        //misVehiculos[2]=new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
       // misVehiculos[3]=new VehiculoFurgoneta(2000,"JIB","Toyota","J9");
        
        //for (int i = 0; i < 4; i++) {
          //  System.out.println(misVehiculos[i].mostrarDatos());
           // System.out.println("");   
        //}
        //upcasting
        //VehiculoTurismo miVehiculo = new VehiculoTurismo(4,"GT67","Ferrari","A89");
        //Vehiculo vehiculo =miVehiculo;
        
        //System.out.println(vehiculo.mostrarDatos());
        
          //dowcasting          
          
        Vehiculo vehiculo= new VehiculoDeportivo(500,"GH89","Audi","H19");
        
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
        
        System.out.println(nuevoVehiculo);
        
        
                
        
    }
}
