/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema02 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       
        double base;
        double altura;
        double area;
        
         System.out.println("Ingrese base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura del triangulo: ");
        altura = entrada.nextDouble();
        
        area = base * altura / 2;
        
         System.out.printf("Base del triangulo: %.2f\nAltura del triangulo: "
                 + "%.2f\nArea del triangulo: %.2f\n", base, altura, area );

        
     
        
        
    }
}
