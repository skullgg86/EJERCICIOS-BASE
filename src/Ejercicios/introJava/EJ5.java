/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.introJava;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author SkullGG
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        //doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()
        
        
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        
        
        
        System.out.println("El doble del numero equivale a " +doble );
        System.out.println("El triple del numero equivale a " +triple );
        System.out.println("La raiz cuadrada del numero equivale a " +Math.sqrt(num));
        
        
        
        
        
    }
    
}
