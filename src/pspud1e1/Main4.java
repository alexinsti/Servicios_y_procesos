/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e1;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author damm
 */
public class Main4 extends Thread{
    public static final Instant inicio=Instant.now();
    public static int numero=1;
    public static Runnable tarea=null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tarea = () -> {
            try{
                numero++;
                Log("Empieza la tarea "+numero);
                Thread.sleep(5000);
                Log("Termina la tarea "+numero);
                if(numero<10){ 
                    Thread hiloHijo = new Thread(tarea);
                    hiloHijo.start();
                Log("Creo el hilo hijo del hijo "+ numero);
                }
                  
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            
        };
            
            Thread hilo = new Thread(tarea);
            
            hilo.start();
            
            try{
                Log("Se empieza a esperar al hilo");
                hilo.join(3000);
                Log("Se termina de esperar al hilo");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        
        }
        
       private static void Log(Object mensaje) {
		System.out.println(String.format("%s [%s] %s", 
			Duration.between(inicio, Instant.now()), Thread.currentThread().getName(), mensaje.toString()));
	}
        
    }

    
    

