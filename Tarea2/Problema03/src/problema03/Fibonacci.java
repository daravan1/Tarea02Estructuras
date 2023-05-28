/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author darav
 */
public class Fibonacci {

    public int fibo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }
}
