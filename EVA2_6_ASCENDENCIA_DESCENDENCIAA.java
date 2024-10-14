/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_ascendencia_descendenciaa;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_6_ASCENDENCIA_DESCENDENCIAA {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        num1 = captu.nextInt();
        
       
        System.out.println("Introduce el segundo número");
        num2 = captu.nextInt();
        if (num1 > num2){
        int temp = num1;
        num1= num2;
        num2 = temp;
        }
               
        
        System.out.println("Ascendencia");{
            for (int i = num1; i <= num2; i++)
            System.out.println(i + " ");

    }
        System.out.println();
        
        System.out.println("Descendencia;");
        for (int i = num2; i >= num1; i--){
        System.out.println(i + " ");

        }
               

         
        
    }
    }
