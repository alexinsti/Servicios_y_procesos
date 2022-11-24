
package pspud1e5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcesoProcessBuilderMultiple {
    
    public static void main(String[] args) {
        
         try {
            
            System.out.println("Comienza la ejecución del proceso principal");
            
            String[] infoProceso = {"Java","D:\\PSP\\PspUd1E5\\src\\pspud1e5\\Primo.java","100","200"};

            ProcessBuilder pBuilder = new ProcessBuilder(infoProceso);
            
            pBuilder.directory(new File("D:\\PSP\\PspUd1E5\\Salida"));
            var directorio = pBuilder.directory();
            
            for (int i=0;i<100;i++) {
                pBuilder.redirectOutput(new File("Salida\\SalidaPrimos_"+System.currentTimeMillis()+".txt"));
                pBuilder.start();
            }
        
            System.out.println("Termina el proceso principal, salida en "+directorio);
            
      } catch (IOException e) {
            e.printStackTrace();
      }
    }
    
}
