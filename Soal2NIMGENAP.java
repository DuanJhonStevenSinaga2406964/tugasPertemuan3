/*
 * Buatlah algoritma dalam bahasa Java, yang menerima tiga buah angka masukan dan
menampilkan nilai yang paling besar dari ketiga masukan.
 */
package com.mycompany.tugaspercabangandijavakelaskom.a;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Soal2NIMGENAP {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan bilangan integer 1: ");
        int p1 = in.nextInt();
        System.out.print("Masukan bilangan integer 2: ");
        int p2 = in.nextInt();
        System.out.print("Masukan bilangan integer 3: ");
        int p3 = in.nextInt();
        
        if(p1 > p2){
            if (p1 > p3){
                System.out.printf("Bilangan integer %d lebih besar dari bilangan integer %d dan %d", p1, p2, p3);
            } else {
                System.out.printf("Bilangan integer %d lebih besar dari bilangan integer %d dan %d", p3, p1, p2);
            }
        } else {
            System.out.printf("Bilangan integer %d lebih besar dari bilangan integer %d dan %d", p2, p1, p3);
        }
    }
}
