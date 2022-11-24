
package pspud1e5;

public class Primo {
    
     static int Numero = 0;
     static int Contador = 0;
     
     // El main es publico para que se accesible desde fuera de la clase y
     // estático para para que se pueda ejecutar sin una instancia de la clase.
     // Es void porque es el primer código que se ejecuta y nadie puede recoger
     // su valor.
     public static void main(String[] args) {
        
        // Tomamos los números del intervalo desde los argumentos.
        var N = Integer.parseInt(args[0]);
        var M = Integer.parseInt(args[1]);
        
        System.out.println("    Generando Número Primo entre "+N+" y "+M+" ");
        
        boolean Bandera;
        
        do {
            Numero = (int) Math.floor(Math.random()*(N-M+1)+M);
            Bandera=!esPrimo(Numero);
            if (Bandera) {
                System.out.println("    Numero Generado: "+Numero+" no es primo.");
            } else {
                System.out.println("    Numero Primo Generado: "+Numero);
            }
            Contador++;
        } while (Bandera);   
        
        System.exit(Contador);
    }
     
     public static boolean esPrimo(int numero){
         
        int contador = 2;
        boolean primo=true;
        
        while ((primo) && (contador!=numero/2)){
        if (numero % contador == 0)
             primo = false;
        contador++;
        }
        
     return primo;
    }

}
