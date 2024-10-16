/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_9_ACCESO_WHILE {

    public static void main(String[] args) {
        String user = "";
        String pwd = "";
        Scanner captu = new Scanner(System.in);
        
        while(!(user.equals("admin")&& pwd.equals("1234"))){
         System.out.println("USUARIO:");
         user = captu.nextLine();
        
         System.out.println("Contraseña:");
         pwd = captu.nextLine();
         }
        
        //!-->OPERADOR LÓGICO DE NEGACIÓN; NOT 
        //PROGRAMA PRINCIPAL 
        
        System.out.println("-----PROGRAMA PRINCIPAL");
    }
}
