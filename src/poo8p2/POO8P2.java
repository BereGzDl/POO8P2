/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8p2;

/**
 *
 * @author berenice
 */

/**
 * Clase import para utilizar el Scanner 
 */
import java.util.Scanner;

public class POO8P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Declaración de variables tipo int 
         */
        int n1, n2;
        int suma = 0;
        int mayor, menor;
        
        /**
         * @new Creación de constructor
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Solicitar datos al usuario
         */
        System.out.println("Por favor introduzca un número entero");
        n1 = sc.nextInt();
        System.out.println("Por favor introduzca otro número entero");
        n2 = sc.nextInt();
        
        /**
         * Validar cuál es el número mayor y el menor
         * @if Condicional
         * @else Si no se cumple el if
         */
        if (n1>n2)
        {
            mayor = n1;
            menor = n2;
        }
        else 
        {
            mayor = n2;
            menor = n1;
        }
        /**
         * Hacer un ciclo desde el menor hasta el mayor 
         * @for ciclo de repetición
         */
        for ( int i = menor; i <= mayor; i++)
        {
            //Validar si es par para sumarlo
            if( i % 2 == 0)
            {
                suma += i;
            }
        }
        /**
         * Impresión de resultado
         */
        System.out.println("La suma de los pares entre " + n1 + " y " + n2 + " es " + suma);
        sc.close();

    }
    
}
