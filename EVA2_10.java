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
        
        int num;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = captu.nextInt();
        for(int i = 1; i <= num; i++){
        cade = cade + "*";
        System.out.println(cade);
        
        }
               
        for(int i = num; i >= 1; i--){
            cade = "";
            
        for(int j = 1; j <= i; j++){
        cade = cade + "*";
        System.out.print(cade);
        }
    }
    }
}
