/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probema09;

/**
 *
 * @author darav
 */
public class Calcular {
    
    public void Cal(int [] a){
      int sumap = 0;
      int sumai = 0;
      
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                sumap = sumap + a[i];
            }else{
                sumai = sumai + a[i];
            }
        }
        System.out.println("La suma de los numeros pares de la lista es: " +
                sumap + "\nLa suma de los numeros impares de la lista es: " + 
                sumai);
    }
}
