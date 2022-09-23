/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e1;

/**
 *
 * @author damm
 */
public class Main2 extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main2 thread = new Main2();
        thread.start();
        for(int i=0; i<5;i++){
            
            System.out.println("this code is running "+ i + " outside of the thread");
        }
        
        
    }
    
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            
            System.out.println("this code is running "+ i + " inside of the thread");
        }
    }
    
}
