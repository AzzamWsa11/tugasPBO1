/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika uas = new Matematika();
        
        int hasilPertambahan = uas.pertambahan(20, 20);
        int hasilPengurangan = uas.pengurangan(10, 5);
        int hasilPerkalian = uas.perkalian(10, 20);
        int hasilPembagian = uas.pembagian(21, 2);
        
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);
        System.out.println("Pembagian: 21 / 2 = " +hasilPembagian);
    }
}
    

