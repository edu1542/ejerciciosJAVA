/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje “su nombre
es XXXXX y XXXXXX es su apellido”.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        
        Scanner miescanner = new Scanner(System.in);
        
        System.out.println("ingrese el nombre");
        nombre= miescanner.nextLine();
        
        System.out.println("ingrese el apellido");
        apellido= miescanner.nextLine();
        
        System.out.println("su nombre es "+nombre+" y "+apellido+" es su apellido");
        
        
        
        
       
    }
    
}
