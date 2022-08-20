/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesymetodos;

/**
 *
 * @author josem
 */
class FiguraCuadrada extends FiguraCerrada {
    private double area;

    public FiguraCuadrada(double area, double tamaño, int nLado) {
        super(tamaño, nLado);
        this.area = area;
    }
    
    public void Dibujar(){
        System.out.println("Dibujar un cuadrado");
    }
    
}
