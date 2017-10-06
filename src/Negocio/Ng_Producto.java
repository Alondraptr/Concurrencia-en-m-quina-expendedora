/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author machine
 */
public class Ng_Producto {
    Datos.Dt_Producto dtp= new Datos.Dt_Producto();
    public float obtenerPrecioporMarca(String marca)
    {
        float precio = dtp.precioMarca(marca);
        return precio;
    }
    public int obtenerCantidadporMarca(String marca)
    {
        int cantidad = dtp.cantidadMarca(marca);
        return cantidad;
    }
    
}
