/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4_Enkapsulasi;

/**
 *
 * @author juann
 */
public class mainGaji {
    public static void main(String[] args) {
        pembayaranGaji gaji = new pembayaranGaji();
        gaji.setInput("G12345");
        System.err.println("Rekening yang anda masukkan : "+gaji.getInput());
        System.out.println("Jumlah Saldo anda : "+gaji.cekSaldo());
    }
}
