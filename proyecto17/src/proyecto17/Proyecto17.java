/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto17 {

    /**
     * @param args the command line arguments
     * se pide una edad y si informa
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner misc = new Scanner(System.in);
         System.out.println("ingrese la edad");
         
        
        edad = misc.nextInt();
        
         if(edad>17){
             
             System.out.println("es mayor");          
         
         
         }else{
             
             if(edad <13){
                 
                 System.out.println("es niño");
             }else
             {
                 System.out.println("es adolecente"); 
                 
             }
                
                
             
             
             
             
             
             
                 
         
         
         
         
           
        
     
           
    
    

