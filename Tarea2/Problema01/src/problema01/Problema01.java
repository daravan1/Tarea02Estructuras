/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author darav
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar el tamanio de la lista:");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        System.out.println("El arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * -5) + 1;
            System.out.println(arreglo[i]);
        }
        int contc = 0;
        int contme = 0;
        int contma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                contc++;
            } else if (arreglo[i] < 0) {
                contme++;
            } else {
                contma++;
            }
        }
        System.out.println("tiene:\n" + contc + " ceros\n" + contme + 
                " numeros menores a cero\n" + contma + " numeros mayores a cero" );
    }

}
