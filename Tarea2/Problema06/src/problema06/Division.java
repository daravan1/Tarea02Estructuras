/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema06;

/**
 *
 * @author darav
 */
public class Division {

    public double[] div(double[] a, int n) {

        for (int i = 0; i < a.length; i++) {

            a[i] = a[i] / a[n];
        }
        return a;
    }
}
