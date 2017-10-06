/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.Ng_Caja;
import Negocio.Ng_Producto;
import Negocio.Ng_Venta;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author machine
 */
public class Maquina extends javax.swing.JFrame {

    //Llama al la capa de negocios
    Ng_Caja caja = new Ng_Caja(); 
    Ng_Venta venta = new Ng_Venta();
        Ng_Producto producto = new Ng_Producto();

    float dineroDisponible=0;
    float cambio=0;
    public float saldoCaja() //Conocer el saldo disponible
    { // Este metodo tiene como proposito, verificar cuanto dinero tiene disponible la caja 
        float saldo = caja.obtenerSaldo();
        return saldo;
    }
     public float precioProducto(String marca)//Obtener el precio del producto por la marca
    {
        float precio = producto.obtenerPrecioporMarca(marca);
        return precio;
    }
    public int cantidadDisponible(String marca)//Obtener la cantidad de producto que se encuentre en existencia para poder realizar una venta
    {        
        int cantidad = producto.obtenerCantidadporMarca(marca);
        return cantidad;
    }
    public void bloqueoBtnr(boolean valor)//Bloquear o desbloquear la funcionalidada de los radiobutton en dependecia de los suscesos
    {
        
        btnr7up.setEnabled(valor);
        btnrcoca.setEnabled(valor);
        btnrpepsi.setEnabled(valor);
        btnrfanta.setEnabled(valor);
        btnrdr.setEnabled(valor);
        btnrcanada.setEnabled(valor);
        btnrsprite.setEnabled(valor);
        btnrrc.setEnabled(valor);
        btnrbig.setEnabled(valor);
        btnrinca.setEnabled(valor);
       
    }
    public void clear() //Regresar al valor inicial todos los campos ,bloquea los botones necesarios
    {
        cambio=0;
        dineroDisponible=0;
        txaPantalla.setText("Su saldo actual es: 0.00");
        txtEntrega.setText(" ");
        txtMonto.setText("0.00");
        txtCambio.setText("0.00");
        bloqueoBtnr(false);
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrdr.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false);
        btnrrc.setSelected(false);
     
        
    }
    public void compra(String marca)//Realizar la compra de un producto
    {
        float precio= precioProducto(marca);
       int cantidad=cantidadDisponible(marca);
       int idp =0;//Conocer el id del producto
       if(marca.equals("coca cola"))
        idp=1;   
        else if(marca.equals("7up"))
         idp=2;
       else if(marca.equals("pepsi"))
         idp=3;
       else if(marca.equals("canada"))
         idp=4;
       else if(marca.equals("pepper"))
         idp=5;
       else if(marca.equals("fanta"))
         idp=6;
       else if(marca.equals("sprite"))
         idp=7;
       else if(marca.equals("rc"))
         idp=8;
       else if(marca.equals("big"))
         idp=9;
       else if(marca.equals("inca"))
         idp=10;
       
        if ((dineroDisponible >= precio) && (saldoCaja() > dineroDisponible)) 
        {
            if(cantidad>=1)
            {
            cambio = dineroDisponible - precio;
            if (cambio != 0) {
                txaPantalla.setText("Su cambio es de: " + cambio);
                txtMonto.setText("0.00");
                txtCambio.setText(String.valueOf(cambio));
                dineroDisponible=0;
                venta.registroVenta(idp,precio);
                
            } else {
                txaPantalla.setText("¡Gracias por su compra!");
                dineroDisponible=0;
                venta.registroVenta(idp,precio);
              
            }
            }else
             {
                 txaPantalla.setText("Lamentablemente no hay el "
                    + "\nproducto seleccionado en stock");
            txtCambio.setText(txtMonto.getText());
            txtMonto.setText("0.00");
            dineroDisponible=0;
             }
        } else if ((saldoCaja() < dineroDisponible) && (dineroDisponible >= precio)) 
        {
             if(cantidad>=1){
            txaPantalla.setText("La maquina no cuenta con el saldo sufiente."
                    + "\nNo se podra realizar la compra."
                    + "\nRegrese más tarde.¡Gracias!");
            txtCambio.setText(txtMonto.getText());
            txtMonto.setText("0.00");
            dineroDisponible=0;
            }
        } else if ((saldoCaja() >= dineroDisponible) && (dineroDisponible < precio)) 
        {
             if(cantidad>=1)
             {
            txaPantalla.setText("No cuenta con dinero suficiente "
                    + "\npara realizar la compra del producto.");
            txtCambio.setText(txtMonto.getText());
            txtMonto.setText("0.00");
            dineroDisponible=0;
             }
        }
      
    }
    public Maquina() {
        initComponents();      
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnegro = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn7up = new javax.swing.JButton();
        btncoca = new javax.swing.JButton();
        btnpepsi = new javax.swing.JButton();
        btncanada = new javax.swing.JButton();
        btninca = new javax.swing.JButton();
        btndrpepper = new javax.swing.JButton();
        btnfanta = new javax.swing.JButton();
        btnbigcola = new javax.swing.JButton();
        btnrc = new javax.swing.JButton();
        btnsprite = new javax.swing.JButton();
        btnr7up = new javax.swing.JRadioButton();
        btnrcoca = new javax.swing.JRadioButton();
        btnrpepsi = new javax.swing.JRadioButton();
        btnrcanada = new javax.swing.JRadioButton();
        btnrdr = new javax.swing.JRadioButton();
        btnrfanta = new javax.swing.JRadioButton();
        btnrbig = new javax.swing.JRadioButton();
        btnrrc = new javax.swing.JRadioButton();
        btnrsprite = new javax.swing.JRadioButton();
        btnrinca = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        txtEntrega = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPantalla = new javax.swing.JTextArea();
        txtCambio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btninstrucciones = new javax.swing.JButton();
        btndevolucion = new javax.swing.JButton();
        btningreso = new javax.swing.JButton();
        btnObtenerCambio = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnegro.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btn7up.setBackground(new java.awt.Color(255, 255, 255));
        btn7up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7up-New.jpg"))); // NOI18N
        btn7up.setBorderPainted(false);
        btn7up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btncoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-coca-cola.jpg"))); // NOI18N
        btncoca.setBorderPainted(false);

        btnpepsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/368318.jpg"))); // NOI18N
        btnpepsi.setBorderPainted(false);

        btncanada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cd-logo.png"))); // NOI18N
        btncanada.setBorderPainted(false);

        btninca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-inca-kola.png"))); // NOI18N
        btninca.setBorderPainted(false);

        btndrpepper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dr_Pepper_modern.svg.png"))); // NOI18N
        btndrpepper.setBorderPainted(false);

        btnfanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photo.jpg"))); // NOI18N
        btnfanta.setBorderPainted(false);

        btnbigcola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/200px-Big_Cola_Logo_2012.svg.png"))); // NOI18N
        btnbigcola.setBorderPainted(false);

        btnrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RC_Cola_logo.svg.png"))); // NOI18N
        btnrc.setBorderPainted(false);

        btnsprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sprite-logo-old.png"))); // NOI18N
        btnsprite.setBorderPainted(false);

        btnr7up.setText("C$13.25");
        btnr7up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnr7upActionPerformed(evt);
            }
        });

        btnrcoca.setText("C$17.50");
        btnrcoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrcocaActionPerformed(evt);
            }
        });

        btnrpepsi.setText("C$13.50");
        btnrpepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrpepsiActionPerformed(evt);
            }
        });

        btnrcanada.setText("C$17.25");
        btnrcanada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrcanadaActionPerformed(evt);
            }
        });

        btnrdr.setText("C$22.00");
        btnrdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrdrActionPerformed(evt);
            }
        });

        btnrfanta.setText("C$13.00");
        btnrfanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrfantaActionPerformed(evt);
            }
        });

        btnrbig.setText("C$10.00");
        btnrbig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrbigActionPerformed(evt);
            }
        });

        btnrrc.setText("C$22.75");
        btnrrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrrcActionPerformed(evt);
            }
        });

        btnrsprite.setText("C$15.10");
        btnrsprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrspriteActionPerformed(evt);
            }
        });

        btnrinca.setText("C$19.50");
        btnrinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrincaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(0, 96, Short.MAX_VALUE)
                                                .addComponent(btndrpepper, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(btnrsprite)))
                                        .addGap(11, 11, 11))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(btnsprite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btncanada, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnrcanada)))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnrc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnrdr))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnr7up)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn7up, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnrcoca)
                                    .addComponent(btncoca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnrfanta)
                                .addComponent(btnbigcola, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnrbig))
                            .addComponent(btnrpepsi)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btninca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrrc)
                            .addComponent(btnrinca))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnfanta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnpepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn7up, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncoca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnr7up)
                            .addComponent(btnrcoca)
                            .addComponent(btnrpepsi))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndrpepper, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncanada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnfanta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrcanada)
                    .addComponent(btnrdr)
                    .addComponent(btnrfanta))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnrc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsprite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbigcola))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrbig)
                    .addComponent(btnrrc)
                    .addComponent(btnrsprite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btninca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnrinca)
                .addGap(33, 33, 33))
        );

        btn7up.getAccessibleContext().setAccessibleName("btn7up");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setDisabledIcon(null);
        jButton2.setDisabledSelectedIcon(null);

        txtEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEntrega))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenidos");

        txaPantalla.setEditable(false);
        txaPantalla.setColumns(20);
        txaPantalla.setRows(5);
        jScrollPane1.setViewportView(txaPantalla);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtCambio.setEditable(false);
        txtCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCambio.setText("0.00");

        jLabel15.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Su cambio es de: ");

        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setText("0.00");
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        btninstrucciones.setText("Instrucciones");
        btninstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninstruccionesActionPerformed(evt);
            }
        });

        btndevolucion.setText("Devolución");
        btndevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolucionActionPerformed(evt);
            }
        });

        btningreso.setText("Ingrese Cantidad");
        btningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresoActionPerformed(evt);
            }
        });

        btnObtenerCambio.setText("Obtener Cambio");
        btnObtenerCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerCambioActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ingrese el monto:");

        javax.swing.GroupLayout jpnegroLayout = new javax.swing.GroupLayout(jpnegro);
        jpnegro.setLayout(jpnegroLayout);
        jpnegroLayout.setHorizontalGroup(
            jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnegroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnegroLayout.createSequentialGroup()
                        .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnegroLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnegroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnegroLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jpnegroLayout.createSequentialGroup()
                                        .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnegroLayout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(btningreso)
                                            .addGroup(jpnegroLayout.createSequentialGroup()
                                                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(btnObtenerCambio))
                                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(13, 13, 13)))))
                        .addGap(52, 52, 52))
                    .addGroup(jpnegroLayout.createSequentialGroup()
                        .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnegroLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btninstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnegroLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btndevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpnegroLayout.setVerticalGroup(
            jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnegroLayout.createSequentialGroup()
                .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnegroLayout.createSequentialGroup()
                        .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnegroLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btninstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btningreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(btndevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addGroup(jpnegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnObtenerCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnegroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jpnegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrcocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrcocaActionPerformed
        // TODO add your handling code here:
        
       if(btnrcoca.isSelected()==true)
        {
        btnr7up.setSelected(false);
        btnrpepsi.setSelected(false);
        btnrfanta.setSelected(false);
        btnrdr.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false); 
        
        }
               compra("coca cola");    
           
    }//GEN-LAST:event_btnrcocaActionPerformed

    private void btnr7upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnr7upActionPerformed
        // TODO add your handling code here:
        if(btnr7up.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnrpepsi.setSelected(false);
        btnrfanta.setSelected(false);
        btnrdr.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false); 
        }
        compra("7up");
        
    }//GEN-LAST:event_btnr7upActionPerformed

    private void btnrpepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrpepsiActionPerformed
        // TODO add your handling code here:
        if(btnrpepsi.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnrdr.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false);
        compra("pepsi");
        }
    }//GEN-LAST:event_btnrpepsiActionPerformed

    private void btnrcanadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrcanadaActionPerformed
        // TODO add your handling code here:
        if(btnrcanada.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnrdr.setSelected(false);
        btnrpepsi.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false);
        compra("canada");
        }
    }//GEN-LAST:event_btnrcanadaActionPerformed

    private void btnrdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrdrActionPerformed
        // TODO add your handling code here:
        if(btnrdr.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false);
        compra("pepper");
        }
    }//GEN-LAST:event_btnrdrActionPerformed

    private void btnrfantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrfantaActionPerformed
        // TODO add your handling code here:
        if(btnrfanta.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrdr.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false); 
        compra("fanta");
        }
    }//GEN-LAST:event_btnrfantaActionPerformed

    private void btnrspriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrspriteActionPerformed
        // TODO add your handling code here:
        if(btnrsprite.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrdr.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false); 
        compra("sprite");
        }
    }//GEN-LAST:event_btnrspriteActionPerformed

    private void btnrrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrrcActionPerformed
        // TODO add your handling code here:
        if(btnrrc.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrdr.setSelected(false);
        btnrbig.setSelected(false);
        btnrinca.setSelected(false);
        compra("rc");
        }
    }//GEN-LAST:event_btnrrcActionPerformed

    private void btnrbigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrbigActionPerformed
        // TODO add your handling code here:
        if(btnrbig.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrdr.setSelected(false);
        btnrinca.setSelected(false); 
        compra("big");
        }
    }//GEN-LAST:event_btnrbigActionPerformed

    private void btnrincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrincaActionPerformed
        // TODO add your handling code here:
        if(btnrinca.isSelected()==true)
        {
        btnrcoca.setSelected(false);
        btnr7up.setSelected(false);
        btnrfanta.setSelected(false);
        btnpepsi.setSelected(false);
        btnrcanada.setSelected(false);
        btnrsprite.setSelected(false);
        btnrrc.setSelected(false);
        btnrbig.setSelected(false);
        btnrdr.setSelected(false);
        compra("inca");
        }
    }//GEN-LAST:event_btnrincaActionPerformed

    private void btndevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolucionActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"La transaccion se ha cancelado");
        txaPantalla.setText("Devolución del dinero en proceso");
        txtCambio.setText(txtMonto.getText());
        txtMonto.setText("0.00");
        
    }//GEN-LAST:event_btndevolucionActionPerformed

    private void btnObtenerCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerCambioActionPerformed
        // TODO add your handling code here:
      clear();//limpiartodo
    }//GEN-LAST:event_btnObtenerCambioActionPerformed

    private void btningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresoActionPerformed
        // TODO add your handling code here:
        String dinero;
        dinero= txtMonto.getText();
        String cambio=txtCambio.getText();
        if(cambio.equals("0.00"))
        {
        if((Float.parseFloat(dinero) <=9.99))
        {
            txaPantalla.setText("El saldo actual no es suficiente"
                    + "\n para realizar ninguna compra.");
            txtCambio.setText(txtMonto.getText());
            txtMonto.setText("0.00");
            bloqueoBtnr(false);
       
        }
        else 
        {
            txaPantalla.setText("Su saldo actual es de \n"+dinero);
            dineroDisponible= Float.parseFloat(dinero);
            bloqueoBtnr(true);
            btndevolucion.setEnabled(true);
        }
        }else
        {
            JOptionPane.showMessageDialog(null, "Por favor retire el cambio. Gracias");
            
        }
    }//GEN-LAST:event_btningresoActionPerformed

    private void btninstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninstruccionesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Intrucciones:"
                + "\n1.Ingrese el monto del dinero del que dispone para realizar la compra"
                + "\n2.Seleccione el producto que desea"
                + "\n3.Espere a que el producto salga"
                + "\n4.Si desea cancelar la trasacción, presione el boton de --Devolucion--"
                + "\n*****Nota*****"
                + "\n--> Un producto por transacción"
                + "\n-->Si su saldo no es suficiente no podra realizar la compra"
                + "\n-->Si la maquina no tiene el suficiente saldo para la transacción, no se realizara"
                + "\n-->Espere su vuelto, en caso de que exista ");
       
    }//GEN-LAST:event_btninstruccionesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_formWindowOpened

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Maquina ma = new Maquina();
                ma.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
               ma.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn7up;
    private javax.swing.JButton btnObtenerCambio;
    private javax.swing.JButton btnbigcola;
    private javax.swing.JButton btncanada;
    private javax.swing.JButton btncoca;
    private javax.swing.JButton btndevolucion;
    private javax.swing.JButton btndrpepper;
    private javax.swing.JButton btnfanta;
    private javax.swing.JButton btninca;
    private javax.swing.JButton btningreso;
    private javax.swing.JButton btninstrucciones;
    private javax.swing.JButton btnpepsi;
    private javax.swing.JRadioButton btnr7up;
    private javax.swing.JRadioButton btnrbig;
    private javax.swing.JButton btnrc;
    private javax.swing.JRadioButton btnrcanada;
    private javax.swing.JRadioButton btnrcoca;
    private javax.swing.JRadioButton btnrdr;
    private javax.swing.JRadioButton btnrfanta;
    private javax.swing.JRadioButton btnrinca;
    private javax.swing.JRadioButton btnrpepsi;
    private javax.swing.JRadioButton btnrrc;
    private javax.swing.JRadioButton btnrsprite;
    private javax.swing.JButton btnsprite;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpnegro;
    private javax.swing.JTextArea txaPantalla;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
