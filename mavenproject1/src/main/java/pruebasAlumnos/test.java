
package pruebasAlumnos;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int numero = cargarNumero("Ingrese un número para calcular su Fibonacci: ");
        System.out.println("Resultado: " + Fibonacci(numero));
        
    }

    public static int Fibonacci(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + Fibonacci(num - 1);
        }
        
    }

    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int num = leer.nextInt();
        return num;
    }
}

