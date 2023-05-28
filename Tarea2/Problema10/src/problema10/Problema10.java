/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;

/**
 *
 * @author darav
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reserva obj = new Reserva();
        int op;
        boolean tiempo;
        do {
            System.out.println("El avion esta cerca de despegar? "
                    + "False = no/True = si:");
            tiempo = obj.entrada.nextBoolean();
            if (!tiempo) {
                op = obj.menu();
                switch (op) {
                    case 1 -> {
                        obj.Res();
                    }
                    default -> {
                    }
                }
            } else {
                System.out.println("El vuelo esta a punto de despegar, "
                        + "reserva imposible de completar");
            }
        } while (!tiempo);
    }

}
