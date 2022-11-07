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
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
public class EjerciciosPractica_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero : ");
        int num =leer.nextInt() ;
        System.out.println("El doble de su numero es igual a : " + (num*2));
        System.out.println("El triple de su numero es igual a : "+ (num*3));
        System.out.println("La raiz cuadrada del numero es de : "+ Math.sqrt(num));
    }
    
}
