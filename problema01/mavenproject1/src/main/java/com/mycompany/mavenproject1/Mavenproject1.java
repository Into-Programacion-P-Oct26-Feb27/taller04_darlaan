/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoTotal;

        System.out.println("Ingrese nombre del proyecto 1: ");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese nombre del proyecto 2: ");
        proyecto2 = entrada.nextLine();
        System.out.println("Ingrese nombre del proyecto 3: ");
        proyecto3 = entrada.nextLine();

        System.out.println("Ingrese gasto del proyecto 1: ");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese gasto del proyecto 2: ");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingresar gasto del proyecto 3: ");
        gasto3 = entrada.nextDouble();
        
        gastoTotal = gasto1 + gasto2 + gasto3;
        
        
         System.out.printf("Nombre proyecto 1: %s\nGasto 1:%.2f\nNombre proyecto 2: %s\n "
                + "Gasto proyecto 2: %.2f\nNombre proyecto 3: "
                + "%s\nGasto proyecto 3: %.2f\nGasto total: %.2f\n",
                proyecto1,
                gasto1,
                proyecto2,
                gasto2,
                proyecto3, gasto3, 
                gastoTotal);
        
    
    }

}
