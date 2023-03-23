package Codigo;

import java.awt.Color;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pelota extends Thread {

    private JLabel lblPelota;
    private JLabel lblInventario_Simulacion;
    private int x = 120;
    private int y = 540;
    private JPanel panel;

    public Pelota(JLabel lblPelota, JLabel lblInventario_Simulacion, JPanel panel) {
        this.lblPelota = lblPelota;
        this.lblInventario_Simulacion = lblInventario_Simulacion;
        this.panel = panel;
    }

    public void aparecerPelota() {
        lblPelota = new JLabel();
        lblPelota.setBounds(x, y, 20, 20);
        lblPelota.setIcon(new Icon(src/Imagenes/contento(2).png));
        lblPelota.setOpaque(true);
        panel.add(lblPelota);
        panel.setComponentZOrder(lblPelota, 0);
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
            for (int i = 0; i < 50; i++) {
                Point location = lblPelota.getLocation();
                location.x += 5;
                lblPelota.setLocation(location);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // Manejar la interrupción del hilo
        }
    }
}
