/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megapublicidad2.pkg0;

import Metodos.Generales;
import java.sql.Connection;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author German Valdez
 */
public class ventanaGranFormato extends javax.swing.JFrame {

    /**
     * Creates new form ventanaArticulos
     */
    ventanaPrincipal ventas;
    Generales u;
    String codP, precio = "", panel = "";
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public ventanaGranFormato(String panel, Connection c) {
        initComponents();
        setLocationRelativeTo(null);

        this.panel = panel;
        u = new Generales(c);

        iniciaTabla();
    }

    private void iniciaTabla() {
        limpiar(tablaArticulos);
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        u.tablaProductos2(modelo, " where tipoFormato='GRAN FORMATO'");
    }

    /*    public void calcularConMedidas() {
     String cantidad = txtCantidad.getText();
     double num = Double.parseDouble(cantidad);
     double importe = (Double.parseDouble(txtMedidas.getText()) * Double.parseDouble(precio)) * num;
     txtImporte.setText(df.format(importe) + "");
     }
     */
    public void calcular() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double medidas = Double.parseDouble(txtMedidas.getText());
            double importe = (medidas * Double.parseDouble(precio)) * cantidad;
            txtImporte.setText(df.format(importe) + "");
        }
        catch (Exception e) {
        }
    }

    private void limpiar(JTable tabla) {
        while (tabla.getRowCount() > 0) {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        combo = new javax.swing.JComboBox();
        txtBus = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMedidas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrec = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        radioMaquila = new javax.swing.JRadioButton();
        radioPublicoG = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gran Formato");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setOpaque(false);

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Tipo" }));

        txtBus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusKeyReleased(evt);
            }
        });

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Tipo", "Nombre", "Descripcion", "Precio General", "Precio Maquila", "Existencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaArticulos);
        tablaArticulos.getColumnModel().getColumn(0).setMinWidth(35);
        tablaArticulos.getColumnModel().getColumn(0).setPreferredWidth(35);
        tablaArticulos.getColumnModel().getColumn(0).setMaxWidth(35);
        tablaArticulos.getColumnModel().getColumn(1).setMinWidth(100);
        tablaArticulos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaArticulos.getColumnModel().getColumn(1).setMaxWidth(100);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 480, 408));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        jPanel3.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");

        txtMedidas.setText("1");
        txtMedidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMedidasKeyReleased(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Medidas");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descripcion");

        txtImporte.setText("0");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Codigo");

        txtCodigo.setEditable(false);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Precio");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Importe");

        radioMaquila.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMaquila);
        radioMaquila.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioMaquila.setForeground(new java.awt.Color(255, 255, 255));
        radioMaquila.setText("Maquila");

        radioPublicoG.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioPublicoG);
        radioPublicoG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioPublicoG.setForeground(new java.awt.Color(255, 255, 255));
        radioPublicoG.setSelected(true);
        radioPublicoG.setText("Publico General");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Cliente");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad");

        txtCantidad.setText("1");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alto");

        txtBase.setText("1");
        txtBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBaseKeyReleased(evt);
            }
        });

        txtAltura.setText("1");
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAlturaKeyReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ancho");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Unitario");

        txtPrecioUnitario.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrec)
                    .addComponent(txtDesc)
                    .addComponent(txtNombre)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radioPublicoG)
                                .addGap(18, 18, 18)
                                .addComponent(radioMaquila))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedidas)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioPublicoG)
                    .addComponent(radioMaquila))
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMenu.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusKeyReleased
        // TODO add your handling code here:
        limpiar(tablaArticulos);
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        String comb = combo.getSelectedItem() + "";
        u.busquedaProductos2(modelo, txtBus.getText(), comb, " tipoFormato='GRAN FORMATO' ");
    }//GEN-LAST:event_txtBusKeyReleased

    private void txtMedidasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedidasKeyReleased
        // TODO add your handling code here:
        try {
            double importe = 0;
            double prec = Double.parseDouble(precio);
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double medidas = Double.parseDouble(txtMedidas.getText());

            if (txtMedidas.getText().equals("")) {
                //txtCantidad.setText("1");
            }
            else {
                importe = (medidas * prec) * cantidad;
                txtImporte.setText(df.format(importe) + "");
                calcularPrecioU();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtMedidasKeyReleased
    // double alto=0,ancho=0;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (existencias.equals("0") || existencias.equals("0.0")) {
            JOptionPane.showMessageDialog(this, "Producto con 0 existencias");
        }
        else {
            if (panel.equals("VENTA")) {
                ventas.agregarArticulo(txtCodigo.getText(), txtNombre.getText() + "(" + txtBase.getText() + "*" + txtAltura.getText() + ")=" + txtMedidas.getText(),
                        txtMedidas.getText(), txtCantidad.getText(), 
                        df.format((Double.parseDouble(txtPrecioUnitario.getText()))), df.format((Double.parseDouble(txtImporte.getText()))) );
                        //ventas.desglozarImpuestosVenta();
            }
            else {
                ventas.agregarArticuloCotizacion(txtCodigo.getText(), txtNombre.getText() + "(" + txtBase.getText() + "*" + txtAltura.getText() + ")=" + txtMedidas.getText(),
                        txtMedidas.getText(), txtCantidad.getText(), df.format((Double.parseDouble(txtPrecioUnitario.getText()))), df.format((Double.parseDouble(txtImporte.getText()))) );
                        //ventas.desglozarImpuestosCoti();
            }
        }

        if (Double.parseDouble(existencias) < 30) {
            JOptionPane.showMessageDialog(this, "¡Advertencia!\nArticulo por agotar.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    String existencias = "";
    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        codP = modelo.getValueAt(tablaArticulos.getSelectedRow(), 0) + "";  //id usuario
        txtCodigo.setText(modelo.getValueAt(tablaArticulos.getSelectedRow(), 0) + "");
        txtNombre.setText(modelo.getValueAt(tablaArticulos.getSelectedRow(), 2) + "");
        txtDesc.setText(modelo.getValueAt(tablaArticulos.getSelectedRow(), 3) + "");
        existencias = modelo.getValueAt(tablaArticulos.getSelectedRow(), 6) + "";

        if (radioPublicoG.isSelected()) {
            txtPrec.setText(modelo.getValueAt(tablaArticulos.getSelectedRow(), 4) + "");
            precio = modelo.getValueAt(tablaArticulos.getSelectedRow(), 4) + "";
        }
        else {
            txtPrec.setText(modelo.getValueAt(tablaArticulos.getSelectedRow(), 5) + "");
            precio = modelo.getValueAt(tablaArticulos.getSelectedRow(), 5) + "";
        }

        calcular();
        calcularPrecioU();
    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        // TODO add your handling code here:
        try {
            double importe = 0;
            double prec = Double.parseDouble(precio);
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double medidas = Double.parseDouble(txtMedidas.getText());

            if (txtMedidas.getText().equals("")) {
                //txtCantidad.setText("1");
            }
            else {
                importe = (medidas * prec) * cantidad;
                txtImporte.setText(df.format(importe) + "");
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    public void calcularPrecioU() {
        double pu = 0;
        double prec = Double.parseDouble(precio);
        double medidas = Double.parseDouble(txtMedidas.getText());

        pu = (medidas * prec);
        txtPrecioUnitario.setText(df.format(pu));
        System.out.println(pu);
    }

    public void calcularImporte() {
        try {
            double importe = 0;
            double prec = Double.parseDouble(precio);
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double medidas = Double.parseDouble(txtMedidas.getText());

            if (txtMedidas.getText().equals("")) {
                //txtCantidad.setText("1");
            }
            else {
                importe = (medidas * prec) * cantidad;
                txtImporte.setText(df.format(importe) + "");
            }
        }
        catch (Exception e) {
        }
    }

    private void txtBaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseKeyReleased
        // TODO add your handling code here:
        try {
            double resultado = Double.parseDouble(txtBase.getText()) * Double.parseDouble(txtAltura.getText());
            txtMedidas.setText(df.format(resultado));
            calcularImporte();
            calcularPrecioU();
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_txtBaseKeyReleased

    private void txtAlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyReleased
        // TODO add your handling code here:
        try {
            double resultado = Double.parseDouble(txtBase.getText()) * Double.parseDouble(txtAltura.getText());
            txtMedidas.setText(df.format(resultado));
            calcularImporte();
            calcularPrecioU();
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_txtAlturaKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ventanaGranFormato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaGranFormato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaGranFormato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaGranFormato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*   java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ventanaGranFormato().setVisible(true);
         }
         });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton radioMaquila;
    private javax.swing.JRadioButton radioPublicoG;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtMedidas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
