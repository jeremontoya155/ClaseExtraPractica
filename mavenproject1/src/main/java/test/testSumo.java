
package test;


public class testSumo {
    
    public static void main(String[] args) {
        
        
        app();
        
    }
    
    
    public static void app(){
    
        
        int a =10;
        
        int b=15;
        System.out.println("Salida uno");
        System.out.println(sumarUno(a,b));
        System.out.println("----------------------------");
        System.out.println("Salida Dos");
        System.out.println(sumarDos(a,b));
    };
    
    public static int sumarUno(int a,int b){
        
        return a-(-b) ;
    
    }
    
   public static int sumarDos(int a, int b){
       
       for (int i = 0; i < b; i++) {
           a++;
           
       }
       
       return a;
   
   } 
    
    
}
