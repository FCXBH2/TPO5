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
public class OrdenN implements Comparator<Super_Clase> {

    @Override
    public int compare(Super_Clase S1, Super_Clase S2) {
        return S1.getNombre_Producto().compareTo(S2.getNombre_Producto());
    }
    
}
