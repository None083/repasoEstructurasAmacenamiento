/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

/**
 *
 * @author FX506
 */
public class Tren {
    
    private int id;
    private int[] vagones;
    private int pasajerosTotales;

    public Tren(int id, int tamanio) {
        this.id = id;
        this.vagones = new int[tamanio];
        for (int i = 0; i < vagones.length; i++) {
            this.vagones[i] = 0;
        }
        this.pasajerosTotales = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getVagones() {
        return vagones;
    }

    public void setVagones(int[] vagones) {
        this.vagones = vagones;
    }

    public int getPasajerosTotales() {
        return pasajerosTotales;
    }

    public void setPasajerosTotales(int pasajerosTotales) {
        this.pasajerosTotales = pasajerosTotales;
    }

    @Override
    public String toString() {
        return "Tren{" + "id=" + id + ", vagones=" + vagones + ", pasajerosTotales=" + pasajerosTotales + '}';
    }

   public void aniadirAlVagon(int numeroPersonas, int numeroVagon){
       vagones[numeroVagon] = numeroPersonas;
       for (int i = 0; i < vagones.length; i++) {
           pasajerosTotales += vagones[i];
       }
   }
    
    
}
