/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class JFMenuPrincipal extends javax.swing.JFrame {

    
    public JFMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        btnJpVenta = new javax.swing.JButton();
        btnJpConfiguracion = new javax.swing.JButton();
        btnJpCompra = new javax.swing.JButton();
        btnJpReportes = new javax.swing.JButton();
        btnJpMantenimiento = new javax.swing.JButton();
        jpCarrusel = new javax.swing.JPanel();
        jpVenta = new javax.swing.JPanel();
        jpCompra = new javax.swing.JPanel();
        jpReportes = new javax.swing.JPanel();
        jpMantenimiento = new javax.swing.JPanel();
        jpClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCantClientes = new javax.swing.JLabel();
        btnEntrarClientes = new javax.swing.JButton();
        jpProductos = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblCantProductos = new javax.swing.JLabel();
        btnEntrarProductos = new javax.swing.JButton();
        jpUsuarios = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblCantUsuarios = new javax.swing.JLabel();
        btnEntrarUsuario = new javax.swing.JButton();
        jpProveedores = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCantProveedores = new javax.swing.JLabel();
        btnEntrarProveedor = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jpConfiguracion = new javax.swing.JPanel();
        jpTitulo = new javax.swing.JPanel();
        lblNombNegocio = new javax.swing.JLabel();
        lblIcoUser = new javax.swing.JLabel();
        lblNombUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnSistema = new javax.swing.JMenu();
        mnItemCerrarSesion = new javax.swing.JMenuItem();
        mnItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 680));
        setPreferredSize(new java.awt.Dimension(1300, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(51, 51, 51));
        jpMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJpVenta.setBackground(new java.awt.Color(204, 204, 204));
        btnJpVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJpVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/venta32x32.png"))); // NOI18N
        btnJpVenta.setText("REALIZAR VENTA");
        btnJpVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJpVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpVenta.setHideActionText(true);
        btnJpVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJpVenta.setMargin(new java.awt.Insets(20, 10, 10, 10));
        btnJpVenta.setPreferredSize(new java.awt.Dimension(150, 80));
        btnJpVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJpVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJpVentaActionPerformed(evt);
            }
        });
        jpMenu.add(btnJpVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 150, 70));

        btnJpConfiguracion.setBackground(new java.awt.Color(204, 204, 204));
        btnJpConfiguracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJpConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/configuracion32x32.png"))); // NOI18N
        btnJpConfiguracion.setText("CONFIGURACIÓN");
        btnJpConfiguracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJpConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpConfiguracion.setEnabled(false);
        btnJpConfiguracion.setHideActionText(true);
        btnJpConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJpConfiguracion.setMargin(new java.awt.Insets(20, 10, 10, 10));
        btnJpConfiguracion.setPreferredSize(new java.awt.Dimension(150, 80));
        btnJpConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpMenu.add(btnJpConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 330, 150, 70));

        btnJpCompra.setBackground(new java.awt.Color(204, 204, 204));
        btnJpCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJpCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compra32x32.png"))); // NOI18N
        btnJpCompra.setText("GUARDAR COMPRAS");
        btnJpCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJpCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpCompra.setEnabled(false);
        btnJpCompra.setHideActionText(true);
        btnJpCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJpCompra.setMargin(new java.awt.Insets(20, 10, 10, 10));
        btnJpCompra.setPreferredSize(new java.awt.Dimension(150, 80));
        btnJpCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpMenu.add(btnJpCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 90, 150, 70));

        btnJpReportes.setBackground(new java.awt.Color(204, 204, 204));
        btnJpReportes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJpReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reporte32x32.png"))); // NOI18N
        btnJpReportes.setText("REPORTES");
        btnJpReportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJpReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpReportes.setHideActionText(true);
        btnJpReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJpReportes.setMargin(new java.awt.Insets(20, 10, 10, 10));
        btnJpReportes.setPreferredSize(new java.awt.Dimension(150, 80));
        btnJpReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJpReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJpReportesActionPerformed(evt);
            }
        });
        jpMenu.add(btnJpReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 170, 150, 70));

        btnJpMantenimiento.setBackground(new java.awt.Color(204, 204, 204));
        btnJpMantenimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnJpMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mantenimiento32x32.png"))); // NOI18N
        btnJpMantenimiento.setText("MANTENIMIENTO");
        btnJpMantenimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJpMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpMantenimiento.setHideActionText(true);
        btnJpMantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJpMantenimiento.setMargin(new java.awt.Insets(20, 10, 10, 10));
        btnJpMantenimiento.setPreferredSize(new java.awt.Dimension(150, 80));
        btnJpMantenimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnJpMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJpMantenimientoActionPerformed(evt);
            }
        });
        jpMenu.add(btnJpMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 250, 150, 70));

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 600));

        jpCarrusel.setLayout(new java.awt.CardLayout());
        jpCarrusel.add(jpVenta, "card2");
        jpCarrusel.add(jpCompra, "card3");
        jpCarrusel.add(jpReportes, "card4");

        jpMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        jpMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpClientes.setBackground(new java.awt.Color(0, 204, 153));
        jpClientes.setPreferredSize(new java.awt.Dimension(400, 150));
        jpClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente125x125.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabel1.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabel1.setPreferredSize(new java.awt.Dimension(130, 130));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLIENTES");
        jpClientes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 220, 30));

        lblCantClientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCantClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantClientes.setText("22");
        jpClientes.add(lblCantClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 80));

        btnEntrarClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrarClientes.setText("ENTRAR");
        btnEntrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarClientesActionPerformed(evt);
            }
        });
        jpClientes.add(btnEntrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 40));

        jpMantenimiento.add(jpClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jpProductos.setBackground(new java.awt.Color(255, 204, 0));
        jpProductos.setPreferredSize(new java.awt.Dimension(400, 150));
        jpProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos125x125.png"))); // NOI18N
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabel22.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabel22.setPreferredSize(new java.awt.Dimension(130, 130));
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpProductos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PRODUCTOS");
        jpProductos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 220, 30));

        lblCantProductos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCantProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProductos.setText("60");
        jpProductos.add(lblCantProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 80));

        btnEntrarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrarProductos.setText("ENTRAR");
        btnEntrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarProductosActionPerformed(evt);
            }
        });
        jpProductos.add(btnEntrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 40));

        jpMantenimiento.add(jpProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jpUsuarios.setBackground(new java.awt.Color(255, 255, 102));
        jpUsuarios.setPreferredSize(new java.awt.Dimension(400, 150));
        jpUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario125x125.png"))); // NOI18N
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabel25.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabel25.setPreferredSize(new java.awt.Dimension(130, 130));
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpUsuarios.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("USUARIOS");
        jpUsuarios.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 220, 30));

        lblCantUsuarios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCantUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantUsuarios.setText("2");
        jpUsuarios.add(lblCantUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 80));

        btnEntrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrarUsuario.setText("ENTRAR");
        btnEntrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarUsuarioActionPerformed(evt);
            }
        });
        jpUsuarios.add(btnEntrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 40));

        jpMantenimiento.add(jpUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jpProveedores.setBackground(new java.awt.Color(0, 204, 255));
        jpProveedores.setPreferredSize(new java.awt.Dimension(400, 150));
        jpProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor125x125.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabel5.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 130));
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jpProveedores.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PROVEEDORES");
        jpProveedores.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 220, 30));

        lblCantProveedores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCantProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantProveedores.setText("14");
        jpProveedores.add(lblCantProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 80));

        btnEntrarProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrarProveedor.setText("ENTRAR");
        btnEntrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarProveedorActionPerformed(evt);
            }
        });
        jpProveedores.add(btnEntrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 40));

        jpMantenimiento.add(jpProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MANTENIMIENTO");
        jpMantenimiento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 840, 30));

        jpCarrusel.add(jpMantenimiento, "card2");
        jpCarrusel.add(jpConfiguracion, "card6");

        getContentPane().add(jpCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 1140, 600));

        jpTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jpTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombNegocio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNombNegocio.setForeground(new java.awt.Color(255, 255, 255));
        lblNombNegocio.setText("BODEGA MADYSON");
        jpTitulo.add(lblNombNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 40));

        lblIcoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin32x32.png"))); // NOI18N
        jpTitulo.add(lblIcoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 40, 40));

        lblNombUser.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblNombUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNombUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombUser.setText("ADMINISTRADOR");
        lblNombUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jpTitulo.add(lblNombUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 40));

        getContentPane().add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 60));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 20));

        mnSistema.setBackground(new java.awt.Color(255, 255, 255));
        mnSistema.setText("SISTEMA");
        mnSistema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnSistema.setPreferredSize(new java.awt.Dimension(200, 21));

        mnItemCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        mnItemCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnItemCerrarSesion.setText("CERRAR SESIÓN");
        mnItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCerrarSesionActionPerformed(evt);
            }
        });
        mnSistema.add(mnItemCerrarSesion);

        mnItemSalir.setBackground(new java.awt.Color(255, 255, 255));
        mnItemSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnItemSalir.setText("SALIR");
        mnItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemSalirActionPerformed(evt);
            }
        });
        mnSistema.add(mnItemSalir);

        jMenuBar1.add(mnSistema);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemSalirActionPerformed

    }//GEN-LAST:event_mnItemSalirActionPerformed

    private void btnEntrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarClientesActionPerformed
        
    }//GEN-LAST:event_btnEntrarClientesActionPerformed

    private void btnEntrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarProductosActionPerformed

    }//GEN-LAST:event_btnEntrarProductosActionPerformed

    private void btnEntrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarUsuarioActionPerformed

    }//GEN-LAST:event_btnEntrarUsuarioActionPerformed

    private void btnEntrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarProveedorActionPerformed

    }//GEN-LAST:event_btnEntrarProveedorActionPerformed

    private void btnJpReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJpReportesActionPerformed

    }//GEN-LAST:event_btnJpReportesActionPerformed

    private void btnJpMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJpMantenimientoActionPerformed

    }//GEN-LAST:event_btnJpMantenimientoActionPerformed

    private void btnJpVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJpVentaActionPerformed

    }//GEN-LAST:event_btnJpVentaActionPerformed

    private void mnItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCerrarSesionActionPerformed
    
    }//GEN-LAST:event_mnItemCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarClientes;
    private javax.swing.JButton btnEntrarProductos;
    private javax.swing.JButton btnEntrarProveedor;
    private javax.swing.JButton btnEntrarUsuario;
    public static javax.swing.JButton btnJpCompra;
    public static javax.swing.JButton btnJpConfiguracion;
    public static javax.swing.JButton btnJpMantenimiento;
    public static javax.swing.JButton btnJpReportes;
    public static javax.swing.JButton btnJpVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jpCarrusel;
    private javax.swing.JPanel jpClientes;
    public javax.swing.JPanel jpCompra;
    public javax.swing.JPanel jpConfiguracion;
    public javax.swing.JPanel jpMantenimiento;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpProductos;
    private javax.swing.JPanel jpProveedores;
    public javax.swing.JPanel jpReportes;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPanel jpUsuarios;
    public javax.swing.JPanel jpVenta;
    private javax.swing.JLabel lblCantClientes;
    private javax.swing.JLabel lblCantProductos;
    private javax.swing.JLabel lblCantProveedores;
    private javax.swing.JLabel lblCantUsuarios;
    private javax.swing.JLabel lblIcoUser;
    private javax.swing.JLabel lblNombNegocio;
    private javax.swing.JLabel lblNombUser;
    public static javax.swing.JMenuItem mnItemCerrarSesion;
    public static javax.swing.JMenuItem mnItemSalir;
    private static javax.swing.JMenu mnSistema;
    // End of variables declaration//GEN-END:variables

        
    
    
}