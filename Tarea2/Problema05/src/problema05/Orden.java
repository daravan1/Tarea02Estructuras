/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema05;

/**
 *
 * @author darav
 */
public class Orden {

    public void Ord(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("El arreglo esta desordenado");
                break;
            }
        }

    }
}
