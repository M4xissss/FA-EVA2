/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_13_CONTAR {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingresa el texto:");
        String texto = captu.nextLine();
        
        int contador = 0;
        texto = texto.toLowerCase();
        
        for(int i = 0; i < texto.length(); i++){
        char caracter = texto.charAt(i);
        
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
        contador++;
        
        System.out.println(" ");
        
        }
        }
        System.out.println("EL número de vocales en la cadena son;" + contador);
    }
}
