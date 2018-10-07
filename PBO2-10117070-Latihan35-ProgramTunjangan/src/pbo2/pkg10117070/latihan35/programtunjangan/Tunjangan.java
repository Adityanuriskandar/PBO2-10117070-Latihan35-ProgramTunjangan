/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan35.programtunjangan;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menghitung Tunjangan
 */
public class Tunjangan {
    double tunjangan;
    double totalGaji;
    
    
    public void hasilTunjangan(Double gajiPokok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        //tunjangan
        tunjangan = (status.equals("Menikah")) ? 0.35 * gajiPokok : 0;

        System.out.println("Tunjangan : Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
}
