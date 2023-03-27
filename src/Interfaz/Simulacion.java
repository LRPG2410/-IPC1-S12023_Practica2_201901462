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
        //System.out.println(lblPrueba.getY() + " " + lblPrueba.getX());
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
        lblBanda1 = new javax.swing.JLabel();
        lblBanda2 = new javax.swing.JLabel();
        lblBanda3 = new javax.swing.JLabel();
        lblFlechaInicio = new javax.swing.JLabel();
        lblFlechaFinal = new javax.swing.JLabel();
        lblPrueba = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        lblContadorInicio = new javax.swing.JLabel();
        lblContadorFinal = new javax.swing.JLabel();
        lblContadorProduccion = new javax.swing.JLabel();
        lblContadorEmpaquetado = new javax.swing.JLabel();
        lblTituloSalida = new javax.swing.JLabel();
        lblContadorInventario = new javax.swing.JLabel();
        lblTituloInventario1 = new javax.swing.JLabel();
        lblTituloProduccion1 = new javax.swing.JLabel();
        lblTituloEmpaquetado1 = new javax.swing.JLabel();
        lblContadorSalida = new javax.swing.JLabel();

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

        lblBanda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        lblBanda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        lblBanda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargando.gif"))); // NOI18N

        lblFlechaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sube.gif"))); // NOI18N
        lblFlechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaInicioMouseClicked(evt);
            }
        });

        lblFlechaFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baja.gif"))); // NOI18N

        lblPrueba.setText("jLabel7");

        lblInicio.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblInicio.setText("INICIO");

        lblFinal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblFinal.setText("FINAL");

        lblContadorInicio.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorInicio.setText("30");

        lblContadorFinal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorFinal.setText("0");

        lblContadorProduccion.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorProduccion.setForeground(new java.awt.Color(153, 0, 153));
        lblContadorProduccion.setText("0");

        lblContadorEmpaquetado.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorEmpaquetado.setForeground(new java.awt.Color(0, 102, 255));
        lblContadorEmpaquetado.setText("0");

        lblTituloSalida.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblTituloSalida.setForeground(new java.awt.Color(0, 153, 51));
        lblTituloSalida.setText("SALIDA");

        lblContadorInventario.setBackground(java.awt.Color.red);
        lblContadorInventario.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorInventario.setForeground(new java.awt.Color(204, 0, 0));
        lblContadorInventario.setText("0");

        lblTituloInventario1.setBackground(java.awt.Color.red);
        lblTituloInventario1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblTituloInventario1.setForeground(new java.awt.Color(204, 0, 0));
        lblTituloInventario1.setText("INVENTARIO");

        lblTituloProduccion1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblTituloProduccion1.setForeground(new java.awt.Color(153, 0, 153));
        lblTituloProduccion1.setText("PRODUCCIÓN");

        lblTituloEmpaquetado1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblTituloEmpaquetado1.setForeground(new java.awt.Color(0, 102, 255));
        lblTituloEmpaquetado1.setText("EMPAQUETADO");

        lblContadorSalida.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lblContadorSalida.setForeground(new java.awt.Color(0, 153, 51));
        lblContadorSalida.setText("0");

        javax.swing.GroupLayout panelSimulacionLayout = new javax.swing.GroupLayout(panelSimulacion);
        panelSimulacion.setLayout(panelSimulacionLayout);
        panelSimulacionLayout.setHorizontalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSimulacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPrueba)
                .addGap(116, 116, 116))
            .addGroup(panelSimulacionLayout.createSequentialGroup()
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(500, 500, 500)
                                        .addComponent(lblBanda2))
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(lblBanda1))
                                    .addComponent(lblInventario_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addComponent(lblProduccion_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblFlechaInicio)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblInicio))
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblContadorInicio)))))
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBanda3)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(lblSalida_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSimulacionLayout.createSequentialGroup()
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFinal)
                                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                                        .addComponent(lblContadorFinal)
                                        .addGap(28, 28, 28)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFlechaFinal)
                                .addGap(44, 44, 44))))
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(lblEmpaquetado_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblTituloInventario1)
                                .addGap(162, 162, 162)
                                .addComponent(lblTituloProduccion1)
                                .addGap(170, 170, 170)
                                .addComponent(lblTituloEmpaquetado1))
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblContadorInventario)
                                .addGap(280, 280, 280)
                                .addComponent(lblContadorProduccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblContadorEmpaquetado)
                                .addGap(65, 65, 65)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloSalida)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSimulacionLayout.createSequentialGroup()
                                .addComponent(lblContadorSalida)
                                .addGap(33, 33, 33)))
                        .addGap(75, 75, 75)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelSimulacionLayout.setVerticalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSimulacionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContadorInventario)
                    .addComponent(lblContadorProduccion)
                    .addComponent(lblContadorEmpaquetado)
                    .addComponent(lblContadorSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloSalida)
                    .addComponent(lblTituloProduccion1)
                    .addComponent(lblTituloInventario1)
                    .addComponent(lblTituloEmpaquetado1))
                .addGap(2, 2, 2)
                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addComponent(lblInventario_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFlechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSimulacionLayout.createSequentialGroup()
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduccion_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalida_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpaquetado_Simulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSimulacionLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBanda2)
                                    .addComponent(lblBanda1)
                                    .addComponent(lblBanda3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFlechaFinal)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSimulacionLayout.createSequentialGroup()
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInicio)
                                    .addComponent(lblFinal))
                                .addGap(18, 18, 18)
                                .addGroup(panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblContadorInicio)
                                    .addComponent(lblContadorFinal))
                                .addGap(20, 20, 20)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrueba)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        hiloPelota = new Pelota(lblPelota, lblInventario_Simulacion, lblSalida_Simulacion, panelSimulacion, lblPrueba, 
                                lblContadorInventario, lblContadorProduccion, lblContadorEmpaquetado, lblContadorSalida,
                                lblContadorInicio, lblContadorFinal, lblProduccion_Simulacion, lblEmpaquetado_Simulacion);
        hiloTiempo.start();
    }//GEN-LAST:event_formWindowOpened

    private void lblFlechaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaInicioMouseClicked
        hiloPelota.start();
    }//GEN-LAST:event_lblFlechaInicioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu_Simulacion;
    private javax.swing.JButton btnReporte_Simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBanda1;
    private javax.swing.JLabel lblBanda2;
    private javax.swing.JLabel lblBanda3;
    private javax.swing.JLabel lblContadorEmpaquetado;
    private javax.swing.JLabel lblContadorFinal;
    private javax.swing.JLabel lblContadorInicio;
    private javax.swing.JLabel lblContadorInventario;
    private javax.swing.JLabel lblContadorProduccion;
    private javax.swing.JLabel lblContadorSalida;
    private javax.swing.JLabel lblEmpaquetado_Simulacion;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblFlechaFinal;
    private javax.swing.JLabel lblFlechaInicio;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInventario_Simulacion;
    private javax.swing.JLabel lblProduccion_Simulacion;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel lblSalida_Simulacion;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTituloEmpaquetado1;
    private javax.swing.JLabel lblTituloInventario1;
    private javax.swing.JLabel lblTituloProduccion1;
    private javax.swing.JLabel lblTituloSalida;
    private javax.swing.JPanel panelSimulacion;
    private javax.swing.JPanel panelTiempo;
    // End of variables declaration//GEN-END:variables
}
