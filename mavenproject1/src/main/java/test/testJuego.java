
package test;

import clases.Carta;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class testJuego {
    
   
    private final List<String> lista=Arrays.asList("a","b");
    
    public static void main(String[] args) {
      
          
        app();
        
        
        
    }
    
    public static void app(){
        Carta c1=tirar();
        Carta c2=tirar();
        System.out.println(jugar(c1,c2));
        
        
    }
    
    
    
    
    public static String jugar(Carta c1, Carta c2){
    
    
        List<String> vocales=Arrays.asList("a","e","i","o","u");
       
        boolean ban=true;
        
        while (ban) {

            if (vocales.contains(c1.getLetra()) && vocales.contains(c2.getLetra())) {
                System.out.println("Se realiza de vuelta la tirada dieron dos pares");
                c1 = tirar();
                c2 = tirar();
                

            } else {
                System.out.println("Se anuncia el ganador");
                ban = false;

            }

        }
        
        if (c1.getNumero()>c2.getNumero()) {
            
            return "Gano el jugador de:"+c1.getLetra();
            
        } else {
            
            return "Gano el jugador de:"+c2.getLetra();
        }
        
        
        
    
    };
    
    public static Carta tirar(){
    
        char[] abcedario=retornarAbc();
        Random random= new Random();
        String retorno=String.valueOf(abcedario[random.nextInt(27)]);
        int    numero=random.nextInt(100);
     
        
        Carta c=new Carta(numero,retorno);
        System.out.println("La carta  que le toco al usuario es:");
        System.out.println(c.toString());
        
        return c;
        
        
        
    
    }
    
    public static char[] retornarAbc(){

            char[] s=new char[26];
            for (int i = 0; i < s.length; i++) {
                s[i]=(char)('A'+i);
                
            }
            
            return s;
            
            }
    
}
