/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author machine
 */
public class Dt_Producto {

    public float precioMarca(String marca) //Obtener el Precio de el producto a vender 
    {   SessionFactory factor = NewHibernateUtil.getSessionFactory();
        Session s;
        s = factor.openSession();
        Query consulta;
        float precio = 0;
        consulta = s.createSQLQuery("select precio from producto where marca like :code").setParameter("code", marca);

        List result = consulta.list();
        for (int i = 0; i < result.size(); i++) {
            precio = Float.parseFloat(String.valueOf(result.get(i)));
        }
        s.close();
        return precio;
    }
     public int cantidadMarca(String marca) //Obtener el Precio de el producto a vender 
    {   SessionFactory factor = NewHibernateUtil.getSessionFactory();
        Session s;
        s = factor.openSession();
        Query consulta;
        int cantidad = 0;
        consulta = s.createSQLQuery("select cantidad from producto where marca like :code").setParameter("code", marca);

        List result = consulta.list();
        for (int i = 0; i < result.size(); i++) {
            cantidad = Integer.parseInt(String.valueOf(result.get(i)));
        }
        s.close();
        return cantidad;
    }
     public void actualizarCantidadMarca()
     {}

}
    

