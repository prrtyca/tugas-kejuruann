package com.mycompany.bab10soal1;

/**
 *
 * @author Andriyansyah
 */
public class Bab10soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aritmatika aritmatika = new Aritmatika();
        
        System.out.println("Pengurangan: " + aritmatika.pengurangan(10, 5));
        System.out.println("Perkalian: " + aritmatika.perkalian(10, 5));
        System.out.println("Pembagian: " + aritmatika.pembagian(10, 2));
        System.out.println("Pangkat: " + aritmatika.pangkat(2, 3));
    }
}