/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_POLIMORFISME;

/**
 *
 * @author juann
 */
public class Apel extends Buah{
    public Apel() {
        this.nama = "Apel";
    }
    //Implementasi makanBuah() khusus untuk Apel
    void makanBuah(){
        System.out.println(nama+" dimakan dengan dikupas kulitnya atau dimakan langsung (digigit).");
    }
}
