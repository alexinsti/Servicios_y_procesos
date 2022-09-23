/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e1;

/**
 *
 * @author damm
 */
public class Main extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=0; i<5;i++){
            Main thread = new Main();
            thread.start();
            System.out.println("this code is outside of the thread");
        }
        
        
    }
    
    @Override
    public void run(){
        System.out.println("this code is running in a thread");
    }
    
}
