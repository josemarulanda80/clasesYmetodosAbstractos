/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesymetodos;

/**
 *
 * @author josem
 */
final public class FiguraCerrada extends Figura {
    private int nLado;

    public FiguraCerrada( double tamaño,int nLado) {
        super(tamaño);
        this.nLado = nLado;
    }
    public void dibujar(){
        System.out.println("Dibujo de una figura cerrada");
        
    }
    
    
    
}
