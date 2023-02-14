/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizaleatorios;

import java.util.Random;

/**
 *
 * @author FX506
 *
 * Implementa un programa que genere matrices de NxN, rellenando la matriz en
 * cada posición de forma aleatoria, con números que no se pueden repetir, entre
 * 1 y N^2 .
 */
public class MatrizAleatorios {

    private int[][] matriz;

    public MatrizAleatorios(int n) {
        Random aleatorio = new Random();
        this.matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                boolean repetido = false;
                do {
                    repetido = false;
                    int numero = aleatorio.nextInt((int) Math.pow(n, 2)) + 1;
                    for (int k = 0; k < matriz.length; k++) {
                        for (int l = 0; l < matriz[k].length; l++) {
                            if (matriz[k][l] == numero) {
                                repetido = true;
                            }
                        }
                    }
                    if (repetido == false) {
                        matriz[i][j] = numero;
                    }
                } while (repetido == true);

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
