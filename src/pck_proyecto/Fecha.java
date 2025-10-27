/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pck_proyecto;

/**
 *
 * @author User
 */
import java.io.Serializable;

public class Fecha implements Serializable{
    private static final long serialVersionUID = 1L;
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(){
        this(1,1,1900);
    }
    
    public void setFecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    protected boolean bisiesto(){
        return (anio%100 != 0 && anio%4 == 0) || (anio%400 == 0);
    }
    
    public boolean fechaCorrecta(){
        boolean diaCorrecto, mesCorrecto, anioCorrecto;
        
        anioCorrecto = (this.anio > 1900);
        mesCorrecto = (this.mes >=1 && this.mes <= 12);
        switch(mes){
            case 2:
                if(bisiesto()){
                    diaCorrecto = (this.dia >= 1 && this.dia <= 29);
                }else{
                    diaCorrecto = (this.dia >= 1 && this.dia <= 28);
                }
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diaCorrecto = (this.dia >= 1 && this.dia <= 31);
                break;
            default:
                diaCorrecto = (this.dia >= 1 && this.dia <= 30);
                break;
        }
        
        return (diaCorrecto && mesCorrecto && anioCorrecto);
    }
    
    public String getFecha(){
        return dia + "/" + mes + "/" + anio;
    }
}
