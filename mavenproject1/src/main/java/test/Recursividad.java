
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Recursividad {
    
    public static void main(String[] args) {
        
        app();
        
    }
    
    public static void app(){
    
        List<Integer>  lista =Arrays.asList(3,1,2);
        int numero=lista.size();
        indicador(lista,numero);
        
        
        
    };
    
    
    public static int indicador(List<Integer> lista, int indice){
        
        
        if (indice==0) {
            System.out.println(lista.get(0));
            return lista.get(0);
        }else{
            
            System.out.println(lista.get(indice));
            return indicador(lista,indice--);
        
        }
            
        
    
    }
    
    
}
