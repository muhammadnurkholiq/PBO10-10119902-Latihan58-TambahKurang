/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan58.tambahkurang;

/**
 *
 * @author 
 * Nama     : Muhammad Nurkholiq
 * Kelas    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Program Tambah Kurang
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JumlahBilangan jb = new JumlahBilangan(3, 4);
        jb.tampilHasilJumlah();
        SelisihBilangan sb= new SelisihBilangan(3, 4);
        sb.tampilSelisih();
    }
    
}