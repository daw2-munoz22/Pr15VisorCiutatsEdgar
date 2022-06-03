/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr15ciutatsedgar;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author edgarmunoz
 */
public class Pais {    
    private ArrayList<Icon> imagenes = new ArrayList<Icon>(); 
    private String paisTexto = null; 
    
    public Pais (ArrayList<Icon> imagenes){
        this.imagenes = imagenes;
    }
    public ArrayList<Icon> getPictures(){
        return imagenes;
    }
    public void setText(String paisTexto){
        this.paisTexto = paisTexto;
    }
}
