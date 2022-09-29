/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e4;

/**
 *
 * @author damm
 */
public class ProcesoSecundario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejecutando proceso secundario...");
        var codigo = (int) Math.floor(Math.random()*101);
        System.out.println("Terminado proceso secundario..."+codigo);
        System.exit(codigo);
    }
    
}
