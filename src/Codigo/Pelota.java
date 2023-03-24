package Codigo;

import java.awt.MediaTracker;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pelota extends Thread {

    private JLabel lblPelota;
    private JLabel lblInventario_Simulacion;
    private JLabel lblSalida_Simulacion;
    private int x = 120;
    private int y = 540;
    private JPanel panel;

    public Pelota(JLabel lblPelota, JLabel lblInventario_Simulacion, JLabel lblSalida_Simulacion, JPanel panel) {
        this.lblPelota = lblPelota;
        this.lblInventario_Simulacion = lblInventario_Simulacion;
        this.lblSalida_Simulacion = lblSalida_Simulacion;
        this.panel = panel;
    }

    public void aparecerPelota() {
        lblPelota = new JLabel();
        lblPelota.setBounds(x, y, 20, 20);
        ImageIcon icon = new ImageIcon("C:/Users/sistemas2/Documents/NetBeansProjects/Practica2/src/Imagenes/Feliz.png");
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            lblPelota.setIcon(icon);
            lblPelota.setOpaque(true);
            panel.add(lblPelota);
            panel.setComponentZOrder(lblPelota, 0);
        } else {
            System.out.println("Error al cargar la imagen");
        }
    }

    public void run() {
        aparecerPelota();
        try {
            for (int i = 0; i < (lblInventario_Simulacion.getY() - 9); i++) {
                /*Point location = lblPelota.getLocation(); 
                // Se crea el objeto Point que representa la ubicación actual del lblPelota en la pantalla. 
                // El objeto Point se utiliza para almacenar la ubicación actual de la pelota, 
                // que se actualiza en el bucle del hilo para simular su movimiento en pantalla.
                location.y -= 1;
                lblPelota.setLocation(location);*/

                lblPelota.setLocation(x, y);
                y -= 3;
                Thread.sleep(100);
            }

            // Mover la pelota hacia la derecha durante 5 segundos
            for (int i = 0; i < (lblSalida_Simulacion.getX() + lblSalida_Simulacion.getWidth()); i++) {
                Point location = lblPelota.getLocation();
                location.x += 3;
                lblPelota.setLocation(location);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // Manejar la interrupción del hilo
        }
    }
}
