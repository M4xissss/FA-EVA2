/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_vocales;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_8_VOCALES {

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner captu = new Scanner(System.in);
        
       System.out.println("Introduce el texto:");
        String texto = captu.nextLine();
        
        System.out.println("Vocales en el texto:");
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            
            if (esVocal(caracter)) {
                System.out.println(caracter);
            }
        }
    }
    
    public static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
