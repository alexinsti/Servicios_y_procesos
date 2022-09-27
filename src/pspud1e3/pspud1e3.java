/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author damm
 */
public class pspud1e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Process proceso = new ProcessBuilder(
                    "/usr/local/bin/python3",
                    "/Users/damm/NetBeansProjects/Pspud1e1/src/pspud1e3/proceso_python.py").start();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream()));
            proceso.waitFor();

            int exitStatus = proceso.exitValue();
            System.out.println("Retorno:" + br.readLine());
            System.out.println("Valor de la salida:" + exitStatus);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
