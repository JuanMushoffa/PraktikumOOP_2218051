/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_Praktikum.BAB6;

/**
 *
 * @author juann
 */
public class Gaji_Reward extends Gaji_abs_reward{
    double menit, tunj_bonus, gajiPokok, tunj_anak, anak;
    int waktu;
    
    @Override
    public double tunjanganAnak(){
        if (anak == 1){
            return 0.1 * gajiPokok;
        } else if (anak > 1){
            return 0.2 * gajiPokok;
        } else {
            return 0;
        }
    }

    @Override
    public double lembur() {
        double jamLembur = menit / 60;
        tunj_bonus = jamLembur * 25000;
        return tunj_bonus;
    }
    
    double hitungBonus(){
        tunj_anak = tunjanganAnak();
        double bonusLembur = lembur();
        double totalBonus = tunj_anak + bonusLembur;
        return totalBonus;
    }
}
