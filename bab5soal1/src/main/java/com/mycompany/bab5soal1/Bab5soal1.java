/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal1;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab5soal1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("##pendataaan karyawan PT. petani kode");
        System.out.println("nama karyawan : ");
        String nama = scanner.nextLine();
        
        System.out.println("usia : ");
        int usia = scanner.nextInt();
        
        System.out.println("gaji : ");
        int gaji = scanner.nextInt();
        
        System.out.println("Nama : " + nama);
        System.out.println("usia : " + usia);
        System.out.println("Gaji : " + gaji); 
    }
}
