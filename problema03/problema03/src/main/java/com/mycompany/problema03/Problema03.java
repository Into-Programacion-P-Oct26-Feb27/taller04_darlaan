/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema03 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String titular;
        String direccion;
        double tarifa;
        double minutos;
        double total;
        
        System.out.println("Ingrese nombre del Titular: ");
        titular = entrada.nextLine();
        System.out.println("Ingrese Dirección: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese tarifa por minuto: ");
        tarifa = entrada.nextDouble();
        System.out.println("Ingrese minutos consumidos: ");
        minutos = entrada.nextDouble();
        
        total = tarifa * minutos;
        
       System.out.printf("\n==========================\nPLANTILLA DE SERVICIO TELEFÓNICO\n"
               + "==========================\n"
                + "Titular: %s\nDirección: %s\n--------------------------\nCosto por minuto: "
               + "$%.2f\nMinutos consumidos: %.2f\n--------------------------\nVALOR TOTAL A PAGAR: "
               + "$%.2f\n=============\n", titular,
                direccion, tarifa, minutos, total);
        
   }
}
