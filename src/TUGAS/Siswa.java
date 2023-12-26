/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class Siswa {
    // Atribut siswa
    String nama, nis, angkatan, nisn;
    private int iqSiswa;
      // Metode untuk mengatur atribut-atribut    
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataNis(String nis){
        this.nis = nis;
    }
    void dataAngkatan(String angkatan){
        this.angkatan = angkatan;
    }
    void dataNisn(String nisn){
        this.nisn = nisn;
    }
    public int getIqSiswa(){
        return iqSiswa;
    }
    public void setIqSiswa(int iqSiswa){
        this.iqSiswa = iqSiswa;
    }
    
    String cetakNama(){
        return nama;
    }
    String cetakNis(){
        return nis;
    }
    String cetakAngkatan(){
        return angkatan;
    }
    String cetakNisn(){
        return nisn;
    }    
    
}
