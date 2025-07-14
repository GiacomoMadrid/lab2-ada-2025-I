/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package madridruizsumamaxima;
import controlador.ControladorPrincipal;

/**
 *
 * @author Giacomo
 */
public class MadridRuizSumaMaxima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] secuencia = {-2, 11, -4, 13, -5, 9, -3, 2, -8, 4};
        
        ControladorPrincipal controlador = new ControladorPrincipal(secuencia);
        controlador.procesar();
    }
    
}
