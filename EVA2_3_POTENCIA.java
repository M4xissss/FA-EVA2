/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
    int base, expo;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce las bases;");
    base = captu.nextInt();
    captu.nextInt();
    System.out.println("Introduce el exponente:");
    expo = captu.nextInt();
    captu.nextLine();
    //System.out.println("Potencia = " + Math.pow(base, expo));
    
    int acum = 1;
    for(int i = 1; i <= expo; i++){
    acum = acum * base;  
    System.out.println("Potencia = " + Math.pow(base, expo));
    }
   

    }
}
