/*
 *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.bab10soal2;

/**
 *
 * @author Thinkpad13
 */
public class Bab10soal2 {

    public static void main(String[] args) {
        System.out.println("halloworld") ;
        // membuat objek Aritmatika3
        Aritmatika3 aritmatika = new Aritmatika3();

        // Nilai untuk operasi
        int bilangan1 = 10;
        int bilangan2 = 5;

        // Mengakses dan menampilkan hasil dari metode pengurangan
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Mengakses dan menampilkan hasil dari metode perkalian
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Mengakses dan menampilkan hasil dari metode pembagian
        try {
            double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
            System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil dari metode pangkat
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}
