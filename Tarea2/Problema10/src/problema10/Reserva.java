/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema10;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Reserva {

    Scanner entrada;

    public Reserva() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Verificar espacio   [1]");
        System.out.println("Ingresar hora de partida   [2]");
        System.out.println("Iniciar reserva    [3]");
        System.out.println("MCD     [4]");
        System.out.println("Salir   [0]");
        return entrada.nextInt();
    }
    
    public int Res(int [] nf, int []fu){
        char sector;
        int evnf = 0;
        int evf = 0;
        System.out.println("Desea sector de fumadores?  [No]/[Si]");
        sector = entrada.next().charAt(0);
        if (sector == 'N') {
            if (evnf < nf.length) {
                nf[evnf] = 1;
                evnf++;
            }else{System.out.println("No hay espacio en ese sector");}   
        }else{
            if (evf<fu.length) {
                fu[evf]=1;
                evf ++;                
            }else{System.out.println("No hay espacio en ese sector");}
        }
        return evnf, evf;
    }
}
