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
public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String texto;
  
        
        System.out.println("Escriba la contraseña"); //eureka
        
        texto = leer.nextLine();
        
        if (texto.equals("eureka") ) {
            System.out.println("La contraseña es correcta");
    } else {
            System.out.println("Contraseña invalida");
      }
        
        
       
        
        
    }
    
}
