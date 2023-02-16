/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicando;

import java.util.Random;

/**
 *
 * @author FX506
 * 
 * crea una matriz de 10 x10 con numeros aleatorios de 23a76 y crea un metodo 
 * que dada una coordenada calcule la suma de las vecinas a un maximo de 3 
 * de distancia sin contar la coordenada dada por parametro
 * y tambien el metodo imprimir
 * 
 */
public class Vecinas3Distancia {
    
    private int[][] matriz;

    public Vecinas3Distancia() {
        Random aleatorio = new Random();
        this.matriz = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(23, 76);
            }
        }
        
    }
    
    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    
    
    
    
}
