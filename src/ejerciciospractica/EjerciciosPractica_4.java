/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class EjerciciosPractica_4 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer=new Scanner(System.in);
           System.out.println("Ingrese la temperatura en grados centigrados: ");
           Double c = leer.nextDouble();
           System.out.println("La temperatura en Fahrenheit es : " +(32 + (9*c/5))+" F");
    }
    
}
