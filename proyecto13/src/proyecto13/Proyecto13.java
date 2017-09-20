/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto13 {

    /**
     * @param args the command line arguments
     * 
     * 
     * scanner misc = new scanner(system.in);
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        
        String nombre;
        String clave;
        String sexo;
        String localidad;
        String color;



        System.out.println("ingrese nombre: ");







        nombre = misc.next();

        System.out.println("ingrese clave: ");
        clave = misc.next();
        
        System.out.println("ingrese sexo: ");
        sexo = misc.next();
        //ingrese m para masculino , f para femenimo
        System.out.println("ingrese localidad: ");
        localidad = misc.next();
        
        
        System.out.println("ingrese color: ");
        color = misc.next();
        /**
         * 1si es masculino q viva en la lanus en avellaneda y q su color 
         * favorito sea rojo mostrar el msj sos de independiente
         * 2si el nombre es andrea ,la localidad es moron , el color favorito es 
         * verde y azul , msj feliz primavera
         */
          
         if(sexo.equals("m")&&color.equals("rojo")){
         
             if(localidad.equals("lanus")||localidad.equals("avellaneda")){
             
                 System.out.println("sos de independiente");
             }
         }
             
          if(nombre.equals("andrea")&&localidad.equals("moron")){
         
             if(color.equals("verde")||color.equals("azul")){
             
                 System.out.println("feliz primavera");
             }
         }
         
        if(color.equals("blanco") || color.equals("celeste"))
        {
            System.out.println("sos un patriota");
        }
        
        if(sexo.equals("f")&&localidad.equals("lanus"))
            {
                System.out.println("bienvenida chica de lanus");
            }
        
        if(sexo.equals("f"))
        {
            System.out.println("feliz dia de la mujer");
            
//            if(localidad.equals("lanus")){
//                
//                System.out.println("bienvenida chica de lanus");
//                
//            }
        }    
    
        
        if(nombre.equals("admin"))
        {
            System.out.println("bienvenido administrador.");    
        } 
        else
        {
            System.out.println("bienvenido "+ nombre);
            
        
        }
        
    
    
    }
        
        
        
        
        
    }
    

