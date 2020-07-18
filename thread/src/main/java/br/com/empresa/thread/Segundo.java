/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.thread;

/**
 *
 * @author marce
 */
public class Segundo implements Runnable{
    
   private static boolean exit=false;
    
    @Override
    public void run(){
        int i=0;
        while(!exit){          
            NewJFrame.jTextField2.setText(i+"");
            if(i==60){
                i=0;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Erro "+e.getMessage());
            }
            i++; 
        }
    }
    
}
