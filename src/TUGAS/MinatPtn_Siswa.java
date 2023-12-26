/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author juann
 */
public class MinatPtn_Siswa extends Siswa{
    String minatPtn;
    private String minatJurusan;
    
    void dataNama(String nama){
        this.nama = nama;
    }
    
    void dataMinatPtn(String minatPtn){
        this.minatPtn = minatPtn;
    }

    public String getMinatJurusan() {
        return minatJurusan;
    }

    public void setMinatJurusan(String minatJurusan) {
        this.minatJurusan = minatJurusan;
    }
    
    String cetakNama(){
        return nama;
    }
    
    String cetakMinatPtn(){
        return minatPtn;
    }
}
