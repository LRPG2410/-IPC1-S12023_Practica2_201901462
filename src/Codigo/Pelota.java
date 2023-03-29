package Codigo;

import java.awt.Color;
import java.awt.MediaTracker;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Pelota extends Thread {

    private JLabel lblPelota;
    private JLabel lblInventario_Simulacion;
    private JLabel lblProduccion_Simulacion;
    private JLabel lblEmpaquetado_Simulacion;
    private JLabel lblSalida_Simulacion;
    private int x = 128;
    private int y = 540;
    private JPanel panel;
    private JLabel lblPrueba;
    private JLabel lblContadorInventario;
    private JLabel lblContadorProduccion;
    private JLabel lblContadorEmpaquetado;
    private JLabel lblContadorSalida;
    private JLabel lblContadorInicio;
    private JLabel lblContadorFinal;
    private int[][] monkey;
    private JButton btnRegresarMenu_Simulacion;
    private JButton btnReporte_Simulacion;

    public Pelota(JLabel lblPelota, JLabel lblInventario_Simulacion, JLabel lblSalida_Simulacion, JPanel panel, JLabel lblPrueba,
            JLabel lblContadorInventario, JLabel lblContadorProduccion, JLabel lblContadorEmpaquetado, JLabel lblContadorSalida,
            JLabel lblContadorInicio, JLabel lblContadorFinal, JLabel lblProduccion_Simulacion, JLabel lblEmpaquetado_Simulacion, int[][] monkey,
            JButton btnRegresarMenu_Simulacion, JButton btnReporte_Simulacion) {
        this.lblPelota = lblPelota;
        this.lblInventario_Simulacion = lblInventario_Simulacion;
        this.lblSalida_Simulacion = lblSalida_Simulacion;
        this.panel = panel;
        this.lblPrueba = lblPrueba;
        this.lblContadorInventario = lblContadorInventario;
        this.lblContadorProduccion = lblContadorProduccion;
        this.lblContadorEmpaquetado = lblContadorEmpaquetado;
        this.lblContadorSalida = lblContadorSalida;
        this.lblContadorInicio = lblContadorInicio;
        this.lblContadorFinal = lblContadorFinal;
        this.lblProduccion_Simulacion = lblProduccion_Simulacion;
        this.lblEmpaquetado_Simulacion = lblEmpaquetado_Simulacion;
        this.monkey = monkey;
        this.btnRegresarMenu_Simulacion = btnRegresarMenu_Simulacion;
        this.btnReporte_Simulacion = btnReporte_Simulacion;
    }

    public void aparecerPelota() {
        lblPelota = new JLabel();
        lblPelota.setBounds(x, y, 24, 24);
        // Direccipon computadora trabajo
        ImageIcon icon = new ImageIcon("C:/Users/sistemas2/Documents/NetBeansProjects/Practica2/src/Imagenes/Feliz.png");

        //Direccion computadora casa
        //ImageIcon icon = new ImageIcon("C:/Users/Luis Porras/Documents/NetBeansProjects/Practica2/src/Imagenes/Feliz.png");
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            lblPelota.setIcon(icon);
            lblPelota.setOpaque(false);
            panel.add(lblPelota);
            panel.setComponentZOrder(lblPelota, 0);
        } else {
            System.out.println("Error al cargar la imagen");
        }
    }

    private void actualizarContador(JLabel label, int valor) {
        int valorActual = Integer.parseInt(label.getText());
        valorActual += valor;
        label.setText(String.valueOf(valorActual));
    }

    public void iniciarPelota() {
        Thread hilo = new Thread(this);
        hilo.start();
    }

    public void run() {
        aparecerPelota();
        boolean aumentarInventario = false;
        boolean disminuirInventario = false;
        boolean aumentarProduccion = false;
        boolean disminuirProduccion = false;
        boolean aumentarEmpaquetado = false;
        boolean disminuirEmpaquetado = false;
        boolean aumentarSalida = false;
        boolean disminuirSalida = false;
        boolean disminuirInicio = false;
        boolean aumentarFinal = false;

        try {
            boolean moviendoArriba = true;
            boolean moviendoDerecha = false;
            boolean moviendoAbajo = false;

            int mitadSalida = lblSalida_Simulacion.getX() + (lblSalida_Simulacion.getWidth() / 2) - 15;
            int mitadInicio = lblInventario_Simulacion.getY() + (lblInventario_Simulacion.getHeight() / 2) - 10;
            Color colorInventario = lblInventario_Simulacion.getBackground();
            Color colorProduccion = lblProduccion_Simulacion.getBackground();
            Color colorEmpaquetado = lblEmpaquetado_Simulacion.getBackground();
            Color colorSalida = lblSalida_Simulacion.getBackground();
            Color colorPanel = panel.getBackground();

            while (true) {
                if (moviendoArriba) {
                    y -= 3;
                    if (y <= 540 && !disminuirInicio) {
                        actualizarContador(lblContadorInicio, -1);
                        disminuirInicio = true;
                    }
                    // CONDICIONAL PARA AUMENTAR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "y=459" de lblInventario_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  --.--   -----   -----   -----
                    if (y <= 455 && !aumentarInventario) {
                        actualizarContador(lblContadorInventario, 1);
                        aumentarInventario = true;
                        lblPelota.setBounds(x, y, 30, 30);
                        Border newBorder = BorderFactory.createLineBorder(colorEmpaquetado, 3);
                        lblPelota.setBorder(newBorder);
                        lblPelota.setOpaque(true);
                        lblPelota.setBackground(colorEmpaquetado);
                    }
                    if (x == 128 && y == 270) {
                        Thread.sleep(monkey[0][0] * 1000);
                    }
                    if (y < mitadInicio) {
                        moviendoArriba = false;
                        moviendoDerecha = true;
                    }
                } else if (moviendoDerecha) {
                    x += 7;
                    // CONDICIONAL PARA DISMINUIR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=235" de lblInventario_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   .   |   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 235 && x <= 315 && !disminuirInventario) {
                        actualizarContador(lblContadorInventario, -1);
                        disminuirInventario = true;
                        lblPelota.setBounds(x, y, 24, 24);
                        lblPelota.setBorder(null);
                        lblPelota.setOpaque(false);
                        lblPelota.setBackground(null);
                    }
                    // CONDICIONAL PARA AUMENTAR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=315" de lblProduccion_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   .   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 315 && x <= 535 && !aumentarProduccion) {
                        actualizarContador(lblContadorProduccion, 1);
                        aumentarProduccion = true;
                        lblPelota.setBounds(x, y, 30, 30);
                        Border newBorder = BorderFactory.createLineBorder(colorSalida, 3);
                        lblPelota.setBorder(newBorder);
                        lblPelota.setOpaque(true);
                        lblPelota.setBackground(colorSalida);
                    }
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (x == 429 && y == 267) {
                        Thread.sleep(monkey[1][0] * 1000);
                    }
                    // CONDICIONAL PARA DISMINUIR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=535" de lblProduccion_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   .   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 535 && x <= 615 && !disminuirProduccion) {
                        actualizarContador(lblContadorProduccion, -1);
                        disminuirProduccion = true;
                        lblPelota.setBounds(x, y, 24, 24);
                        lblPelota.setBorder(null);
                        lblPelota.setOpaque(false);
                        lblPelota.setBackground(null);
                    }
                    // CONDICIONAL PARA AUMENTAR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=615" de lblEmpaquetado_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   .   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 615 && x <= 835 && !aumentarEmpaquetado) {
                        actualizarContador(lblContadorEmpaquetado, 1);
                        aumentarEmpaquetado = true;
                        lblPelota.setBounds(x, y, 30, 30);
                        Border newBorder = BorderFactory.createLineBorder(colorInventario, 3);
                        lblPelota.setBorder(newBorder);
                        lblPelota.setOpaque(true);
                        lblPelota.setBackground(colorInventario);
                    }
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (x == 730 && y == 267) {
                        Thread.sleep(monkey[2][0] * 1000);
                    }
                    // CONDICIONAL PARA DISMINUIR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=835" de lblEmpaquetado_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   .   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 835 && x <= 915 && !disminuirEmpaquetado) {
                        actualizarContador(lblContadorEmpaquetado, -1);
                        disminuirEmpaquetado = true;
                        lblPelota.setBounds(x, y, 24, 24);
                        lblPelota.setBorder(null);
                        lblPelota.setOpaque(false);
                        lblPelota.setBackground(null);
                    }
                    // CONDICIONAL PARA AUMENTAR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "x=915" de lblSalida_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   |   .   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   -----
                    if (x >= 915 && !aumentarSalida) {
                        actualizarContador(lblContadorSalida, 1);
                        aumentarSalida = true;
                        lblPelota.setBounds(x, y, 30, 30);
                        Border newBorder = BorderFactory.createLineBorder(colorProduccion, 3);
                        lblPelota.setBorder(newBorder);
                        lblPelota.setOpaque(true);
                        lblPelota.setBackground(colorProduccion);
                    }
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    if (x == 1024 && y == 267) {
                        Thread.sleep(monkey[3][0] * 1000);
                    }
                    if (x >= mitadSalida) {
                        moviendoDerecha = false;
                        moviendoAbajo = true;
                    }
                } else if (moviendoAbajo) {
                    y += 3;
                    if (y == 564 && !aumentarFinal) {
                        actualizarContador(lblContadorFinal, 1);
                        aumentarFinal = true;
                        disminuirInicio = false;
                        int contadorFinal = Integer.parseInt(lblContadorFinal.getText());
                        if (contadorFinal == 30){
                            System.out.println(contadorFinal);
                            btnRegresarMenu_Simulacion.setEnabled(true);
                            btnReporte_Simulacion.setEnabled(true);
                            
                        }
                    }
                    // CONDICIONAL PARA DISMINUIR EL CONTADOR CUANDO LA PELOTA LLEGUE AL "y=459" de lblSalida_Simulacion

                    //  -----   -----   -----   -----
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  |   |   |   |   |   |   |   |
                    //  -----   -----   -----   --.--
                    if (y >= 455 && !disminuirSalida) {
                        actualizarContador(lblContadorSalida, -1);
                        disminuirSalida = true;
                        lblPelota.setBounds(x, y, 24, 24);
                        lblPelota.setBorder(null);
                        lblPelota.setOpaque(false);
                        lblPelota.setBackground(null);
                    }
                    if (y >= 564) {
                        panel.remove(lblPelota);
                        panel.repaint();
                        break;
                    }
                }

                lblPelota.setLocation(x, y);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }
    }
}


/*try {

            // Mover la pelota hacia arriba hasta llegar a la posición deseada
            for (int i = 0; i < (lblInventario_Simulacion.getY() - 10.5); i++) {
                lblPelota.setLocation(x, y); // Establecer la nueva posición de la pelota
                y -= 3; // Disminuir el valor de y para mover la pelota hacia arriba
                Thread.sleep(100); // Pausar el hilo por 100 milisegundos
            }

            // Calcular la posición x de la mitad del lblSalida_Simulacion
            double mitadSalida = lblSalida_Simulacion.getX() + (lblSalida_Simulacion.getWidth() / 2) - 15;

            // Mover la pelota hacia la derecha y luego hacia abajo cuando llega a la mitad del lblSalida_Simulacion
            boolean moviendoAbajo = false; // Variable para controlar si la pelota debe moverse hacia abajo

            if (y <= lblInventario_Simulacion.getY() + lblInventario_Simulacion.getHeight() && !incrementedInventario) {
                actualizarContador(lblContadorInventario, 1);
                incrementedInventario = true;
            }

            while (x < lblSalida_Simulacion.getX() + lblSalida_Simulacion.getWidth()) {
                // Si la posición x de la pelota es mayor o igual a la mitad de lblSalida_Simulacion y aún no se mueve hacia abajo
                if (!moviendoAbajo && x >= mitadSalida) {
                    moviendoAbajo = true; // Establecer moviendoAbajo en true para cambiar el movimiento hacia abajo
                }

                // Si moviendoAbajo es falso, mover la pelota hacia la derecha, de lo contrario, moverla hacia abajo
                if (!moviendoAbajo) {
                    x += 7; // Incrementar el valor de x para mover la pelota hacia la derecha
                } else {
                    y += 3; // Incrementar el valor de y para mover la pelota hacia abajo
                }

                lblPelota.setLocation(x, y); // Establecer la nueva posición de la pelota
                Thread.sleep(100); // Pausar el hilo por 100 milisegundos

                // Verificar si lblPelota ha llegado a la coordenada y = 564
                int posicionY = lblPelota.getY();
                //System.out.println(posicionY);
                if (posicionY == 564) {
                    // Detener el hilo y hacer desaparecer la lblPelota
                    panel.remove(lblPelota); // Eliminar lblPelota del panel
                    panel.repaint(); // Repintar el panel para actualizar la visualización
                    break; // Salir del bucle while
                }
            }
        } catch (InterruptedException e) {
            // Manejar la interrupción del hilo
        }*/
//////////////////////////////////////////////////////////////////////////// Codigo para obtener la posicion en la que esta la pelota
//int posicionX = lblPelota.getX();
//int posicionY = lblPelota.getY();
//System.out.println(posicionX + " " + posicionY);
                    ////////////////////////////////////////////////////////////////////////////

    /*private boolean llegoAInventario() {
        // Reemplaza los valores de las coordenadas y las dimensiones de lblInventario_Simulacion
        int inventarioX = 235;
        int inventarioY = 459;
        int inventarioWidth = 220;
        int inventarioHeight = lblInventario_Simulacion.getHeight();

        return x >= inventarioX && x <= inventarioX + inventarioWidth
                && y >= inventarioY && y <= inventarioY + inventarioHeight;
    }*/