/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while_do_while;

/**
 *
 * @author eddyi
 */
public class EVA2_7_WHILE_DO_WHILE {

    public static void main(String[] args) {
      //FOR --> Sabemos la cantidad exacta de repeticiones
      //WHILE --> CERO o MÁS repeticiones
      //DO WHILE --> UNA O MÁS repeticiones
      
      System.out.println("WHILE");
      int val = 1;
      while (val <= 10) {//MIENTRAS (ESTO SEA VERDAD) (REPITE ESTAS INSTRUCCIONES
          System.out.print(val + " - ");
          val++;
          
          
      }
     //DO WHILE
     System.out.println("");
     System.out.println("DO WHILE");
     val = 1;
     do {
         System.out.print(val + " - ");
     
     }while(val <= 10);//REPETIR(ESTAS INSTRUCCIONES)MIENTRAS(ESTO SEA VERDAD)
     
     
        
    }
}
