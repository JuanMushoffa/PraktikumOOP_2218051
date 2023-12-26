/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_V2;

/**
 *
 * @author juann
 */
public class Rata2_Nilai extends Siswa{
    double Bahasa, IPA, MTK;    

    @Override
    public double nilai() {
        return nilai(Bahasa, IPA, MTK);
    }
}
