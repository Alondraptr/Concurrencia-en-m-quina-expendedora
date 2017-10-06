package Entidad;
// Generated 24-nov-2016 15:44:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Caja generated by hbm2java
 */
public class Caja  implements java.io.Serializable {


     private Integer idcaja;
     private float saldo;
     private Set ventas = new HashSet(0);

    public Caja() {
    }

	
    public Caja(float saldo) {
        this.saldo = saldo;
    }
    public Caja(float saldo, Set ventas) {
       this.saldo = saldo;
       this.ventas = ventas;
    }
   
    public Integer getIdcaja() {
        return this.idcaja;
    }
    
    public void setIdcaja(Integer idcaja) {
        this.idcaja = idcaja;
    }
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


