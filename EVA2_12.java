/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_12 {

    public static void main(String[] args) {
    
        int num;
        int masGrande = -9999;
        Scanner captu = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un número:");
            num = captu.nextInt();
            captu.nextLine();
            if(num > masGrande)
                masGrande = num;
            
            
        }while(num != -1);
        System.out.println(masGrande);

        }
}
