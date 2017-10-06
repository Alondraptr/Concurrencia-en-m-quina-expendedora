/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldsoda;

import Datos.Dt_Caja;
import Datos.NewHibernateUtil;
import Presentacion.Maquina;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author machine
 */
public class ColdSoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquina pantalla = new Maquina();
        pantalla.setVisible(true);

    }

}
