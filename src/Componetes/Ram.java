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
public class Ram {
    int quantidade; 
 public Ram(){
       quantidade = 6;
   }
  public Ram (int quantidade){
     this.quantidade = quantidade; 
 }
   
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
