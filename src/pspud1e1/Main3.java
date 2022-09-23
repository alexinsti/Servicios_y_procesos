/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e1;

/**
 *
 * @author damm
 */
public class Main3 extends Thread{
    public static int amount=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main3 thread = new Main3();
        thread.start();
        for(int i=0; i<5;i++){
            amount++;
            System.out.println(amount);
        }
        
        
    }
    
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            amount+=1000;
            System.out.println(amount);
        }
    }
    
}
