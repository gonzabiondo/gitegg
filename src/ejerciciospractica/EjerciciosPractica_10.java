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
public class EjerciciosPractica_10 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num1=leer.nextInt();
        int suma;
        suma=0;
         int i;
        i=0;
        do{
            System.out.println("Ingrese un numero");
            int num=leer.nextInt();
            suma += num;    
            i += 1;
        } while(suma<num1);
        System.out.println("Con un total de "+i+" cifras agregadas");
        System.out.println("Se logro el total limite de "+ num1);
    }
   
}
