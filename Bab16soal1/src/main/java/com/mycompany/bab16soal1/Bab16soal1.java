/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal1;

/**
 *
 * @author Thinkpad13
 */
public class Bab16soal1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    double a = 9.5;
        double b = 2.5;

        // Membuat objek dari kelas Operation
        Operation operation = new Operation(a, b);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + operation.add());
        System.out.println("Pengurangan: " + operation.subtract());
        System.out.println("Perkalian: " + operation.multiply());
        System.out.println("Pembagian: " + operation.divide());
    }
}
