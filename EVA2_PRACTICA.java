/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, num2;
        int valor1,valor2,valor3,valor4;
       Scanner cap = new Scanner (System.in);
       System.out.println ("Introduzca un numero");
       num = cap. nextInt ();
       System.out.println("Introduzca otro numero");
       num2 = cap.nextInt () ;
       valor1 = num -1;
       valor2 = num2 +1;
       valor3 = num2 +1;
       valor4 = num -1;
       if (num<num2){
            for (int i = valor1 + 1; i <= num2; i++) {
                 System.out.println(i);
            }
             for (int i = valor2 - 1; i >= num; i --) {
                 System.out.println (i);
            }
            }else if (num>num2){
         for (int i = valor4 + 1; i >= num2; i--) {
        System.out.println(i);
    }
      for(int i = valor3 -1; i <= num; i++ ){
                System.out.println(i);
                        }
        
        
       }
    }
    
}
