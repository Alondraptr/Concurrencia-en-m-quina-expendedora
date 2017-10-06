/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Dt_Venta;
import Entidad.Caja;
import Entidad.Producto;

/**
 *
 * @author Alondra
 */
public class Ng_Venta {
    Dt_Venta dv = new Dt_Venta();
    
    public int registroVenta( int producto,  float vuelto)
    {
        int x=0;
        x=dv.GuardarVenta(producto, vuelto);
        return x;
    }
}
