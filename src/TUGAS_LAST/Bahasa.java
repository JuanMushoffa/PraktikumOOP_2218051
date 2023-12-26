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
public class Bahasa extends Siswa implements kumpulanNilai {
    double nilai1, nilai2, nilai3;
    double rata2bahasa;
    @Override
    public double nilaiProses() {
        rata2bahasa = (nilai1+nilai2+nilai3)/3;
        return rata2bahasa;
    }
}
