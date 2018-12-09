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
public class ArreglosNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notas[] = {87, 68, 94, 68, 83,20, 58, 70, 61, 76, 87};
        presentarcalificaciones(notas);
        EstudiantesAprobados(notas);
        EstudiantesReprobados(notas);
        NotaMaxima(notas);
        NotaMinima(notas);

    }
 
    private static void presentarcalificaciones(int[] notas) {
        for (int i = 0; i <notas.length; i++) {
            System.out.println("La Calificacion N° " + i + " : " + notas[i]);           
        }
        
    }

    private static void EstudiantesAprobados(int[] notas) {
        for (int i=0; i <notas.length; i++) {
            if(notas[i]<70)
            System.out.println("El estudiante obtuvo la calificacion de " + notas[i] + " es reprobado " );
        }
    }

    private static void EstudiantesReprobados(int[] notas) {
        for (int i = 0; i <notas.length ; i++) {
            if(notas[i]>=70)
                System.out.println("El esudiante obtuvo la calificacion de " + notas[i] + "  es aprobado ");
        }
    }

    private static void NotaMaxima(int[] notas) {
        int max=notas[0];
        for (int i = 0; i <notas.length; i++) {
           int  numero=notas[i];
            if(numero>max)
                max=numero;
           
        }
         System.out.println("El Nota Maxima es : " + max);
    }

    private static void NotaMinima(int[] notas) {
        int min=notas[0];
        for (int i = 0; i < notas.length; i++) {
            int  numero=notas[i];
            if(numero<min)
                min=numero;
        }
        System.out.println("La Nota Minima es : " + min );
    }

  
}
  
