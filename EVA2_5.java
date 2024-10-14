/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_5 {


    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        // Solicitar la cadena
        System.out.print("Introduce el texto: ");
        String cadena = captu.nextLine();

        // Solicitar el número
        System.out.print("Introduce un numero: ");
        int numero = captu.nextInt();

        // Imprimir la cadena el número de veces solicitado
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
        
       
    }
}

