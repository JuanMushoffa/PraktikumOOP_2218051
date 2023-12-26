/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7_POLIMORFISME;

/**
 *
 * @author juann
 */
public class Manusia extends Buah{
    //Metode makanBuah() yang memanfaatkan polimorfisme
    void makanBuah(Buah buah){
        buah.makanBuah(); //Memanggil metode makanBuah() sesuai dengan tipe objek
    }
}
