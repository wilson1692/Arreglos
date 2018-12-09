/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximonumero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson
 */
public class Maximonumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int datos[];
        int suma, producto;
        System.out.println("ingrese el tamaño del arreglo ");
        int tamanio = new Scanner(System.in).nextInt();
        datos = new int[tamanio];
        IngresarElementos(datos);
        MaximoyMinimo(datos);
        NumeroPar(datos);
        NumeroImpar(datos);
        
    }

    private static void IngresarElementos(int[] datos) {
        for (int i = 0; i <datos.length; i++) {
            System.out.println("N°" + i );
            datos[i]=new Scanner(System.in).nextInt();
        }
 
    }

    private static void MaximoyMinimo(int[] datos) {
        int a=0;
        int max=datos[0];
        int min=datos[0];
        for (int i = 0; i < datos.length; i++) {
            int numero=datos[i];
            if(numero>max)
                max=numero;
            if(numero<min)
                min=numero;
        }
        System.out.println("El numero maximo es :" + max);
        System.out.println("El numero minimo es :" + min);
        double raiz=Math.sqrt(max);
        System.out.println("La raiz del Numero Maximo es : " + raiz);
        int res=1;
        for (int i = 1; i <=raiz; i++) {
            res=res*i;
        }
        System.out.println("El Factorial de la raiz de : " + raiz + " es " + res);
        for (int i = 1; i <= raiz; i++) {
                if (raiz % i == 0) {
                    a++;
                }

            }
            if (a != 2) {
                System.out.println("EL NUMERO " + raiz + " no es primo ");

            } else {
                System.out.println("EL NUMERO " + raiz + " es primo ");
            }
        
    }


    private static void NumeroPar(int[] datos) {
        for (int i = 0; i <datos.length; i++) {
            if(datos[i]%2==0)
                System.out.println("el numero " + datos[i] + " es par ");
        }
    }

    private static void NumeroImpar(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            if(datos[i]%2!=0)
                System.out.println("El numero " + datos[i] + " es impar");
        }
    }

}


  
    

