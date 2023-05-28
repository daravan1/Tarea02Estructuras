/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author darav
 */
public class Primo {

    public int primo(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (esPrimo(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
        return -1; 
    }
    
    public boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}





