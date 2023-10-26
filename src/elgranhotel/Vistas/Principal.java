/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Vistas;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author Leo Huari
 */
public class Principal extends javax.swing.JFrame {
    PanelPrueba panel1 = new PanelPrueba();
    Recepcion recepcion = new Recepcion();
    CrearReservas crearReserva = new CrearReservas();
    AdministrarReservas adReservas = new AdministrarReservas();
    Habitaciones rooms = new Habitaciones();
    Huespedes guest = new Huespedes();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jtpVentanas.addTab("Panel 1", panel1);
        jtpVentanas.addTab("Recepcion", recepcion);
        jtpVentanas.addTab("Reservas", crearReserva);
        jtpVentanas.addTab("AdReserva", adReservas);
        jtpVentanas.addTab("Rooms", rooms);
        jtpVentanas.addTab("Guest", guest);
        jtpVentanas.setTabPlacement(JTabbedPane.LEFT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrimero = new javax.swing.JPanel();
        jpBotonera = new javax.swing.JPanel();
        jtpVentanas = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 1024));

        jpPrimero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBotonera.setBackground(new java.awt.Color(51, 0, 204));

        javax.swing.GroupLayout jpBotoneraLayout = new javax.swing.GroupLayout(jpBotonera);
        jpBotonera.setLayout(jpBotoneraLayout);
        jpBotoneraLayout.setHorizontalGroup(
            jpBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jpBotoneraLayout.setVerticalGroup(
            jpBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
        );

        jpPrimero.add(jpBotonera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 1028));
        jpPrimero.add(jtpVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 1028));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatMonokaiProIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpBotonera;
    private javax.swing.JPanel jpPrimero;
    private javax.swing.JTabbedPane jtpVentanas;
    // End of variables declaration//GEN-END:variables
}
