/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_Praktikum.BAB4;

/**
 *
 * @author juann
 */
public class Login {
    private String username, password;
    public String nama;
    
    public Login() {
        nama = "Firman Frezi Pradana";
        username = "Firman";
        password = "Firman123";
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    boolean cekLogin(String username, String password) {
        if(username.equals(getUsername())&&password.equals(getPassword())){
            return true;
        } else {
            return false;
        }
    }
}
