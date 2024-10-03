/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        
        int califa, acum;
        Scanner captu = new Scanner(System.in);
        acum = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante #0" + i);
        System.out.println("Introduce la calificación:");
        califa = captu.nextInt();
        captu.nextLine();
        acum = acum + califa;
        
        System.out.println("acum = " + acum);
        

    }

    }
        System.out.println("Promedio = " +  (acum/10.0));

}
