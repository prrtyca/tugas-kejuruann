/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal2;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab17soal2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Mendefinisikan array multidimensi untuk negara dan ibukotanya
        String[][] countriesAndCapitals = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan ibukota dari setiap negara
        for (int i = 0; i < countriesAndCapitals.length; i++) {
            String country = countriesAndCapitals[i][0];
            String capital = countriesAndCapitals[i][1];
            System.out.println("Ibukota " + country + " adalah " + capital);
        }
    }
}
