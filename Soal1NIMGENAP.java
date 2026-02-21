/*
 * Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
periksa apakah masukan adalah ribuan.
 */

package com.mycompany.tugaspercabangandijavakelaskom.a;

import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Soal1NIMGENAP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan bilangan integer 1: ");
        int p1 = in.nextInt();
        System.out.print("Masukan bilangan integer 2: ");
        int p2 = in.nextInt();
        System.out.print("Masukan bilangan integer 3: ");
        int p3 = in.nextInt();
        
        if(p1 > 999 && p2 > 999 && p3 > 999){
            System.out.println("Bilangan integer 1, 2, dan 3 merupakan ribuan");
        } else if (p1 > 999 && p2 > 999 && p3 < 1000){
            System.out.println("Bilangan integer 1 dan 2 merupakan ribuan, sedangkan 3 bukan merupakan ribuan");
        } else if (p1 > 999 && p2 < 1000 && p3 < 1000){
            System.out.println("Bilangan integer 1 merupakan ribuan, sedangkan 2 dan 3 bukan merupakan ribuan");
        } else if (p1 < 1000 && p2 > 999 && p3 < 1000){
            System.out.println("Bilangan integer 2 merupakan ribuan, sedangkan 1 dan 3 bukan merupakan ribuan");
        } else if (p1 < 1000 && p2 > 999 && p3 > 999){
            System.out.println("Bilangan integer 2 dan 3 merupakan ribuan, sedangkan 1 bukan merupakan ribuan");
        } else if (p1 < 1000 && p2 < 1000 && p3 > 999){
            System.out.println("Bilangan integer 3 merupakan ribuan, sedangkan 1 dan 2 bukan merupakan ribuan");
        } else if (p1 > 999 && p2 < 1000 && p3 > 999){
            System.out.println("Bilangan integer 1 dan 3 merupakan ribuan, sedangkan 2 bukan merupakan ribuan");
        } else {
            System.out.println("Bilangan integer 1, 2, dan 3 bukan merupakan ribuan");
        }
    }
}
