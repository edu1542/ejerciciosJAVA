/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto14 {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave ,si es (utn750; se mostrara el msj bienvenido 
     * , de lo contrario el msj clave herronia )
     * se in gresa un importe si supera los 100 pesos se le suma un 23% ; si es menor a 100 se le descuenta 50%
     * se ingresa el importe de un pasaje de avion y el de viaje, si8 es enero se le descuenta un 10% x temporada vaja
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave;
        
        Scanner miescanner = new Scanner(System.in);
        
        System.out.println("ingresar clave");
        clave = miescanner.nextLine();
        
        /*boolean respuesta;
        respuesta*/
        
        if(clave.equals("utn750"))
        {
            System.out.println("bienvenido");
            
        }
        else{
            System.out.println("clave herronia");
            
            
            
        }
        
       
        }
        
    }
    
}
