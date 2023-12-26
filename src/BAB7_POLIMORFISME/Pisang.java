/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_POLIMORFISME;

/**
 *
 * @author juann
 */
public class Pisang extends Buah{
    public Pisang() {
        this.nama = "Pisang";
    }
    //Implementasi makanBuah() khusus untuk Pisang
    void makanBuah(){
        System.out.println(nama+" dimakan dengan dikupas kulit Pisang sebelum dimakan");
    }
}
