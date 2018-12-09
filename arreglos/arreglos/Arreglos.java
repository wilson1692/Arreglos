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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[];
        arreglo=new int[10];
        System.out.printf("%s%8s\n","Indice","Valor");
        for (int i = 0; i <arreglo.length; i++) {
            System.out.printf("%s%8s\n",i,arreglo[i]);
        }
    }
    
}
