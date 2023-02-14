/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosbinarios;

/**
 *
 * @author FX506
 */
public class PruebaBinarios {

    public static void main(String[] args) {
        
        NumerosBinarios n1 = new NumerosBinarios(10);
        n1.imprimir();
        int[] array = n1.buscar();
        if(array == null){
            System.out.println("No se encuentra");
        } else{
            System.out.println(array[0] + " " + array[1]);
        }
        
        
    }
    
}
