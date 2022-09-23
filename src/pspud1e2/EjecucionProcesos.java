/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damm
 */
public class EjecucionProcesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Runtime rt = Runtime.getRuntime();
        Process proceso=null;
        try {
            proceso = rt.exec("ifconfig");
        } catch (IOException ex) {
            Logger.getLogger(EjecucionProcesos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EjecucionProcesos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Resultado: "+ proceso.exitValue());
    }
    
}
