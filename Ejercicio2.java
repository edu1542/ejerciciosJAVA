/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * se debe pedir un nombre y se debe mostrar un nombre
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String nombre;
        
        Scanner gala = new Scanner(System.in);
        System.out.println("ingrese un nombre");
        nombre = gala.nextLine();
        System.out.println("el nombre ingreasdo es: " +nombre);
        
        
    }
    
}
