/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9_EXCEPTION;

/**
 *
 * @author juann
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class throwException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jmlKaki;
        System.out.println("Berapa Jumlah kaki kerbau?");
        try{
            System.out.println("Jumlah Kaki = ");
            jmlKaki = input.nextInt(); //Mendapatkan input dari User
            if (jmlKaki != 4){
                //Jika jumlah kaki kerbau kurang atau lebih dari 4, maka akan terjadi error
                throw new NullPointerException("Terjadi Kesalahan Nih!!");
            } else {
                System.out.println("Benar jumlah Kaki kerbau 4");
            }
        }catch (NullPointerException e){
            //menampilkan Pesan Kesalahan
            e.printStackTrace();
        }
    }
}
