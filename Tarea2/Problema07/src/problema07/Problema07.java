/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

/**
 *
 * @author darav
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Metodos obj = new Metodos();
        System.out.println("Ingrese el tamanio del arreglo:");
        n = obj.entrada.nextInt();
        int[] miArreglo = new int[n];
        int ev = 0;
        
        obj.insMedio(miArreglo, ev);
    }
    
}
