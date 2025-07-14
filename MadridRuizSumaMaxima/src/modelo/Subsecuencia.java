/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Giacomo
 */
public class Subsecuencia {
    private int[] secuencia;
    private int sumaMaxima;
    private int inicio;
    private int fin;

    public Subsecuencia(int[] secuencia) {
        this.secuencia = secuencia;
        this.sumaMaxima = 0;
        this.inicio = 0;
        this.fin = 0;
    }

    public void encontrarSubsecuenciaMaxima() {
        int sumaActual = 0;
        int inicioTemp = 0;
        sumaMaxima = 0;
        inicio = 0;
        fin = -1; // Para manejar el caso cuando todos son negativos

        for (int i = 0; i < secuencia.length; i++) {
            sumaActual += secuencia[i];

            if (sumaActual < 0) {
                sumaActual = 0;
                inicioTemp = i + 1;
            } else if (sumaActual > sumaMaxima) {
                sumaMaxima = sumaActual;
                inicio = inicioTemp;
                fin = i;
            }
        }

        // Si todos los números son negativos, sumaMaxima permanece en 0
    }

    public int getSumaMaxima() {
        return sumaMaxima;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int[] getSubsecuencia() {
        if (fin < inicio) return new int[0];
        
        int[] subsecuencia = new int[fin - inicio + 1];
        System.arraycopy(secuencia, inicio, subsecuencia, 0, fin - inicio + 1);
        return subsecuencia;
    }
}
