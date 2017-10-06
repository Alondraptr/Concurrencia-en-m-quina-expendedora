/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;

/**
 *
 * @author machine
 */
public class Ng_Caja {
    Datos.Dt_Caja dtc= new Datos.Dt_Caja();
    public float obtenerSaldo()//obtener el saldo que este disponible en la maquina
    {
        return dtc.verSaldoMaquina();
    }
    
   
}
