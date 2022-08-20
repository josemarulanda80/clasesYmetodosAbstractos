/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author josem
 */
public class VehiculoTurismo extends Vehiculo{
    private int numeroPueras;

    public VehiculoTurismo(int numeroPueras, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPueras = numeroPueras;
    }

    public int getNumeroPueras() {
        return numeroPueras;
    }
    
    @Override
     public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+numeroPueras;
        
    }
    
    
    
}
