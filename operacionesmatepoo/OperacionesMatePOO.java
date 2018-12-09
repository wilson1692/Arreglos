/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatepoo;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson
 */
public class OperacionesMatePOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        double resultado = 1;
        try {
            do {
                menupantalla();
                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1:
                        sumar();
                        break;
                    case 2:
                        multiplicar();
                        break;
                    case 3:
                        factorial();
                        break;
                    case 4:
                        resta();
                        break;
                    case 5:
                        tangente();
                        break;
                    case 6:
                        seno();
                        break;
                    case 7:
                        coseno();
                        break;
                    case 8:
                        System.out.println("gracias por uuar el programa");
                        break;
                    default:
                        System.out.println("la opcion ingresada no es correcta");
                        break;
                }

            } while (opcion != 8);
        } catch (Exception e) {
            System.out.println("EL VALOR INGRESADO ES INCORRECTO");;
        }
    }

    private static void menupantalla() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. sumar ");
        System.out.println("2. multiplicar ");
        System.out.println("3. factorial ");
        System.out.println("4. restar ");
        System.out.println("5. tangente");
        System.out.println("6. seno ");
        System.out.println("7. coseno ");
        System.out.println("8. salir");
        System.out.println("ingrese una opcion");

    }

    private static void sumar() {
        int n1, n2;
        System.out.println("BIENVENIDO A LA OPCION SUMA");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        System.out.println("INGRESE NUMERO 2");
        n2 = new Scanner(System.in).nextInt();
        int resultado = n1 + n2;
        System.out.println("EL RESULTADO DE LA SUMA DE " + n1 + " + " + n2 + " = " + resultado);
    }

    private static void multiplicar() {
        int n1, n2;
        System.out.println("BIENVENIDO A LA OPCION PRODUCTO");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        System.out.println("INGRESE NUMERO 2");
        n2 = new Scanner(System.in).nextInt();
        int resultado = n1 * n2;
        System.out.println("EL PRODUCTO DE " + n1 + " * " + n2 + " = " + resultado);
    }

    private static void factorial() {
        int n1, resultado = 1;
        System.out.println("BIENVENIDO A LA OPCION FACTORIAL");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n1; i++) {
            resultado = resultado * i;
        }
        System.out.println("EL FACTORIAL DEL NUMERO " + n1 + " = " + resultado);
    }

    private static void resta() {
        int n1, n2;
        System.out.println(" OPCION RESTA");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        System.out.println("INGRESE NUMERO 2");
        n2 = new Scanner(System.in).nextInt();
        int resultado = n1 - n2;
        System.out.println(" EL RESULTADO DE LA RESTA DE " + n1 + " - " + n2 + " = " + resultado);
    }

    private static void tangente() {
        double resultado;
        int n1;
        System.out.println("ENCONTRAR LA TANGENTE DE UN ANGULO X");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        resultado = tan(toRadians(n1));
        System.out.println("LA TANGENTE DE " + n1 + " ES = " + resultado);
    }

    private static void seno() {
        double resultado;
        int n1;
        System.out.println("ENCONTRAR EL SENO DE UN ANGULO X");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        resultado = sin(toRadians(n1));
        System.out.println("EL SENO DE " + n1 + " ES = " + resultado);
    }

    private static void coseno() {
        double resultado;
        int n1;
        System.out.println("ENCONTRAR EL COSENO DE UN ANGULO X");
        System.out.println("INGRESE NUMERO 1");
        n1 = new Scanner(System.in).nextInt();
        resultado = cos(toRadians(n1));
        System.out.println("EL COSENO DE " + n1 + " ES = " + resultado);
    }

}
