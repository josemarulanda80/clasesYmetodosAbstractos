/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesyObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Main {
    public static void main (String [] args){
        Operacion op = new Operacion();
        int numero1=Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el primer numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el segundo numero"));
        op.sumar(numero1,numero2);
        op.restar(numero1,numero2);
        op.multiplicar(numero1,numero2);
        op.dividir(numero1,numero2);
        op.mostrarResultados(numero1,numero2);
    }
    
}
