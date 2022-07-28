
package test;

public class Fibonacci {
    public static void main(String[] args) {
        
        app();
        
    }

    
    
    public static void app(){
    
    
        System.out.println(Fibonacci(3));
        
    
    };
    
    public static int Fibonacci(int n){
    
        
        //Hacemos siempre el caso base 
        if (n==0||n==1) {
            
            return 1;
            
        }
        
        //Paso recursivo 
        //Osea que debe incluir lo que querramos que se vuelva a aplicar 
        else {
        
            return n + Fibonacci(n-1);
        
        }   
    
    }
    

}



