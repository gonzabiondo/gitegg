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
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/
public class EjerciciosPractica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       //int num1, num2;
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("el total de la suma es : "+(num1 + num2));
        
    }
    
}
