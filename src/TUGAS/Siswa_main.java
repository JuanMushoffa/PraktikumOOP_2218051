/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class Siswa_main {
    public static void main(String[] args) {
    // membuat object dengan nama siswa dari class Siswa
    Siswa siswa = new Siswa();
    
    //output method
    System.out.println("************************************");
    System.out.println("   DATA PRIBADI SISWA PERCEPATAN");
    System.out.println("************************************");
    System.out.println("Nama       : " + siswa.cetakNama());
    System.out.println("NIS        : " + siswa.cetakNis());
    System.out.println("IQ Siswa   : " + siswa.getIqSiswa());
    System.out.println("Angkatan   : " + siswa.cetakAngkatan());
    System.out.println("NISN       : " + siswa.cetakNisn()); 
    }
}
