/*
 * Menentukan biaya parkir berdasarkan lama parkir yang dihitung berdasarkan selisih
jam masuk dan jam keluar (dengan ketentuan seperti soal no 1). Biaya parkir 2 jam
pertama 1500 dan perjam berikutnya 1000.
 */

package com.mycompany.tugaspercabangandijavakelaskom.a;

import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Soal3NIMGENAP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan jam masuk kendaraan: ");
        int jamMasuk = in.nextInt();
        System.out.print("Masukan jam keluar kendaraan: ");
        int jamKeluar = in.nextInt();

        int tarifParkir, lamaParkir;
        if(jamMasuk > jamKeluar){
            lamaParkir = (12 - jamMasuk) + jamKeluar;
            if (lamaParkir <= 2){
                tarifParkir = 1500;
                System.out.printf("Bayar parkir sebesar %d", tarifParkir);
            } else if (lamaParkir > 2){
                tarifParkir = 1500 + (1000 * (lamaParkir - 2));
                System.out.printf("Bayar parkir sebesar %d", tarifParkir);
            }
        } else {
            lamaParkir = jamKeluar - jamMasuk;
            if (lamaParkir <= 2){
                tarifParkir = 1500;
                System.out.printf("Bayar parkir sebesar %d", tarifParkir);
            } else if (lamaParkir > 2){
                tarifParkir = 1500 + (1000 * (lamaParkir - 2));
                System.out.printf("Bayar parkir sebesar %d", tarifParkir);
            }
        }
    }
}
        
