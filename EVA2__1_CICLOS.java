/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2__1_ciclos;

/**
 *
 * @author eddyi
 */
public class EVA2__1_CICLOS {

    public static void main(String[] args) {
        
        //CICLO FOR -> CUANDO SABEMOS CUANTAS VECES SE REPITE LA INSTRUCCIÓN
        //FUNCIONA COMO UN CONTADOR: INICIO, FIN, Y SALTO EN EL CONTEO 
        //i --> ijndex --> índice 
        //vamos a repetir 10 veces, contando de 1 a 10
        for(int i = 1; i <= 10; i++){
        System.out.print(i + " - " );
        }
        
        System.out.print("");
        for(int i = 10; i >= 1; i--){
        System.out.print(i + " - " );
        }
    }
}
