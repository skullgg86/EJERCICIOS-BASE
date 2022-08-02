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
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer = new Scanner(System.in);
        int num = 0;
      
        
        System.out.println("Ingrese un valor para determinar su paridad");
        
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
         
        }  else {
            System.out.println("No es par");
        }
            
        
    }
    
}
