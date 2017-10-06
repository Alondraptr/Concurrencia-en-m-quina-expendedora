package Entidad;
// Generated 24-nov-2016 15:44:26 by Hibernate Tools 4.3.1



/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private Integer idventa;
     private Caja caja;
     private Producto producto;
     private float vuelto;

    public Venta() {
    }

    public Venta(Caja caja, Producto producto, float vuelto) {
       this.caja = caja;
       this.producto = producto;
       this.vuelto = vuelto;
    }
   
    public Integer getIdventa() {
        return this.idventa;
    }
    
    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }
    public Caja getCaja() {
        return this.caja;
    }
    
    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public float getVuelto() {
        return this.vuelto;
    }
    
    public void setVuelto(float vuelto) {
        this.vuelto = vuelto;
    }




}


