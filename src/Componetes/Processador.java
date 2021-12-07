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
public class Processador {
    int quntidadenucleo;
    
    public Processador(){
       quntidadenucleo = 6;
   }
 public Processador (int quntidadenucleo){
     this.quntidadenucleo = quntidadenucleo; 
 }
    
    public int getQuntidadenucleo() {
        return quntidadenucleo;
    }

    public void setQuntidadenucleo(int quntidadenucleo) {
        this.quntidadenucleo = quntidadenucleo;
    }
    
    
}
