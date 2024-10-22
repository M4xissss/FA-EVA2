/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA2_18_RESTAURANTE {

    public static void main(String[] args) {

String menú[] = {"Dogos", "Hamburguesa", "Boneless", "Tacos", "Montados", 
"Camarones"};

int precios[] = {50, 80, 120, 150, 70, 200};
Scanner captu = new Scanner(System.in);
int cantidad, producto;


for(int i = 0; i < menú.length; i++){
System.out.println(i + " - " + menú[i] + " $" + precios[i]);
}

System.out.println("Cuál será tu orden? (Introduce el número del producto)");
producto = captu.nextInt();
captu.nextLine();
System.out.println("Cuántas órdenes?");
cantidad = captu.nextInt();     
captu.nextLine();

System.out.println("El costo es de = $" + cantidad * precios[producto]);
    }
}
