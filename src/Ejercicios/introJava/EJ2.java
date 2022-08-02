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
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba su nombre");

        String nombre = leer.nextLine();
        
        System.out.println("El nombre ingresado es " +nombre);
        
    }
    
}
