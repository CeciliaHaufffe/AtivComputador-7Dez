/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componetes;

/**
 *
 * @author IFSC
 */
public class PlacaVidio {
    String modelo;
 
    public PlacaVidio (){
        modelo = "RTX 3080";
   }
 public PlacaVidio (String modelo){
     this.modelo = modelo; 
 }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
