/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;

import vista.consulta;

/**
 *
 * @author LN710Q
 */
public class LABO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable(){
        @Override
         public void run(){
             new consulta().setVisible(true);
         } 
    });
    }
    
}
