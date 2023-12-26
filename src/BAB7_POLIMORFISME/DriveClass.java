/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_POLIMORFISME;

/**
 *
 * @author juann
 */
public class DriveClass {
    public static void main(String[] args) {
        //Membuat Objek Manusia
        Manusia manusia = new Manusia();
        //Membuat objek apel dan pisang
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        Buah buah = new Buah();
        //Memanggil metode makanBuah() pada Manusia untuk objek Apel dan Pisang
        manusia.makanBuah(apel);   //Output : dari class apel 
        manusia.makanBuah(pisang); //Output : dari class pisang
        manusia.makanBuah(buah);
    }
}
