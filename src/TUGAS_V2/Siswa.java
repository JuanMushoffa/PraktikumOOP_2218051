/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_V2;

/**
 *
 * @author juann
 */
public class Siswa {
    // Atribut siswa
    String nama;
    int nis, angkatan, nilai;
    
    // Metode untuk mengatur atribut-atribut    
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataNis(int nis){
        this.nis = nis;
    }
    void dataAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    
    String cetakNama(){
        return nama;
    }
    int cetakNis(){
        return nis;
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
