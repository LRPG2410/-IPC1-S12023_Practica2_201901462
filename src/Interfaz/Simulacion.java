package Interfaz;

import Codigo.*;
import javax.swing.JLabel;

public class Simulacion extends javax.swing.JFrame {

    Menu menu = new Menu();
    private Tiempo hiloTiempo;
    private Pelota hiloPelota;
    private JLabel lblPelota;

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

        lblEmpaquetado_Simulacion.setBackground(new java.awt.Color(0, 102, 255));
        lblEmpaquetado_Simulacion.setForeground(new java.awt.Color(0, 51, 51));
        lblEmpaquetado_Simulacion.setOpaque(true);

        lblInventario_Simulacion.setBackground(new java.awt.Color(204, 0, 0));
        lblInventario_Simulacion.setOpaque(true);

        lblSalida_Simulacion.setBackground(new java.awt.Color(0, 153, 51));
        lblSalida_Simulacion.setOpaque(true);

        lblProduccion_Simulacion.setBackground(new java.awt.Color(153, 0, 153));
        lblProduccion_Simulacion.setOpaque(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sube.gif"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baja.gif"))); // NOI18N

        javax.swing.GroupLayout panelSimulacionLayout = new javax.swing.GroupLayout(panelSimulacion);
        panelSimulacion.setLayout(panelSimulacionLayout);
        panelSimulacionLayout.setHorizontalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSimulacionLayout.createSequentialGroup()
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(500, 500, 500)
                                        .addComponent(jLabel4))
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel3))
                                    .addComponent(lblInventario_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addComponent(lblProduccion_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2)))
                        .addGap(174, 174, 174)
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel6))
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(lblSalida_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(lblEmpaquetado_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelSimulacionLayout.setVerticalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSimulacionLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel4))
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel3))
                            .addComponent(lblProduccion_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel5)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel6))
                            .addComponent(lblSalida_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpaquetado_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addComponent(lblInventario_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
            .addComponent(panelSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        hiloPelota = new Pelota(lblPelota, lblInventario_Simulacion, panelSimulacion);
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
    private javax.swing.JLabel lblProduccion_Simulacion;
    private javax.swing.JLabel lblSalida_Simulacion;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel panelSimulacion;
    private javax.swing.JPanel panelTiempo;
    // End of variables declaration//GEN-END:variables
}
