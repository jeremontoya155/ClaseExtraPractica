
package test;


public class Factorial {
    
    public static void main(String[] args) {
        
        app();
        
    }

    public static void app(){
     
        int a=5;
        
        
        
        System.out.println(Factorial(a));
        
        
    
    }
    
    
    public static int Factorial (int n){
        
        if (n==1){
            
            return 1;
            
        }
        else{
        
            return n*Factorial(n-1);        
        }
    
    }
    
}
