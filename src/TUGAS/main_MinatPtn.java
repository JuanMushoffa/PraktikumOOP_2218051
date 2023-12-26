/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class main_MinatPtn {
    public static void main(String[] args) {
    // membuat object dengan nama siswa dari class Siswa
    MinatPtn_Siswa minat = new MinatPtn_Siswa();
    
    //output method
    System.out.println("*********************************************");
    System.out.println(" DATA MINAT PTN DAN JURUSAN SISWA PERCEPATAN");
    System.out.println("*********************************************");
    System.out.println("Nama              : " + minat.cetakNama());
    System.out.println("Minat PTN Siswa   : " + minat.cetakMinatPtn());
    System.out.println("Jurusan           : " + minat.getMinatJurusan());
    }
}
