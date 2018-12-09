/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson
 */
public class CompraVentadeVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tpc;
        int tpv;int tp;
        int pc; int pv;
        String modelo;
        String usuario;
        char operacion='c';//c:compra-v:venta
        System.out.println("INGRESE TIPO DE OPERACION(C:Compra - V:Venta)");
        operacion=new Scanner(System.in).next().charAt(0);
        if(operacion=='c'){
            System.out.println("Ingrese usuario");
            usuario = new Scanner(System.in).next();
            System.out.println("Ingrese modelo");
            modelo = new Scanner(System.in).next();
            System.out.println("Ingrese precio compra");
            pc = new Scanner(System.in).nextInt();
            tpc = (pc * 12) / 100;
            tp=pc-tpc;
            System.out.println(" La compra realizada fue por el cliente "  + usuario + " el modelo del vehiculo es " + modelo + " total pagar " + tp );    
        }else{
             if(operacion=='v'){
            System.out.println("Ingrese usuario");
            usuario = new Scanner(System.in).next();
                System.out.println("Ingrese modelo");
                modelo = new Scanner(System.in).next();
                System.out.println("Ingrese precio venta");
                pv = new Scanner(System.in).nextInt();
                tpc = (pv * 12) / 100;
                tp = pv - tpc;
                System.out.println(" La venta realizada fue al cliente " + usuario + " el modelo del vehiculo es " + modelo + " total pagar " + tp);
            }else{
                 System.out.println("Opcion Incorrecta");
             }
        }
        
    }
}
