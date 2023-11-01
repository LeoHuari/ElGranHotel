/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Vistas;

import elgranhotel.Data.HabitacionData;
import elgranhotel.Entidades.Habitacion;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo Huari
 */
public class Habitaciones extends javax.swing.JPanel {
    private DefaultTableModel modeloListaHabitacion = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private HabitacionData habitacionData1 = new HabitacionData();
    private ArrayList<Habitacion> listaHabitacion = habitacionData1.listarHabitaciones();
    private ArrayList<Integer> listaIdHabitaciones = new ArrayList();
    private Habitacion habitacion = null;
    /**
     * Creates new form Recepcion
     */
    public Habitaciones() {
        initComponents();
        armarTablaHabitaciones();
        cargarTablaHabitaciones();
        centrarTablas(jtListaHabitaciones);
        jbModificar1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanelHab1 = new javax.swing.JPanel();
        jcbFiltroHabitaciones = new javax.swing.JComboBox<>();
        jlBuscarHabitacion = new javax.swing.JLabel();
        jtBuscarHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaHabitaciones = new javax.swing.JTable();
        jbModificar1 = new javax.swing.JButton();
        jbMantenimiento = new javax.swing.JButton();
        jcbTipoHabitacion = new javax.swing.JComboBox<>();
        jlTipoHabitacion = new javax.swing.JLabel();
        jtTotalHabMostradas = new javax.swing.JTextField();
        jlTotalHabMostradas = new javax.swing.JLabel();
        jbLeyenda1 = new javax.swing.JButton();
        jPanelHab2 = new javax.swing.JPanel();
        jpProporciones = new javax.swing.JPanel();
        jlCuadrupleSimples4 = new javax.swing.JLabel();
        jlTripleSimpleQueen4 = new javax.swing.JLabel();
        jlDobleQueen4 = new javax.swing.JLabel();
        jtCuadrupleSimples4 = new javax.swing.JTextField();
        jlDobleSimples4 = new javax.swing.JLabel();
        jtTripleSimpleQueen4 = new javax.swing.JTextField();
        jlSimples4 = new javax.swing.JLabel();
        jtTripleSimples4 = new javax.swing.JTextField();
        jlTotalHabMostradas5 = new javax.swing.JLabel();
        jtDobleQueen4 = new javax.swing.JTextField();
        jtDobleSimples4 = new javax.swing.JTextField();
        jtSimples4 = new javax.swing.JTextField();
        jlSuitLujo4 = new javax.swing.JLabel();
        jlCuadrupleSimpleQueen4 = new javax.swing.JLabel();
        jtSuitLujo4 = new javax.swing.JTextField();
        jlTripleSimples4 = new javax.swing.JLabel();
        jtCuadrupleSimpleQueen4 = new javax.swing.JTextField();
        jpModificar = new javax.swing.JPanel();
        jlModificarHab = new javax.swing.JLabel();
        jlTipoHabitacion1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbFiltroHabitaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbFiltroHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número", "Disponibilidad", "Mantenimiento" }));

        jlBuscarHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlBuscarHabitacion.setText("Buscar habitacion por: ");

        jtBuscarHabitacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtBuscarHabitacion.setText("Buscar ...");
        jtBuscarHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtBuscarHabitacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtBuscarHabitacionFocusLost(evt);
            }
        });
        jtBuscarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarHabitacionActionPerformed(evt);
            }
        });
        jtBuscarHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarHabitacionKeyReleased(evt);
            }
        });

        jtListaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtListaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaHabitaciones);

        jbModificar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar1.setText("Modificar");
        jbModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificar1ActionPerformed(evt);
            }
        });

        jbMantenimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMantenimiento.setText("Mantenimiento");
        jbMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMantenimientoActionPerformed(evt);
            }
        });

        jcbTipoHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "S", "DS", "DQ", "TS", "TSQ", "CS", "C2SQ", "SL" }));
        jcbTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabitacionitacionActionPerformed(evt);
            }
        });

        jlTipoHabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTipoHabitacion.setText("Tipo Habitación:");

        jtTotalHabMostradas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlTotalHabMostradas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTotalHabMostradas.setText("Total de habitaciones mostradas:");

        jbLeyenda1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLeyenda1.setText("?");
        jbLeyenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeyenda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPanelHab1Layout = new javax.swing.GroupLayout(jpPanelHab1);
        jpPanelHab1.setLayout(jpPanelHab1Layout);
        jpPanelHab1Layout.setHorizontalGroup(
            jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelHab1Layout.createSequentialGroup()
                .addGroup(jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPanelHab1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jbModificar1)
                        .addGap(112, 112, 112)
                        .addComponent(jbMantenimiento)
                        .addGap(78, 78, 78)
                        .addComponent(jlTotalHabMostradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtTotalHabMostradas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpPanelHab1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPanelHab1Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addGroup(jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpPanelHab1Layout.createSequentialGroup()
                                    .addComponent(jlBuscarHabitacion)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbFiltroHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlTipoHabitacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbLeyenda1))
                                .addComponent(jtBuscarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jpPanelHab1Layout.setVerticalGroup(
            jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelHab1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarHabitacion)
                    .addComponent(jcbFiltroHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipoHabitacion)
                    .addComponent(jbLeyenda1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtBuscarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpPanelHab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar1)
                    .addComponent(jbMantenimiento)
                    .addComponent(jtTotalHabMostradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalHabMostradas))
                .addContainerGap())
        );

        add(jpPanelHab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 380));

        jPanelHab2.setLayout(new java.awt.CardLayout());

        jlCuadrupleSimples4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCuadrupleSimples4.setText("Cuadruple Simples:");

        jlTripleSimpleQueen4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTripleSimpleQueen4.setText("Triple, 1 Simple y 1 Queen:");

        jlDobleQueen4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDobleQueen4.setText("Doble Queen:");

        jtCuadrupleSimples4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlDobleSimples4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDobleSimples4.setText("Doble Simples:");

        jtTripleSimpleQueen4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlSimples4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlSimples4.setText("Simples:");

        jtTripleSimples4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlTotalHabMostradas5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTotalHabMostradas5.setText("Total de habitaciones mostradas por Tipo");

        jtDobleQueen4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtDobleSimples4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtSimples4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlSuitLujo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlSuitLujo4.setText("Suit Lujo:");

        jlCuadrupleSimpleQueen4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCuadrupleSimpleQueen4.setText("Cuadruple, 2 Simples y 1 Queen:");

        jtSuitLujo4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jlTripleSimples4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTripleSimples4.setText("Triple Simples:");

        jtCuadrupleSimpleQueen4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpProporcionesLayout = new javax.swing.GroupLayout(jpProporciones);
        jpProporciones.setLayout(jpProporcionesLayout);
        jpProporcionesLayout.setHorizontalGroup(
            jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProporcionesLayout.createSequentialGroup()
                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProporcionesLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jlDobleQueen4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtDobleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addComponent(jlTripleSimples4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtTripleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addComponent(jlDobleSimples4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtDobleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProporcionesLayout.createSequentialGroup()
                                .addComponent(jlSimples4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlTripleSimpleQueen4)
                                    .addComponent(jlCuadrupleSimples4))
                                .addGap(18, 18, 18)
                                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCuadrupleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTripleSimpleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addComponent(jlCuadrupleSimpleQueen4)
                                .addGap(18, 18, 18)
                                .addComponent(jtCuadrupleSimpleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProporcionesLayout.createSequentialGroup()
                                .addComponent(jlSuitLujo4)
                                .addGap(18, 18, 18)
                                .addComponent(jtSuitLujo4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpProporcionesLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jlTotalHabMostradas5)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jpProporcionesLayout.setVerticalGroup(
            jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProporcionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlTotalHabMostradas5)
                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProporcionesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTripleSimpleQueen4)
                            .addComponent(jtTripleSimpleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCuadrupleSimples4)
                            .addComponent(jtCuadrupleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCuadrupleSimpleQueen4)
                            .addComponent(jtCuadrupleSimpleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSuitLujo4)
                            .addComponent(jtSuitLujo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpProporcionesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSimples4)
                            .addComponent(jtSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProporcionesLayout.createSequentialGroup()
                                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlDobleQueen4)
                                    .addComponent(jtDobleQueen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProporcionesLayout.createSequentialGroup()
                                .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlDobleSimples4)
                                    .addComponent(jtDobleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)))
                        .addGroup(jpProporcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTripleSimples4)
                            .addComponent(jtTripleSimples4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanelHab2.add(jpProporciones, "card19");

        jlModificarHab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlModificarHab.setText("Modificar Tipos de Habitaciones");

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jlModificarHab)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jlModificarHab)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jPanelHab2.add(jpModificar, "card20");

        add(jPanelHab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 940, 380));

        jlTipoHabitacion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlTipoHabitacion1.setText("Tipo Habitación:");
        add(jlTipoHabitacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarHabitacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionFocusGained
        jtBuscarHabitacion.setText("");
    }//GEN-LAST:event_jtBuscarHabitacionFocusGained

    private void jtBuscarHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionFocusLost
        if (jtBuscarHabitacion.getText().isEmpty()) {
            jtBuscarHabitacion.setText("Buscar ...");
        }
    }//GEN-LAST:event_jtBuscarHabitacionFocusLost

    private void jtBuscarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarHabitacionActionPerformed

    private void jtBuscarHabitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarHabitacionKeyReleased
       borrarFilasHabitaciones();
       String variable = null;
       for (Habitacion habitacion : listaHabitacion) {
            switch (jcbFiltroHabitaciones.getSelectedIndex()) {
                case 0:
                    variable = habitacion.getIdHabitacion() + "";
                    break;
                case 1:
                    variable = habitacion.isDisponibilidad() + "";
                    break;
                case 2:
                    variable = habitacion.isEstado() + "";
            }

            if (variable.startsWith(jtBuscarHabitacion.getText().toLowerCase())) {
                modeloListaHabitacion.addRow(new Object[]{
                habitacion.getIdHabitacion(),
                habitacion.getPiso(),
                habitacion.getTipoHabitacionCodigo().getCodigo(),
                habitacion.isDisponibilidad(),
                habitacion.isEstado(),
                });
            } else if (jtBuscarHabitacion.getText().isEmpty()) {
                cargarTablaHabitaciones();
            }
        }
    }//GEN-LAST:event_jtBuscarHabitacionKeyReleased

    private void jtListaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaHabitacionesMouseClicked
        
        jbModificar1.setEnabled(true);
    }//GEN-LAST:event_jtListaHabitacionesMouseClicked

    private void jbMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMantenimientoActionPerformed
        // TODO add your handling code here:
        int i = jtListaHabitaciones.getSelectedRow();
        boolean estado = (boolean) jtListaHabitaciones.getValueAt(i, 5);
        if (estado) {
            habitacion = habitacionData1.buscarHabitacion((int) jtListaHabitaciones.getValueAt(i, 0));
            jtListaHabitaciones.setValueAt(false, i, 5);
            habitacion.setEstado(false);
            JOptionPane.showMessageDialog(null, "La habitación está en mantenimiento");
        }else{
            habitacion = habitacionData1.buscarHabitacion((int) jtListaHabitaciones.getValueAt(i, 0));
            jtListaHabitaciones.setValueAt(true, i, 5);
            habitacion.setEstado(true);
            JOptionPane.showMessageDialog(null, "La habitación ya no está en mantenimiento");
        }
    }//GEN-LAST:event_jbMantenimientoActionPerformed

    private void jcbTipoHabitacionitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabitacionitacionActionPerformed
        String codigo = jcbTipoHabitacion.getSelectedItem().toString();
        boolean existe = false;

        borrarFilasHabitaciones();

        if (codigo.equals("Todas")) {
            for (Habitacion habitacion : listaHabitacion) {
                if (listaIdHabitaciones.contains(habitacion.getIdHabitacion())) {
                    existe = true;
                } else {
                    existe = false;
                }
                modeloListaHabitacion.addRow(new Object[]{
                    habitacion.getIdHabitacion(),
                    habitacion.getPiso(),
                    habitacion.getTipoHabitacionCodigo().getCodigo(),
                    habitacion.isDisponibilidad(),
                    habitacion.isEstado(),
                    existe
                });
            }
        }

        for (Habitacion habitacion : listaHabitacion) {
            if (habitacion.getTipoHabitacionCodigo().getCodigo().equals(codigo)) {
                if (listaIdHabitaciones.contains(habitacion.getIdHabitacion())) {
                    existe = true;
                } else {
                    existe = false;
                }
                modeloListaHabitacion.addRow(new Object[]{
                    habitacion.getIdHabitacion(),
                    habitacion.getPiso(),
                    habitacion.getTipoHabitacionCodigo().getCodigo(),
                    habitacion.isDisponibilidad(),
                    habitacion.isEstado(),
                    existe
                });
            }

        }
    }//GEN-LAST:event_jcbTipoHabitacionitacionActionPerformed

    private void jbModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificar1ActionPerformed
        // TODO add your handling code here:
        if(jpProporciones.isVisible()){
            jpProporciones.setVisible(false);
            jpModificar.setVisible(true);
        }else{
            jpProporciones.setVisible(true);
            jpModificar.setVisible(false);
        }
    }//GEN-LAST:event_jbModificar1ActionPerformed

    private void jbLeyenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeyenda1ActionPerformed
        String mensaje = "S = Simple\n"
        + "DS = Doble Simples\n"
        + "DQ = Doble Queen\n"
        + "TS = Triple Simples\n"
        + "TSQ = Triple, 1 Simple y 1 Queen\n"
        + "CS = Cuadruple Simples\n"
        + "C2SQ = Cuadruple, 2 Simples y 1 Queen \n"
        + "SL = Suit Lujo";
        JOptionPane.showMessageDialog(null, mensaje, "Tipos de habitacion codigo", 1);
    }//GEN-LAST:event_jbLeyenda1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelHab2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLeyenda1;
    private javax.swing.JButton jbMantenimiento;
    private javax.swing.JButton jbModificar1;
    private javax.swing.JComboBox<String> jcbFiltroHabitaciones;
    private javax.swing.JComboBox<String> jcbTipoHabitacion;
    private javax.swing.JLabel jlBuscarHabitacion;
    private javax.swing.JLabel jlCuadrupleSimpleQueen;
    private javax.swing.JLabel jlCuadrupleSimpleQueen2;
    private javax.swing.JLabel jlCuadrupleSimpleQueen4;
    private javax.swing.JLabel jlCuadrupleSimples;
    private javax.swing.JLabel jlCuadrupleSimples2;
    private javax.swing.JLabel jlCuadrupleSimples4;
    private javax.swing.JLabel jlDobleQueen;
    private javax.swing.JLabel jlDobleQueen2;
    private javax.swing.JLabel jlDobleQueen4;
    private javax.swing.JLabel jlDobleSimples;
    private javax.swing.JLabel jlDobleSimples2;
    private javax.swing.JLabel jlDobleSimples4;
    private javax.swing.JLabel jlModificarHab;
    private javax.swing.JLabel jlSimples;
    private javax.swing.JLabel jlSimples2;
    private javax.swing.JLabel jlSimples4;
    private javax.swing.JLabel jlSuitLujo;
    private javax.swing.JLabel jlSuitLujo2;
    private javax.swing.JLabel jlSuitLujo4;
    private javax.swing.JLabel jlTipoHabitacion;
    private javax.swing.JLabel jlTipoHabitacion1;
    private javax.swing.JLabel jlTotalHabMostradas;
    private javax.swing.JLabel jlTotalHabMostradas1;
    private javax.swing.JLabel jlTotalHabMostradas3;
    private javax.swing.JLabel jlTotalHabMostradas5;
    private javax.swing.JLabel jlTripleSimpleQueen;
    private javax.swing.JLabel jlTripleSimpleQueen2;
    private javax.swing.JLabel jlTripleSimpleQueen4;
    private javax.swing.JLabel jlTripleSimples;
    private javax.swing.JLabel jlTripleSimples2;
    private javax.swing.JLabel jlTripleSimples4;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JPanel jpPanelHab1;
    private javax.swing.JPanel jpPanelHab2;
    private javax.swing.JPanel jpPanelHab4;
    private javax.swing.JPanel jpProporciones;
    private javax.swing.JTextField jtBuscarHabitacion;
    private javax.swing.JTextField jtCuadrupleSimpleQueen;
    private javax.swing.JTextField jtCuadrupleSimpleQueen2;
    private javax.swing.JTextField jtCuadrupleSimpleQueen4;
    private javax.swing.JTextField jtCuadrupleSimples;
    private javax.swing.JTextField jtCuadrupleSimples2;
    private javax.swing.JTextField jtCuadrupleSimples4;
    private javax.swing.JTextField jtDobleQueen;
    private javax.swing.JTextField jtDobleQueen2;
    private javax.swing.JTextField jtDobleQueen4;
    private javax.swing.JTextField jtDobleSimples;
    private javax.swing.JTextField jtDobleSimples2;
    private javax.swing.JTextField jtDobleSimples4;
    private javax.swing.JTable jtListaHabitaciones;
    private javax.swing.JTextField jtSimples;
    private javax.swing.JTextField jtSimples2;
    private javax.swing.JTextField jtSimples4;
    private javax.swing.JTextField jtSuitLujo;
    private javax.swing.JTextField jtSuitLujo2;
    private javax.swing.JTextField jtSuitLujo4;
    private javax.swing.JTextField jtTotalHabMostradas;
    private javax.swing.JTextField jtTripleSimpleQueen;
    private javax.swing.JTextField jtTripleSimpleQueen2;
    private javax.swing.JTextField jtTripleSimpleQueen4;
    private javax.swing.JTextField jtTripleSimples;
    private javax.swing.JTextField jtTripleSimples2;
    private javax.swing.JTextField jtTripleSimples4;
    // End of variables declaration//GEN-END:variables
    private void armarTablaHabitaciones(){
        modeloListaHabitacion.addColumn("Número");
        modeloListaHabitacion.addColumn("Piso");
        modeloListaHabitacion.addColumn("Código");
        modeloListaHabitacion.addColumn("Disponibilidad");
        modeloListaHabitacion.addColumn("Estado");
        modeloListaHabitacion.addColumn("");
        jtListaHabitaciones.setModel(modeloListaHabitacion);
    }
    
    private void cargarTablaHabitaciones(){
        for (Habitacion habitacion : listaHabitacion) {
            modeloListaHabitacion.addRow(new Object[]{
                habitacion.getIdHabitacion(),
                habitacion.getPiso(),
                habitacion.getTipoHabitacionCodigo().getCodigo(),
                habitacion.isDisponibilidad(),
                habitacion.isEstado(),
                false
            });
        }
    }
    
    private void borrarFilasHabitaciones(){
        int f = jtListaHabitaciones.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloListaHabitacion.removeRow(f);
        }
    }
    
    private void centrarTablas(JTable table){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
