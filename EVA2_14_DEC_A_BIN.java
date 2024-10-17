/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_14_DEC_A_BIN {

    public static void main(String[] args) {
        
        int num, uno, dos;
        
        String acum = " -  Binario";
        
        System.out.println("Capture un número:");
        Scanner captu = new Scanner(System.in);
        num = captu.nextInt();
        while(num != 0){
        
            uno = num % 2;
            dos = num / 2;
            num = dos;
            acum = uno +  acum;
                    
                 System.out.println(uno + dos + num);
                 
                        
        }
        System.out.println(acum);
        
            
    }
}
