/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dadaa
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double base;
        double adicional;
        double total;

        System.out.println("Ingrese nombre del Cliente: ");
        cliente = entrada.nextLine();
        System.out.println("Valor CPU: ");
        cpu = entrada.nextDouble();
        System.out.println("Valor teclado: ");
        teclado = entrada.nextDouble();
        System.out.println("Valor raton: ");
        raton = entrada.nextDouble();
        System.out.println("Valor pantalla: ");
        pantalla = entrada.nextDouble();

        base = cpu + teclado + raton + pantalla;
        adicional = base * 0.15;
        total = base + adicional;

        System.out.printf("Reporte: \nNombre de cliente: %s\nValores iniciales: "
                + "\nCPU: $%.2f\nTeclado: $%.2f\nRaton: $%.2f\nPantalla: $%.2f\n"
                + "\nCosto base: $%.2f\nCosto adicional del 15%: $%.2f\nCosto final: $%.2f\n",
                cliente, cpu, teclado, raton, pantalla, base,
                adicional, total);

    }

}
