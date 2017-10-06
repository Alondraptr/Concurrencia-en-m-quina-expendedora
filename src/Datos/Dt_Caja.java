/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.Caja;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author machine
 */
public class Dt_Caja {
    
    public float verSaldoMaquina()
    {
        SessionFactory factor = NewHibernateUtil.getSessionFactory();
        Session s;
        s = factor.openSession();
        Query consulta;
        float cantidad = 0;
        consulta = s.createSQLQuery("select saldo  from  caja ");
      
    
       List result = consulta.list();
        for (int i = 0; i < result.size(); i++) {
            cantidad = Float.parseFloat(String.valueOf(result.get(i)));
        }


        s.close();
        return cantidad;
      
    }
    
    public void newSaldo(float precio){
        
        SessionFactory factor = NewHibernateUtil.getSessionFactory();
        Session s;
        s = factor.openSession();
        Caja c = new Caja();
        c.setIdcaja(1);
        c.setSaldo(verSaldoMaquina()-precio);
        s.beginTransaction();
        s.update(c);
        s.getTransaction().commit();
        s.close();
    }
    
    
}
