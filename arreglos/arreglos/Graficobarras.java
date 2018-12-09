/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Wilson
 */
public class Graficobarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = { 1, 2, 4, 2, 1};
        System.out.println("Distribucion de calificaciones:");

        for (int contador = 0; contador < arreglo.length; contador++) {
            if (contador == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", contador * 6, contador * 10 + 5);
            }

            for (int estrellas = 0; estrellas < arreglo[contador]; estrellas++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
    }
    
}
