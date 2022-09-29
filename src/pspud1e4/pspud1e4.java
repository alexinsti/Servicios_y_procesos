/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspud1e4;

/**
 *
 * @author damm
 */
public class pspud1e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            String[] infoProceso = {"Java", "/Users/damm/NetBeansProjects/Pspud1e1/src/pspud1e4/ProcesoSecundario.java"};
            String[] infoProceso2 = {"Java","pspud1e4/ProcesoSecundario.java"};
            
            int valorRetorno;
            int valorRetorno2;
            Process proceso;
            Process proceso2;
            do{
                proceso= Runtime.getRuntime().exec(infoProceso);
                valorRetorno = proceso.waitFor();
                System.out.print("codigo1: ");
                System.out.println(valorRetorno);
            }while(valorRetorno<50);
            
            do{
                proceso2= Runtime.getRuntime().exec(infoProceso);
                valorRetorno2 = proceso2.waitFor();
                System.out.print("codigo2: ");
                System.out.println(valorRetorno2);
            }while(valorRetorno2<50);
            
            System.out.println(valorRetorno*valorRetorno2);
            

            if (valorRetorno < 50) {
                System.out.println("El proceso secundario terminó correctamente. Código: " + valorRetorno);
            } else {
                System.out.println("El proceso secundario generó el Error: " + valorRetorno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
