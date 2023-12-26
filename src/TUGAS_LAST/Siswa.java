/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_LAST;

import TUGAS_V3.*;

/**
 *
 * @author juann
 */
public class Siswa{
    // Atribut siswa
    String nama, alamat;
    int angkatan, nilai;
    double Bahasa, IPA, MTK;
    
    // Metode untuk mengatur atribut-atribut    
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
    }
    void dataAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    
    String cetakNama(){
        return nama;
    }
    String cetakAlamat(){
        return alamat;
    }
    int cetakAngkatan(){
        return angkatan;
    }
    
    public double nilai(){
        return 0;
    }
    public double nilai(double A, double B, double C){
        return ((A + B + C)/3);
    }
    
}
