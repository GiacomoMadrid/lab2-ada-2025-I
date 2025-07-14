/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Giacomo
 */
public class vistaPrincipal {
    public void mostrarSecuencia(int[] secuencia) {
        System.out.println("Secuencia:");
        for (int i = 0; i < secuencia.length; i++) {
            System.out.printf("| %2d ", secuencia[i]);
        }
        System.out.println("|");
        
        for (int i = 0; i < secuencia.length; i++) {
            System.out.printf("| %2d ", i+1);
        }
        System.out.println("|");
    }

    public void mostrarResultado(int sumaMaxima, int inicio, int fin, int[] subsecuencia) {
        System.out.println("\nResultado:");
        System.out.println("Suma máxima: " + sumaMaxima);
        System.out.println("Subsecuencia: desde posición " + (inicio + 1) + " hasta " + (fin + 1));
        
        System.out.print("Elementos: [");
        for (int i = 0; i < subsecuencia.length; i++) {
            System.out.print(subsecuencia[i]);
            if (i < subsecuencia.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}