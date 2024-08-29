/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;

/**
 *
 * @author Thinkpad13
 */
import java.util.Scanner;
public class Bab8soal1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        //input nilai awal dan nilai akhir
        System.out.println("Nilai awal ? : ");
        int nilaiawal = scanner.nextInt();
        
        System.out.println("nilai akhir ? : ");
        int nialaiakhir = scanner.nextInt();
        
        // menampilkan bilangan pertambahan 5
        int jumlah = 1;
        for (int i = nilaiawal; i <= nialaiakhir ; i += 5) {
            System.out.println(jumlah + " . " + i);
            jumlah++;
            
            //menutup scanner
            scanner.close();
        }
    }
}
