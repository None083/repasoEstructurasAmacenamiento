/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trenes;

/**
 *
 * @author FX506
 */
public class PruebaTrenes {

    public static void main(String[] args) {
        
        Trenes companiaA = new Trenes();
        
        Tren tren1 = new Tren(8888, 3);
        tren1.aniadirAlVagon(20, 0);
        tren1.aniadirAlVagon(15, 1);
        tren1.aniadirAlVagon(34, 2);
        companiaA.aniadir(tren1);
        
        Tren tren2 = new Tren(9999, 4);
        tren2.aniadirAlVagon(25, 0);
        tren2.aniadirAlVagon(6, 1);
        tren2.aniadirAlVagon(10, 2);
        companiaA.aniadir(tren2);
        
        Tren tren3 = new Tren(7777, 4);
        tren3.aniadirAlVagon(25, 0);
        tren3.aniadirAlVagon(6, 1);
        tren3.aniadirAlVagon(10, 2);
        companiaA.aniadir(tren3);
        
        System.out.println(companiaA.toString());
        
    }
    
}
