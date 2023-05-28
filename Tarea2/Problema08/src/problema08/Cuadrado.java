/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema08;

/**
 *
 * @author darav
 */
public class Cuadrado {
    
    public void cuad(int [] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
            System.out.println(a[i]);
        }
    }
    
    public int [] llenarA(int [] a){
    for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
    return a;
    }
}
