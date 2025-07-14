/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Subsecuencia;
import vista.vistaPrincipal;

/**
 *
 * @author Giacomo
 */
public class ControladorPrincipal {
private Subsecuencia modelo;
    private vistaPrincipal vista;

    public ControladorPrincipal(int[] secuencia) {
        this.modelo = new Subsecuencia(secuencia);
        this.vista = new vistaPrincipal();
    }

    public void procesar() {
        vista.mostrarSecuencia(modelo.getSubsecuencia());
        
        modelo.encontrarSubsecuenciaMaxima();
        
        int sumaMaxima = modelo.getSumaMaxima();
        int inicio = modelo.getInicio();
        int fin = modelo.getFin();
        int[] subsecuencia = modelo.getSubsecuencia();
        
        vista.mostrarResultado(sumaMaxima, inicio, fin, subsecuencia);
    }
}