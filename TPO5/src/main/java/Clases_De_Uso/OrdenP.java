/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_De_Uso;

import java.util.Comparator;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class OrdenP implements Comparator<Super_Clase> {

    @Override
    public int compare(Super_Clase S1, Super_Clase S2) {
        if(S1.getPrecio()>S2.getPrecio()) return 1;
        if(S1.getPrecio()<S2.getPrecio()) return -1;
        return 0;
    }
    
}
