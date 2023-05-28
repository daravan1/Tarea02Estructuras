/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Division obj = new Division();

        double[] arreglo = {1, 7, 5, 45, 89, 14};
        System.out.println("Ingrese el valor a dividir:");
        int n = entrada.nextInt();
        double [] arreglo2 = obj.div(arreglo, n);
        
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
    }

}
