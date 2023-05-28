/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

/**
 *
 * @author darav
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrado obj = new Cuadrado();
        
        int [] arreglo = new int [100];
        arreglo = obj.llenarA(arreglo);
        obj.cuad(arreglo);
    }
    
}
