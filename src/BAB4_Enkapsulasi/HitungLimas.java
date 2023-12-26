/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4_Enkapsulasi;

/**
 *
 * @author juann
 */
public class HitungLimas {
    private double LuasAlas;
    public double tinggi;
    double volume;
    
    public double getLuasAlas() {
        return LuasAlas;
    }
    public void  setLuasAlas(double LuasAlas) {
        this.LuasAlas = LuasAlas;
    }
    public double volumeLimas() {
        volume = (LuasAlas * tinggi) / 3;
        return volume;
    }
}
