/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author FX506
 *
 * En una matriz de NxM casillas, las filas representan los diferentes Trenes
 * que tiene una compañía de transportes y las columnas los distintos vagones de
 * un tren. Cada casilla almacena un valor numérico, que es el número de
 * pasajeros de cada vagón. La primera columna representa el ID del tren y si el
 * valor de la casilla del vagón es cero, es porque no existen más vagones en
 * ese tren. Implementa un programa para que dada una matriz, se genere una
 * estructura Map con la información solicitada en clase. El map contiene como
 * keys los valores ID de los Trenes y como values los objetos tipo Tren, que
 * incluyen como atributos (ID tren, nº vagones, nº pasajeros totales que puede
 * llevar el tren).
 *
 */
public class Trenes {
    
    Map <Integer, Tren> estacion;

    public Trenes() {
        this.estacion = new HashMap<>();
    }
    
    public void aniadir(Tren t){
        estacion.put(t.getId(), t);
    }

    @Override
    public String toString() {
        String texto = "";
        
            for (Integer aux : estacion.keySet()) {
                texto = Integer.toString(aux);
                int[] array = estacion.get(aux).getVagones();
                for (int i = 0; i < array.length; i++) {
                    texto += "-" + array[i];
                }
                texto += "\n";
            }
        
        return texto;
    }
    
    
    

}
