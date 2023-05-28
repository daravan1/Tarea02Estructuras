/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author darav
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Factorial obj = new Factorial();
        int[] arregloA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arregloB = new int[10];
        for (int i = 0; i < arregloA.length; i++) {
            arregloB[i] = obj.factorial(arregloA[i]);
        }
    }

}
