/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
/**
 *
 * @author darav
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primo obj = new Primo();

        int[] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = obj.primo(i + 1);
        }
    }
}
