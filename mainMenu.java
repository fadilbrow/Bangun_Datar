/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundDatar;

import java.util.Scanner;
/**
 *
 * @author fadil
 */
public class mainMenu {
    
    private static char pilihan;
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
        
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }
    
    private static void mainMenu(){
        //pilihan menu
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("");
        pilihan = scanner.next().charAt(0);
    }
    
}
