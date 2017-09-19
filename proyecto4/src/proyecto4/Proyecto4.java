/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: 
     * “ Usted se llama “ XXXXXX y
tiene XX años de edad”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        
        Scanner miescanner = new Scanner(System.in);
        
        System.out.println("ingrese su nombre: ");
        nombre = miescanner.nextLine();
        
        System.out.println("ingrese su edad: ");
        edad = miescanner.nextInt();
        
        System.out.println("usted se llama"+nombre+" y "+edad+"años de edad");
        
        
        
        
        
                
        
    }
    
}
