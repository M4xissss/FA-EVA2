/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos;

/**
 *
 * @author eddyi
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {

        String diasSemana[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
        "Sábado", "Domingo"};
        
        int valores[] = {20, 50, 100, 200, 500, 1000};
        for(int i = 0; i < diasSemana.length; i++){
        
        System.out.println(diasSemana[i] + " - ");
        
           }
        
        System.out.println("");
        for(int i = 0; i < valores.length; i++){
        
            System.out.println(valores[i] + " - ");
        }
        
    }
}
