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
public class Computador {
    Ram ram;
    HD tamanho;
    Processador proc;
    PlacaVidio modelo;
    
    
    public void Componetes(int ram, double tamanho,int proc, String modelo){
         ram = new Ram ();
         tamanho = new HD;
         proc = new Processador ();
         modelo = new PlacaVidio;
    }
         
                
    void imprimirdados(){
         System.out.println ("Componetes do Computador:");
         System.out.println ("Ram: "+ram);
         System.out.println ("HD: "+tamanho+"TB");
         System.out.println ("Processador: "+proc+" nucleos");
         System.out.println ("Placa de Vidio:"+modelo );
    }     
    
     
     
         
         
   } 
            
