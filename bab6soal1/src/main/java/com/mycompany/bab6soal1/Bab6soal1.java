/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal1;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab6soal1 {

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
        
        //menentukan grade berdasarkan nilai
        char grade;
        if (nilai >= 85) {
            grade = 'A';
        }else if (nilai >= 70) {
            grade = 'B';
        }else if (nilai >= 55) {
            grade ='C';
        }else if (nilai >= 40) {
            grade ='D';
        }else {
            grade = 'e';
        }
        
        // menampilkan otput grade 
        System.out.println("Grade : " + grade);
        
        // menutup scanner 
        scanner.close();
            
        }
        
        
        
    }

