package Codigo;

import javax.swing.JLabel;

public class Tiempo extends Thread {

    private JLabel lblTiempo;
    int min = 00, seg = 00;

    public Tiempo(JLabel lblTiempo) { // Constructor de la clase Tiempo
        this.lblTiempo = lblTiempo;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
                break;
            }

            seg++;
            if (seg >= 60) {
                seg = 0;
                min++;
            }
            lblTiempo.setText(String.format("%02d:%02d", min, seg));
        }
    }
}
