/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Caja;
import Entidad.Producto;
import Entidad.Venta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alondra
 */

public class Dt_Venta {
    Caja caja = new Caja();
    Producto producto = new Producto();
    
   int idpr=0;
    public int GuardarVenta( int idpr,float vuelto)
    {
        caja.setIdcaja(1);
        producto.setIdproducto(idpr);
        SessionFactory factor = NewHibernateUtil.getSessionFactory();
        Session s;
        s = factor.openSession();
        Venta v = new Venta(caja,producto,vuelto);
        caja.getVentas().add(v);
        producto.getVentas().add(v);
        s.beginTransaction();
        Integer i = (Integer)s.save(v);
        s.getTransaction().commit();
        s.close();
        return i;
      
    }
}
