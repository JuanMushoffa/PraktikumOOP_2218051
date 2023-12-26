/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6_ABSTRACT;

/**
 *
 * @author juann
 */
public class main {
    public static void main(String[] args) {
        System.out.println("LUAS dan KELILING");
        LayangLayang x = new LayangLayang();
        System.out.println("--------------------------------");
        System.out.println("Luas Layang Layang : "+x.luas());
        System.out.println("Keliling Layang Layang : "+x.keliling());
        System.out.println("--------------------------------");
        JajarGenjang y = new JajarGenjang();
        System.out.println("Luas Jajar Genjang : "+y.luas());
        System.out.println("Keliling Jajar Genjang : "+y.keliling());
    }
}
