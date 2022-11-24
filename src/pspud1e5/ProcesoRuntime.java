/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcesoRuntime {
    
    public static void main(String[] args) {
        
         try {
            
            System.out.println("Comienza la ejecución del proceso principal");
            
            /* Construimos la cadena para invocar al proceso:
             Java: Interprete
             Ruta: Aplicación Java a lanzar
             Parámetros: Parámetros de entrada sobre el proceso       */   
            String[] infoProceso = {"Java","D:\\PSP\\PspUd1E5\\src\\pspud1e5\\Primo.java","100","200"};
            //String[] infoProceso = {"Java","pspud1e5.Primo","23","56"};
            
            //Lanzamos el proceso dentro de nuestro entorno
            Process proceso = Runtime.getRuntime().exec(infoProceso);
            
            // Aquí esperamos a que termine, pero no es necesario. pq?
            //proceso.waitFor();
                  
            // Obtenemos el flujo de entrada del proceso
            InputStream is = proceso.getInputStream();
            // Transformamos el charset y definimos el buffer de acceso
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            // Recorremos el buffer mostrando linea a linea
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);   
            }
            
            // Mostramos los mensajes de salida, 
            System.out.println("Intentos del Buscador de Primos: " + proceso.exitValue());
            System.out.println("Termina el proceso principal.");
            
      } catch (IOException e) { //(IOException | InterruptedException e) {
            e.printStackTrace();
      }
    }
    
}
