    
package test;

import java.util.HashSet;
import java.util.Set;


public class testComparo {
    
    public static void main(String[] args) {
        
       
        app();
        
        
    }
    
    
    public  static void app(){
    
        int a=9;
        int b=10;
        
        if (comparar(a,b)) {
            
            System.out.println("Los numeros ingresados son iguales");
            
        }
        else{
        
            System.out.println("Los numeros agregados son diferentes");
            
        }
        
    }
    
    public static boolean comparar(int a, int b){
        
        Set<Integer> agregado=new HashSet<>();
        
        agregado.add(a);
        agregado.add(b);
        
        
        return agregado.size()<= 1;
    
    }
    
}
