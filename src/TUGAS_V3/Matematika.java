/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_V3;

/**
 *
 * @author juann
 */
public class Matematika extends Siswa implements kumpulanNilai {
    double nilai1, nilai2, nilai3;
    double rata2mtk;
    @Override
    public double nilaiProses() {
        rata2mtk = (nilai1+nilai2+nilai3)/3;
        return rata2mtk;
    }
}
