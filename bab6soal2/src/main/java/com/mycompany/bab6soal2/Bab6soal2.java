/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab6soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in); 
        
        // meminta input NIM dari pengguna
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
         // meminta input nama dari pengguna
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        // Meminta input nilai dari pengguna
        System.out.print("Nilai ? : ");
        int nilai = scanner.nextInt();
        
        //menentukan grade dan keterangan berdasarkan 
        char grade;
        String keterangan;
        if (nilai >= 85) {
            grade = 'A';
            keterangan= "Lulus";
        }else if (nilai >= 70) {
            grade = 'B';
            keterangan= "lulus";
        }else if (nilai >= 55) {
            grade ='C';
            keterangan = "lulus";
        }else if (nilai >= 40) {
            grade ='D';
            keterangan = " tidak lulus";
        }else {
            grade = 'e';
            keterangan = "tidak lulus";
        }
    }
}
