/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class main_AsalSekolah {
    public static void main(String[] args) {
    // membuat object dengan nama siswa dari class Siswa
    AsalSekolah_Siswa asal = new AsalSekolah_Siswa();
    
    //output method
    System.out.println("************************************");
    System.out.println(" DATA ASAL SEKOLAH SISWA PERCEPATAN");
    System.out.println("************************************");
    System.out.println("Nama                : " + asal.cetakNama());
    System.out.println("Asal Sekolah SMP    : " + asal.cetakAsalSekolah());
    System.out.println("Kode Sekolah        : " + asal.cetakKodeSekolah());
    }
}
