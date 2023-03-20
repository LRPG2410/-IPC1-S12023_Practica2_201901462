package Codigo;

import java.awt.Point;
import javax.swing.JLabel;

public class Pelota extends Thread {

    private JLabel lblPelota;

    public Pelota(JLabel lblPelota) {
        this.lblPelota = lblPelota;
    }

    public void run() {
        try {
            // Mover la pelota hacia arriba durante 3 segundos
            for (int i = 0; i < 30; i++) {
                Point location = lblPelota.getLocation(); 
                // Se crea el objeto Point que representa la ubicación actual del lblPelota en la pantalla. 
                // El objeto Point se utiliza para almacenar la ubicación actual de la pelota, 
                // que se actualiza en el bucle del hilo para simular su movimiento en pantalla.
                location.y -= 5;
                lblPelota.setLocation(location);
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
