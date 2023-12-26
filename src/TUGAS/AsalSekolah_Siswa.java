/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class AsalSekolah_Siswa extends Siswa{
    String asalSekolah;
    int kodeSekolah;
    
    void dataNama(String nama){
        this.nama = nama;
    }
    
    void dataAsalSekolah(String asalSekolah){
        this.asalSekolah = asalSekolah;
    }
    
    void dataKodeSekolah(int kodeSekolah){
        this.kodeSekolah = kodeSekolah;
    }
    
    String cetakNama(){
        return nama;
    }
    
    String cetakAsalSekolah(){
        return asalSekolah;
    }
    
    int cetakKodeSekolah(){
        return kodeSekolah;
    }
    
    public AsalSekolah_Siswa() {
        nama = "Juan Mushoffa Aris";
        asalSekolah = "SMPN 1 TUMPANG";
        kodeSekolah = 2553;
    }
}
