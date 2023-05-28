/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author darav
 */
public class Factorial {
    
    public int factorial(int num) {
        if ((num == 1) || (num == 0)) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
}
