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
public class OperacionesArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int LONGITUD_ARREGLO = 10;
        int arreglo[] = new int[LONGITUD_ARREGLO];
        for (int contador = 0; contador < arreglo.length; contador++) {
            arreglo[contador] = 2 + 2 * contador;
        }
        System.out.printf("%s%8s\n", "Indice", "Valor");
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }
    }
}


