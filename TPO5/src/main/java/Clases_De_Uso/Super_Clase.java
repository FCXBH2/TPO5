/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_De_Uso;

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Super_Clase {
    protected String Nombre_Producto;
    protected String Categoria;
    protected double Precio;

    public Super_Clase(String Nombre_Producto, String Categoria, double Precio) {
        this.Nombre_Producto = Nombre_Producto;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return "Super_Clase: " + "Nombre_Producto: " + Nombre_Producto + ", Categoria: " + Categoria + ", Precio: " + Precio + ".";
    }
    
}
