/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soal2;

/**
 *
 * @author Thinkpad13
 */
public class Bab15soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double a = 9.5;
        double b = 2.5;

        // Operasi Pengurangan
        Kalkulatorkurang kurang = new Kalkulatorkurang(a, b);
        System.out.println("Pengurangan: " + kurang.kurang());

        // Operasi Perkalian
        Kalkulatorkali kali = new Kalkulatorkali(a, b);
        System.out.println("Perkalian: " + kali.kali());

        // Operasi Pembagian
        KalkulatorBagi bagi = new KalkulatorBagi(a, b);
        System.out.println("Pembagian: " + bagi.bagi());
    }
}
