/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_8_ACCESO {

    public static void main(String[] args) {
        //PANTALLA DE VALIDACIÓN: USUARIO Y CONTRASEÑA
        
        String usuario;
        String pwd;
       
        do{
        System.out.println("PROGRAMA PRINCIPAL");
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario:");
        usuario = captu.nextLine();
        System.out.println("Contraseña:");
        pwd = captu.nextLine();
        }while(usuario.equals("admin") && pwd.equals("1234"));
        //!-->OPERADOR LÓGICO DE NEGACIÓN: NOT 
        
        //PROGRAMA PRINCIPAL 
        System.out.println("PROGRAMA PRINCIPAL--------");
        
        
        
  }
    
    
}
