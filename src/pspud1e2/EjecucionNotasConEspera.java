/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damm
 */
public class EjecucionNotasConEspera {

    public static int contadorEspera=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Runtime rt = Runtime.getRuntime();
        Process proceso=null;
        //Process proceso= null;
        //waitAndRun();
        proceso = rt.exec("ping 8.8.8.8 -c 10");
        /*while(waitAndRun().isAlive()){
        contadorEspera++;
        }*/
        while(proceso.isAlive()){
            contadorEspera++;
        }
        System.out.println("se acabo el notas en "+contadorEspera);
    }
    
    public static Process waitAndRun() throws InterruptedException{
        Runtime rt = Runtime.getRuntime();
        Process proceso=null;
        try {
            proceso = rt.exec("ping 8.8.8.8 -c 10");
            //proceso.wait(5000);
        } catch (IOException ex) {
            Logger.getLogger(EjecucionNotasConEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proceso;

    }
    public static void waitFor(Process proceso) throws InterruptedException{
        proceso.waitFor();
    }
    
}
