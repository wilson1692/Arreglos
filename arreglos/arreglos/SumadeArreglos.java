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
public class SumadeArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        int arreglo[]={6,5,4,14,11,4,67,87,54,34,21,564};
        for (int i = 0; i < arreglo.length; i++) {
            suma=suma +arreglo[i];
            System.out.printf(" \n Posicion  " + i + " \n numero " + arreglo [ i ]  );
        }
        System.out.println("la suma es " + suma );
    }
    
}
