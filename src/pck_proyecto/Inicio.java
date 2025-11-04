/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Inicio {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,"BIENVENIDO","HOLA",JOptionPane.PLAIN_MESSAGE);
        test_bd frame = new test_bd();
        frame.isVisible();
    }
}
