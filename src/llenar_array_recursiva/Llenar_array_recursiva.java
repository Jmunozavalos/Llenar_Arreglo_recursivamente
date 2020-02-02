/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenar_array_recursiva;

import java.util.Scanner;

/**
 *
 * @author Jose Luis
 */
public class Llenar_array_recursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int Array[];
       int a , b ;
       
       Scanner objeto=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
       a=objeto.nextInt();
        System.out.println("Ingrese el segundo numero");
       b=objeto.nextInt();
       
       System.out.println("a="+a+" b="+b );
        
       if(a >= b)
            System.out.println("a es mayor que b");
        else 
            System.out.println("a es menor que b");
       
        llenar_array llenar=new llenar_array();
        
     
        
        System.out.println(llenar.LlenarArreglo(a,b));
       
    }
    
}
