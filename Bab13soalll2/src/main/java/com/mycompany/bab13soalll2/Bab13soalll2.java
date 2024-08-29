/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soalll2;

/**
 *
 * @author Thinkpad13
 */
public class Bab13soalll2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Membuat objek SegitigaLuas
        SegitigaLuas segitiga = new SegitigaLuas(10, 5);
        
        // Menghitung luas menggunakan method overriding
        double luas = segitiga.hitungLuas();

        // Menampilkan hasil
        System.out.println("Luas segitiga: " + luas);
    }
}