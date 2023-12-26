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
public class Rata2_Nilai extends Siswa implements kumpulanNilai{ 
    
    public Rata2_Nilai(){
        this.Bahasa = Bahasa;
        this.IPA = IPA;
        this.MTK = MTK;
    }
    @Override
    public double nilai() {
        return nilai(Bahasa, IPA, MTK);
    }
    public double nilaiProses() {
        return nilai;
    }
}