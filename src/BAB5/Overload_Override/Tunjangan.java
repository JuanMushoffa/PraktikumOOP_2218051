/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overload_Override;

/**
 *
 * @author juann
 */
public class Tunjangan {
    
    //Method Overload untuk menghitung tunjangan berdasarkan gaji dasar
    public double hitungTunjangan(int gajiDasar) {
        return gajiDasar * 0.1;
    }
    
    //Method Overload untuk menghitung tunjangan berdasarkan gaji dasar dan tahun pengalaman
    public double hitungTunjangan(int gajiDasar, int tahunPengalaman) {
        double tunjangan = gajiDasar * 0.1;
        if (tahunPengalaman >= 5) {
            tunjangan += 100000 ;
        }
        return tunjangan;
    }
    
    //Method Overload untuk menghitung tunjangan berdasarkan gaji dasar, tahun pengalaman, dan jenis pekerjaan
    public double hitungTunjangan(int gajiDasar, int tahunPengalaman, String jenisPekerjaan) {
        double tunjangan = gajiDasar * 0.1;
        if (tahunPengalaman >= 5) {
            tunjangan += 300000;
        }
        if (jenisPekerjaan.equalsIgnoreCase("manager")) {
            tunjangan += 500000;
        }
        return tunjangan;
    }
}
