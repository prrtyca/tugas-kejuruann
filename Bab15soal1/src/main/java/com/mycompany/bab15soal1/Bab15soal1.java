/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soal1;

/**
 *
 * @author Thinkpad13
 */
public class Bab15soal1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Kalkulator kalkulator = new Kalkulator();

        // Contoh penggunaan method pengurangan
        int hasilPengurangan = kalkulator.pengurangan(5, 3);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Contoh penggunaan method pembagian
        float hasilPembagian = kalkulator.pembagian(10.0f, 2.0f);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Contoh penggunaan method perkalian
        float hasilPerkalian = kalkulator.perkalian(4.5f, 2.0f);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}
