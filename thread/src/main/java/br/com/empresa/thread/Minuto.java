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
public class Minuto implements Runnable{
    
   private static boolean exit=false;
    
    @Override
    public void run(){
        int i=0;
        int min;
        while(!exit){
            NewJFrame.jTextField1.setText(i+"");
            if(i==60){
                i=0;
            }
            try {
                Thread.sleep(60000);
            } catch (Exception e) {
               
            }
            i++; 
        }
    }
    
}
