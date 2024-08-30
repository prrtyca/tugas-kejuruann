/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal3c;

/**
 *
 * @author Thinkpad13
 */
public class Bab18soal3c {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            // Kode yang tidak menyebabkan eksepsi
            Float data = 500 / 15f; // Perbaiki pembagian menjadi float dengan '15f'
            System.out.println(data);
        } catch (NullPointerException e) {
            // Ini tidak akan dijalankan karena tidak ada NullPointerException
            System.out.println(e);
        } finally {
            // Ini akan selalu dijalankan
            System.out.println("Blok finally akan selalu di eksekusi");
        }
    }
}
