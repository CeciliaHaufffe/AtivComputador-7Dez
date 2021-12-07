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
public class HD {
    double tamanho;
    
    public HD(){
      tamanho = 200;
   }
 public HD (double tamanho){
     this.tamanho = tamanho; 
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
