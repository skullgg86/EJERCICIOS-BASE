/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.introJava;

import java.util.Scanner;


/**
 *
 * @author SkullGG
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
       //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
       
        System.out.println("Ingrese una frase");
       
       Scanner leer = new Scanner(System.in);
       
       String frase = leer.nextLine();
       
        System.out.println(frase.toUpperCase());
       
      
       
       
       
       
       
       
    }
    
}
