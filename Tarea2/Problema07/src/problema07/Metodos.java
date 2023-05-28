/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema07;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Metodos {

    Scanner entrada;

    public Metodos() {

        this.entrada = new Scanner(System.in);
    }

    public void recorreDer(int[] x, int ev, int pos) {
        for (int i = ev; i < pos; i--) {
            x[i] = x[i - 1];
        }
    }

    public int insMedio(int[] x, int ev) {
        int pos = 0;
        int n;
        if (ev < x.length) {
            System.out.println("Ingrese el numero a insertar:");
            n = entrada.nextInt();
            if (ev == 0) {
                x[ev] = n;
                ev++;
            } else {
                while ((pos < ev) && (n > x[pos])) {
                    pos++;
                    recorreDer(x, ev, pos);
                    x[pos] = n;
                }
            }
            ev++;
        } else {
            System.out.println("Espacio insuficiente");
        }
        return ev;
    }
}
