/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenar_array_recursiva;
import java.util.*;
/**
 *
 * @author Jose Luis
 */
public class llenar_array {
    
    ArrayList<String> array=new ArrayList<>();
    public ArrayList<String> LlenarArreglo(int a, int b)
    { int c=a+1;
      
       if (c < b)
       {
          
            array.add(""+c+"");
            LlenarArreglo(a+1,b); 
            return array;  
          
       }
        else
       {    
           return array;
       }
    }
    ;
}
