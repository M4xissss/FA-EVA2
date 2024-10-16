/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_10 {

    public static void main(String[] args) {
         int days;
         Scanner captu = new Scanner(System.in);
         do{
         System.out.println("Captura el número del día de la semana:");
         days = captu.nextInt();
         captu.nextLine();
         }while(days < 1 || days > 7);
         //while(!(days >- 1 && days <- 7))
         
        //ELEGIR ENTRE MÚLTIPLES ALTERNATIVAS
        
         switch(days){
             case 1: 
                 System.out.println("Domingo");
                 break; //interrumpir el switch (lo termina)
                      case 2: 
                 System.out.println("Lunes");
                 break; //interrumpir el switch (lo termina)
                      case 3: 
                 System.out.println("Martes");
                 break; //interrumpir el switch (lo termina)
                      case 4: 
                 System.out.println("Miércoles");
                 break; //interrumpir el switch (lo termina)
                      case 5: 
                 System.out.println("Jueves");
                 break; //interrumpir el switch (lo termina)
                      case 6: 
                 System.out.println("Viernes");
                 break; //interrumpir el switch (lo termina)
                      case 7: 
                 System.out.println("Sábado");
                 break; //interrumpir el switch (lo termina)
                      default: //Opcional, se ejecuta cuando no existe una opción
                       //no tiene break, Y ES LA ÚLTIMA INSTRUCCIÓN DEL SWITCH
                          System.out.println("Número no válido (solo del 1 al 7)");
                          }
    }

    }

