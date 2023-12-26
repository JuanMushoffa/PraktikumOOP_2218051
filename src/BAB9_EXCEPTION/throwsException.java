/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9_EXCEPTION;

/**
 *
 * @author juann
 */
public class throwsException {
    static void Error() throws ClassNotFoundException{
        System.out.println("Ada yang error nih1!");
        throw new ClassNotFoundException("Error Sudah saya tangkap");
    }
    public static void main(String[] args) {
        try {
            throwsException.Error();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
