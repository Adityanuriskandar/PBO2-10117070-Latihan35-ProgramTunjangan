/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menghitung Tunjangan
 */
public class PBO210117070Latihan35ProgramTunjangan {
    
    public static void main(String[] args) {
        double gajiPokok;
        String status;

        Tunjangan tjn = new Tunjangan();
        Scanner scn = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scn.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scn.next();
        System.out.println();
        
        tjn.hasilTunjangan(gajiPokok,status);
        System.out.println("Developed By : Chiqo Rifky Saputra");
    }
    
}
