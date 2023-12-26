/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6_ABSTRACT;

/**
 *
 * @author juann
 */
public class JajarGenjang extends BangunDatar{
    double a,t,b;
    public JajarGenjang(){
        this.a = 8;
        this.t = 3;
        this.b = 9;
    }
    @Override
    public double luas(){
        return (a*t);
    }
    @Override
    public double keliling(){
        return (2*(a+b));
    }
}
