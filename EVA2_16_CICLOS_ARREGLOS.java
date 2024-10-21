/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_ciclos_arreglos;

/**
 *
 * @author eddyi
 */
public class EVA2_16_CICLOS_ARREGLOS {

    public static void main(String[] args) {

        int[] datos, x, y, z; //TODOS SON ARREGLOS
        int val1, val2, arreglo[], val3; //SOLO arreglo es ARREGLO
        
       arreglo = new int[10];
       
       //LLENAMOS EL ARREGLO CON NÚMEROS ENTRE 0 Y 100
       for(int i = 0; i < 10; i++){
           arreglo[i] = (int)(Math.random() * 100);
           
        }

       //IMPRIMIMOS LOS NÚMEROS
         for(int i = 0; i < 10; i++){
         System.out.println(arreglo[i]);
         }
    }
}
