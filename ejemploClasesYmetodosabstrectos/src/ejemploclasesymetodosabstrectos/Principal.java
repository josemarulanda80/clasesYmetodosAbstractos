/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploclasesymetodosabstrectos;

/**
 *
 * @author josem
 */
public class Principal {
    public static void main(String[] args){
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        
        planta.alimentarse();
        animalC.alimentarse();
                
    }
}
