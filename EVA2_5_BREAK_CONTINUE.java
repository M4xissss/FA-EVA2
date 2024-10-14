/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_break_continue;

/**
 *
 * @author eddyi
 */
public class EVA2_5_BREAK_CONTINUE {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            //CONTINUE - SE SALTA LA INTERACCIÓN ACTUAL
            //if(i == 8)
                //continue; //interrumpe la repetición desde este punto
                if(i == 8)
                    break; //Detiene el ciclo por completo en este punto
        System.out.print(i + " - ");
        
        }
    }
}
