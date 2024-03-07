/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ratarata;

import java.util.Scanner
        ;

/**
 *
 * @author GINA TOGATOROP
 */
public class Ratarata {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       System.out.print("masukkan jumlah bilangan :");
       int jumlahBilangan = scanner.nextInt();
       System.out.println("masukkan" +jumlahBilangan + "bilangan");
       double total = 0;
       for (int i =0;i <jumlahBilangan;i++) { 
           System.out.print("bilangan ke-" + (i+1) +":");
           double bilangan = scanner.nextDouble();
           total+= bilangan;
       }
       double rataRata = total/jumlahBilangan;
       System.out.println("nilai rata rata : " + rataRata);
    }
}
