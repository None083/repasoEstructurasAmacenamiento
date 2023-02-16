/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Pruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Vecinas3Distancia matriz1 = new Vecinas3Distancia();
        matriz1.imprimir();
        
        System.out.println("---------buscaminas---------------");
        
        Buscaminas b1 = new Buscaminas();
        boolean perdido = false;
        do{
            b1.imprimir();
            System.out.println("Introduce el número la fila");
            int fila = teclado.nextInt();
            System.out.println("Introduce el número de la columna");
            int columna = teclado.nextInt();
            perdido = b1.destaparCasilla(fila, columna);    
        }while(!perdido);
        b1.imprimir();
    }
    
}
