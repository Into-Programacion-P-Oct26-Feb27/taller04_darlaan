/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author dadaa
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cliente;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDrop;
        double totalNet;
        double totalYou;
        double totalDrop;
        double totalSinDescuento;
        double ahorro;
        double total;
        
       System.out.println("Ingresar nombre del cliente: ");
       cliente = entrada.nextLine();
        System.out.println("Ingresar precio Netflix: ");
        netflix = entrada.nextDouble();
        System.out.println("Ingresar precio Youtube: ");
        youtube = entrada.nextDouble();
        System.out.println("Ingresar precio Dropbox: ");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese precio Spotify: ");
        spotify = entrada.nextDouble();
        
        descuentoNetflix = netflix * 0.23;
        descuentoYoutube = youtube * 0.23;
        descuentoDrop = dropbox * 0.45;
        
        
        totalSinDescuento = netflix + youtube + dropbox + spotify;
        
        ahorro = descuentoNetflix + descuentoYoutube + descuentoDrop;
        
        totalNet = netflix - descuentoNetflix;
        totalYou = youtube - descuentoYoutube;
        totalDrop = dropbox - descuentoDrop;
        
        total = totalNet + totalYou + totalDrop + spotify;
        
         System.out.printf("SERVICIOS: \nNombre del cliente: %s\nPrecio Netflix: $%.2f\n"
                 + "Precio Youtube: $%.2f\nPrecio Dropbox: $%.2f\nPrecio Spotify: "
                 + "$%.2f\nTotal a pagar sin descuento: $%.2f\n\n"
                 + "DESCUENTOS: \n\nDescuento Netflix: $%.2f\n"
                 + "Descuento Youtube Premium: $%.2f\nDescuento Dropbox $%.2f\n"
                 + "Ahorro: $%.2f\nTotal con descuentos: $%.2f\n ",cliente, netflix,
                 youtube, dropbox, spotify, totalSinDescuento,
                 descuentoNetflix, descuentoYoutube, descuentoDrop,
                 ahorro, total);
       
    }
     
}
