/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;

public class Bab7soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Input NIM
        System.out.println("NIM: ");
        String nim = scanner.nextLine();
     
        // Input nama
        System.out.println("nama : ");
        String nama = scanner.nextLine();
        
        // Input tahun
        System.out.println("tahun : ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Input pilihan peminatan
        System.out.println("PILIHAN PEMINATAN (M/J) : ");
        char peminatan = scanner.nextLine()  .charAt (0);
        
        // menentukan output berdasarkan pilihan peminatan 
        String peminatanOutput;
        switch (peminatan){
            case 'M' :
                peminatanOutput = "PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA" + tahun;
                break ;
            case 'J' :
                peminatanOutput = "PEMOGRAMAN JAVA, PEMOGRAMAN MOBILE" + tahun;
                break;
            default:
                peminatanOutput = "Pilihan peminatan tidak valid";
                 break;    
            
        }
         
        // menampilakan hasil
        System.out.println("\nOutput");
        System.out.println(peminatanOutput);
    }
    
}
