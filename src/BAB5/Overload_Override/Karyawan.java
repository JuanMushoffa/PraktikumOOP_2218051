/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overload_Override;

/**
 *
 * @author juann
 */
public class Karyawan {
    public double gajiDasar;
     
    public Karyawan(double gajiDasar) {
        this.gajiDasar = gajiDasar;
    }
    
    public double hitungTunjangan() {
        return gajiDasar * 0.1;
    }
}
