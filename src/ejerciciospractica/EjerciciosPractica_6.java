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
Crear un programa que dado un numero determine si es par o impar.
*/
public class EjerciciosPractica_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero : ");
        int num =leer.nextInt() ;
        if(num%2==0){
            System.out.println("Su numero es par! ");
        } else {
            System.out.println("Su numero es impar! ");
        }
        
        
        
    }
    
}
