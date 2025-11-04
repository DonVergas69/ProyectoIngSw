/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_guis;

/**
 *
 * @author HP
 */
import javax.swing.JFrame;
public class main_Llamada_GUIs {
    public static void main(String[] args){
        Frm_ventanaBienvenida frame_b = new Frm_ventanaBienvenida();
        frame_b.setVisible(true);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        frame_b.setVisible(false);
        Frm_login frame_inicio = new Frm_login();
        frame_inicio.setVisible(true);
    }
    
}
