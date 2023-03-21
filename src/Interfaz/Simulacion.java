package Interfaz;

import Codigo.*;

public class Simulacion extends javax.swing.JFrame {

    Menu menu = new Menu();
    private Tiempo hiloTiempo;
    private Pelota hiloPelota;

    public Simulacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTiempo = new javax.swing.JPanel();
        btnRegresarMenu_Simulacion = new javax.swing.JButton();
        btnReporte_Simulacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        panelSimulacion = new javax.swing.JPanel();
        lblPelota = new javax.swing.JLabel();
        lblEmpaquetado_Simulacion = new javax.swing.JLabel();
        lblInventario_Simulacion = new javax.swing.JLabel();
        lblSalida_Simulacion = new javax.swing.JLabel();
        lblProduccion_Simulacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresarMenu_Simulacion.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresarMenu_Simulacion.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnRegresarMenu_Simulacion.setText("REGRESAR");
        btnRegresarMenu_Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu_SimulacionActionPerformed(evt);
            }
        });
        panelTiempo.add(btnRegresarMenu_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 140, 40));

        btnReporte_Simulacion.setBackground(new java.awt.Color(51, 51, 255));
        btnReporte_Simulacion.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btnReporte_Simulacion.setText("REPORTE");
        panelTiempo.add(btnReporte_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 140, 40));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Tiempo transcurrido:");
        panelTiempo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        lblTiempo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblTiempo.setText("00:00");
        panelTiempo.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        panelSimulacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPelota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contento (2).png"))); // NOI18N
        lblPelota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 3));
        panelSimulacion.add(lblPelota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        lblEmpaquetado_Simulacion.setBackground(new java.awt.Color(0, 102, 255));
        lblEmpaquetado_Simulacion.setForeground(new java.awt.Color(0, 51, 51));
        lblEmpaquetado_Simulacion.setOpaque(true);
        panelSimulacion.add(lblEmpaquetado_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 220, 360));

        lblInventario_Simulacion.setBackground(new java.awt.Color(204, 0, 0));
        lblInventario_Simulacion.setOpaque(true);
        panelSimulacion.add(lblInventario_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 360));

        lblSalida_Simulacion.setBackground(new java.awt.Color(0, 153, 51));
        lblSalida_Simulacion.setOpaque(true);
        panelSimulacion.add(lblSalida_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 220, 360));

        lblProduccion_Simulacion.setBackground(new java.awt.Color(153, 0, 153));
        lblProduccion_Simulacion.setOpaque(true);
        panelSimulacion.add(lblProduccion_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 360));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N
        panelSimulacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N
        panelSimulacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N
        panelSimulacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sube.gif"))); // NOI18N
        panelSimulacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baja.gif"))); // NOI18N
        panelSimulacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
            .addComponent(panelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenu_SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu_SimulacionActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenu_SimulacionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hiloTiempo = new Tiempo(lblTiempo); // Crea un nuevo objeto Tiempo
        hiloPelota = new Pelota(lblPelota);
        hiloTiempo.start();
        hiloPelota.start();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu_Simulacion;
    private javax.swing.JButton btnReporte_Simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEmpaquetado_Simulacion;
    private javax.swing.JLabel lblInventario_Simulacion;
    private javax.swing.JLabel lblPelota;
    private javax.swing.JLabel lblProduccion_Simulacion;
    private javax.swing.JLabel lblSalida_Simulacion;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel panelSimulacion;
    private javax.swing.JPanel panelTiempo;
    // End of variables declaration//GEN-END:variables
}
