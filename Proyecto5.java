/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto5 {

    /**
     * @param args the command line arguments
     * se necesita pedir 2 numeros y sumarlos; moatrar los resultados
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("estoy en el ejercicio5");
        int numero1;
        int numero2;
        int suma;
        
        Scanner miescanner= new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numero1= miescanner.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2= miescanner.nextInt();
        suma=numero1 + numero2;
        System.out.println("el resultado es: "+suma);
        
        
                
    }
    
}
