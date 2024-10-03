/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA_2_4_FACTORIAL {

    public static void main(String[] args) {
    int valor, facto;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce el valor;");
    valor = captu.nextInt();
    captu.nextInt();;
    
    facto = 1;
    for(int i = 1; i <= valor; i++){
    facto = facto * i;  
    
    System.out.println("El factorial de " + valor + " = " + facto);
    }
    }
}
