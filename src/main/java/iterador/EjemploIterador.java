/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterador;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class EjemploIterador {
    
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new HashSet<>();
        
        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(20);
        
        for (Integer numerico : conjunto) {
            System.out.println("Elemento " + numerico);
            //mo puedo borrar de un conjunto de datos
            //si se está recorriendo el mismo
//            if (numerico == 20){
//                conjunto.remove(20);
//            }
        }
        
        Iterator<Integer> it = conjunto.iterator();
        
        while(it.hasNext()){
            Integer numerico = it.next();
            if(numerico == 20){
                it.remove();
            }
        }
        
        conjunto.forEach(System.out::println);
        
    }
    
}
