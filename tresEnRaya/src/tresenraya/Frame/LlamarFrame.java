/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya.Frame;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LlamarFrame {

    JFrame principal;
    JPanel PanelInicio;
    JLabel fondo;
    JPanel panelJuego;
    JTextField jugador1;
    JTextField jugador2;
    JButton comenzar;
    JLabel nameJugador1;
    JLabel nameJugador2;

    public LlamarFrame() {
        principal = new JFrame("JUEGO TRES EN RAYA");
        principal.setSize(550, 600);
        principal.setLocationRelativeTo(null);
        principal.setLayout(null);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setResizable(false);  //para q no se maximise a pantalla completa

        PanelInicio = new JPanel();
        PanelInicio.setSize(principal.getWidth(), principal.getHeight());
        PanelInicio.setLayout(null);
        PanelInicio.setVisible(true);
        PanelInicio.setBackground(Color.red);
        principal.add(PanelInicio);

        fondo = new JLabel();
        fondo.setIcon(new ImageIcon("imagenes/hola.jpg"));
        fondo.setSize(principal.getWidth(), principal.getHeight());
        fondo.setVisible(true);
        PanelInicio.add(fondo, 0);

        jugador1 = new JTextField("JUGADOR 1");
        jugador1.setBounds(175, 220, 200, 30);
        jugador1.setVisible(true);
        PanelInicio.add(jugador1, 0);

        jugador2 = new JTextField("JUGADOR 2");
        jugador2.setBounds(175, 254, 200, 30);
        jugador2.setVisible(true);
        PanelInicio.add(jugador2, 0);

        comenzar = new JButton("COMENZAR");
        comenzar.setBounds(225, 288, 100, 30);
        comenzar.setVisible(true);
        comenzar.setBackground(Color.white);
        PanelInicio.add(comenzar, 0);

        panelJuego = new JPanel();
        panelJuego.setSize(principal.getWidth(), principal.getHeight());
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        panelJuego.setBackground(Color.blue);
//        principal.add(panelJuego);

        nameJugador1 = new JLabel();
        nameJugador1.setSize(200, 30);
        nameJugador1.setLocation(0, 10);
        nameJugador1.setVisible(true);
        nameJugador1.setForeground(Color.BLUE);
        panelJuego.add(nameJugador1,0);

        comenzar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                System.out.println("presione el boton de comenzar");
                if (jugador1.getText().compareTo("JUGADOR 1") != 0 && jugador2.getText().compareTo("JUGADOR 2") != 0) {
                    PanelInicio.setVisible(false);
                    fondo.setIcon(new ImageIcon("imagenes/paisaje.jpg"));
                    panelJuego.add(fondo);
                    nameJugador1.setText(nameJugador1.getText());
                    principal.add(panelJuego);
                }
            }
        });

        principal.setVisible(true);

    }
}
