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
public class EJ1 {

    //PABLITOX CLAV� UN CLAVITOX
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
  

       
        System.out.println("Ingrese los 2 numeros");
               
          int num1 = leer.nextInt();
          int num2 = leer.nextInt();
          int suma =  num1 + num2;
                  
       System.out.println("La suma de es igual a "+ suma);
        
    }
    
}
