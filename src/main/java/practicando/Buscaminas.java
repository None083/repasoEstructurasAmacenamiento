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
 * haz un buscaminas, para ello se necesita una matriz 5x5 de booleanos
 * aleatorios que estara oculta para el jugador(si es true es una mina y si es
 * false no es nada), y otra matriz 5x5 de strings que sera la que vea el
 * jugador , cada casilla podra tener el valor x cuando aun no se sepa el valor
 * de la casilla, 0 cuando se sepa que no es una mina y 1 cuando se sepa que es
 * una mina. El jugador deberá dar coordenadas y el programa mostrara el
 * resultado del array, cuando el jugador desvele una mina el juego acaba
 *
 */
public class Buscaminas {

    private boolean[][] matrizBooleanos;
    private String[][] matrizStrings;

    public Buscaminas() {
        this.matrizBooleanos = new boolean[5][5];
        Random aleatorio = new Random();
        for (int i = 0; i < matrizBooleanos.length; i++) {
            for (int j = 0; j < matrizBooleanos[i].length; j++) {
                this.matrizBooleanos[i][j] = aleatorio.nextBoolean();
            }
        }
        this.matrizStrings = new String[5][5];
        for (int i = 0; i < matrizStrings.length; i++) {
            for (int j = 0; j < matrizStrings[i].length; j++) {
                this.matrizStrings[i][j] = "X";
            }
        }

    }

    public boolean destaparCasilla(int fila, int columna) {

        if (matrizBooleanos[fila][columna] == false) {
            matrizStrings[fila][columna] = "0";
            return false;
        } else {
            matrizStrings[fila][columna] = "1";
            return true;
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < matrizStrings.length; i++) {
            for (int j = 0; j < matrizStrings[i].length; j++) {
                System.out.print(matrizStrings[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}