/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author damm
 */
public class EjecucionNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Runtime rt = Runtime.getRuntime();
        Process proceso=null;
        try {
            proceso = rt.exec("ifconfig");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EjecucionProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        InputStream is = proceso.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String linea;
        try {
            while((linea = br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EjecucionProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println("Resultado: "+ proceso.exitValue());*/
        
        Runtime rt = Runtime.getRuntime();
        //Process proceso= null;
        
        
        try {
            Process proceso = rt.exec("open -a Notes.app");
            proceso.waitFor();// esto espera a que se termine el proceso de iniciación de notas
            System.out.println("se acabo el notas");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(EjecucionProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(EjecucionNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
}
    
    

