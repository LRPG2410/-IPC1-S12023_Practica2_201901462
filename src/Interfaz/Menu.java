package Interfaz;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    int[][] monkey = new int[4][2];
    

    public boolean esEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtInventarioTiempo = new javax.swing.JTextField();
        txtInventarioCostos = new javax.swing.JTextField();
        txtProduccionTiempo = new javax.swing.JTextField();
        txtProduccionCostos = new javax.swing.JTextField();
        txtEmpaquetadoTiempo = new javax.swing.JTextField();
        txtEmpaquetadoCostos = new javax.swing.JTextField();
        txtSalidaTiempo = new javax.swing.JTextField();
        txtSalidaCostos = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Monkey");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("INVENTARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("PRODUCCIÓN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("EMPAQUETADO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("SALIDA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("TIEMPO (S)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("COSTOS (Q/s)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        txtInventarioTiempo.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtInventarioTiempo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtInventarioTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        txtInventarioCostos.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtInventarioCostos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtInventarioCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 120, -1));

        txtProduccionTiempo.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtProduccionTiempo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtProduccionTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 120, -1));

        txtProduccionCostos.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtProduccionCostos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtProduccionCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, -1));

        txtEmpaquetadoTiempo.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtEmpaquetadoTiempo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtEmpaquetadoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        txtEmpaquetadoCostos.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtEmpaquetadoCostos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtEmpaquetadoCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, -1));

        txtSalidaTiempo.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtSalidaTiempo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtSalidaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, -1));

        txtSalidaCostos.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        txtSalidaCostos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel1.add(txtSalidaCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, -1));

        btnIniciar.setBackground(new java.awt.Color(255, 153, 0));
        btnIniciar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnIniciar.setText("Iniciar simulación");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        if (esEntero(txtInventarioTiempo.getText()) == false || esEntero(txtInventarioCostos.getText()) == false
                || esEntero(txtProduccionTiempo.getText()) == false || esEntero(txtProduccionCostos.getText()) == false
                || esEntero(txtEmpaquetadoTiempo.getText()) == false || esEntero(txtEmpaquetadoCostos.getText()) == false
                || esEntero(txtSalidaTiempo.getText()) == false || esEntero(txtSalidaCostos.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Hay valores que no son enteros o campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            monkey[0][0] = Integer.parseInt(txtInventarioTiempo.getText());
            monkey[0][1] = Integer.parseInt(txtInventarioCostos.getText());
            monkey[1][0] = Integer.parseInt(txtProduccionTiempo.getText());
            monkey[1][1] = Integer.parseInt(txtProduccionCostos.getText());
            monkey[2][0] = Integer.parseInt(txtEmpaquetadoTiempo.getText());
            monkey[2][1] = Integer.parseInt(txtEmpaquetadoCostos.getText());
            monkey[3][0] = Integer.parseInt(txtSalidaTiempo.getText());
            monkey[3][1] = Integer.parseInt(txtSalidaCostos.getText());
            JOptionPane.showMessageDialog(null, "Valores guardados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Simulacion simulacion = new Simulacion(monkey);
            simulacion.setVisible(true);
        }
        

        /*else if (Integer.parseInt(txtInventarioTiempo.getText()) == 0 || Integer.parseInt(txtInventarioCostos.getText()) == 0
                || Integer.parseInt(txtProduccionTiempo.getText()) == 0 || Integer.parseInt(txtProduccionCostos.getText()) == 0
                || Integer.parseInt(txtEmpaquetadoTiempo.getText()) == 0 || Integer.parseInt(txtEmpaquetadoCostos.getText()) == 0
                || Integer.parseInt(txtSalidaTiempo.getText()) == 0 || Integer.parseInt(txtSalidaCostos.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Hay valores vacios. Porfavor rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnIniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmpaquetadoCostos;
    private javax.swing.JTextField txtEmpaquetadoTiempo;
    private javax.swing.JTextField txtInventarioCostos;
    private javax.swing.JTextField txtInventarioTiempo;
    private javax.swing.JTextField txtProduccionCostos;
    private javax.swing.JTextField txtProduccionTiempo;
    private javax.swing.JTextField txtSalidaCostos;
    private javax.swing.JTextField txtSalidaTiempo;
    // End of variables declaration//GEN-END:variables
}
