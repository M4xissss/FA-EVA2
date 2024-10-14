/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_cadena;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_7_CADENA {

    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el texto");
        String texto = captu.nextLine();
        
        for (int i = 0; i < texto.length(); i++){
        System.out.println(texto.charAt(i));
        }
    }
   
}
