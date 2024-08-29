/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;

public class Bab9soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        //input nilai awal dan nilai akhir
        System.out.println("masukan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.println("masukan bilangaan akhir: ");
        int akhir = scanner.nextInt();
       
       // menampilkan hasil deret bilangan 
        System.out.println("hasil deret bilangan: ");
        for (int i = awal; i <= akhir; i+= 5) {
            System.out.println(i);
            if (i + 5 <= akhir) {
                System.out.println(", ");
            }
        }
    }
}
