/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */

public class Mod_Model_Tabla extends DefaultTableModel{
    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 2 || column == 3 || column == 4) {
            return false;
        }
        return true;
    }
}
