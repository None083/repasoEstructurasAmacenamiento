/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosbinarios;

import java.util.Random;

/**
 *
 * @author FX506
 * 
 * Implementa una aplicación que genere matrices de NxN con números aleatorios 
 * entre 0 y 1. Se debe poder imprimir la matriz en consola y debe haber un 
 * método que busque dentro de la matriz las coordenadas de la primera casilla 
 * que encuentre cuyo valor sea cero y tenga un uno en sus esquinas 
 * (casillas vecinas de las esquinas).
 * 
 */
public class NumerosBinarios {
    
    private int[][] matriz;

    public NumerosBinarios(int n) {
        Random aleatorio = new Random();
        this.matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(2);
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
    
    public int[] buscar(){
        int[] array = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0){
                    try{
                        if (matriz[i - 1][j - 1] == 1 && matriz[i - 1][j + 1] == 1 && matriz[i + 1][j - 1] == 1 && matriz[i + 1][j + 1] == 1) {
                            array[0] = i;
                            array[1] = j;
                            return array;
                        }  
                    } catch(ArrayIndexOutOfBoundsException aiobe){
                        
                    }
                    
                }
            }
        }
        return null;
    }
    
}
