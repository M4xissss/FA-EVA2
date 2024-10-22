/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_19_MENU {

    public static void main(String[] args) {

        String menú[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int cant;
        System.out.println("Cuántos productos va a tener el menú?");
        cant = captu.nextInt();
        captu.nextLine();
        menú = new String[cant];//tamaño de los arreglos (cant)
        precios= new int[cant];
        for(int i = 0; i < menú.length; i++){
        
            System.out.println("Nombre del producto:");
            menú[i] = captu.nextLine();
            System.out.println("Precio:");
            precios[i] = captu.nextInt();
            captu.nextLine();
        }
for(int i = 0; i < menú.length; i++){
System.out.println(i + " - " + menú[i] + " $" + precios[i]);
}
        

    }
}
