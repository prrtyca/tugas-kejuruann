/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab8soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai akhir
        System.out.println("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.println("Tahun Awal?: ");
        int tahunAwal = scanner.nextInt();
        
        // Menampilkan tahun dari tahun akhir hingga tahun awal
        int jumlah = 1;
        for (int tahun = tahunAkhir; tahun  >= tahunAwal; tahun--) {
            System.out.println(tahun);
            jumlah++;
            
            // Menutup Scanner
            scanner.close();
        }
    }
}
