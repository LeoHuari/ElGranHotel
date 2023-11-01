/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Vistas;

import elgranhotel.Data.HabitacionData;
import elgranhotel.Data.HuespedData;
import elgranhotel.Data.ReservaData;
import elgranhotel.Entidades.Habitacion;
import elgranhotel.Entidades.Huesped;
import elgranhotel.Entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo Huari
 */
public class CrearReservas extends javax.swing.JPanel {

    Class tipo[] = new Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class};
    protected static DefaultTableModel modeloHuesped = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloHabitacion = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }

        public Class getColumnClass(int i) {
            return tipo[i];
        }
    };
    private HuespedData huespedData = new HuespedData();
    private HabitacionData habitacionData = new HabitacionData();
    private ReservaData reservaData = new ReservaData();
    private ArrayList<Huesped> listaHuespedes = huespedData.ListarHuesped();
    private ArrayList<Habitacion> listaHabitaciones = new ArrayList();
    private ArrayList<Reserva> listaReservas = new ArrayList();
    private ArrayList<Integer> listaIdHabitacion = new ArrayList();
    private HashMap<Integer, Integer> mapaHabitaciones = new HashMap();
    protected static Huesped huesped = null;
    private LocalDate fechaIngreso = null;
    private LocalDate fechaSalida = null;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer cantPersRestantes = null;
    private Integer cantPersIn = null;

    /**
     * Creates new form CrearReservas
     */
    public CrearReservas() {
        initComponents();
        armarTablaHuesped();
        cargarTablaHuespedes();
        armarTablaHabitacion();
        centrarTablas(jtHabitaciones);
        centrarTablas(jtHuespedes);
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.okButtonText", "Aceptar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jpContenedor1 = new javax.swing.JPanel();
        jcbFiltroHuesped = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtfBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHuespedes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jpContenedor2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaIn = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaOut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtfCantPers = new javax.swing.JTextField();
        jbMostrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jtfCantPersRestantes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jbCompletarReserva = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbLeyenda = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setText("jButton3");

        setPreferredSize(new java.awt.Dimension(980, 1024));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbFiltroHuesped.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbFiltroHuesped.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "DNI", "Nombre" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Buscar huesped por: ");

        jtfBuscador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfBuscador.setText("Buscar ...");
        jtfBuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfBuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfBuscadorFocusLost(evt);
            }
        });
        jtfBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscadorActionPerformed(evt);
            }
        });
        jtfBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscadorKeyReleased(evt);
            }
        });

        jtHuespedes.setModel(new javax.swing.table.DefaultTableModel(
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
        jtHuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHuespedesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtHuespedes);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("jButton1");

        javax.swing.GroupLayout jpContenedor1Layout = new javax.swing.GroupLayout(jpContenedor1);
        jpContenedor1.setLayout(jpContenedor1Layout);
        jpContenedor1Layout.setHorizontalGroup(
            jpContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor1Layout.createSequentialGroup()
                .addGroup(jpContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContenedor1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbFiltroHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContenedor1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jtfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContenedor1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jpContenedor1Layout.setVerticalGroup(
            jpContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbFiltroHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        add(jpContenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 380));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fecha de Ingreso: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de Salida: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de personas: ");

        jtfCantPers.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jbMostrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMostrar.setText("Mostrar habitaciones");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContenedor2Layout = new javax.swing.GroupLayout(jpContenedor2);
        jpContenedor2.setLayout(jpContenedor2Layout);
        jpContenedor2Layout.setHorizontalGroup(
            jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContenedor2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContenedor2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContenedor2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbMostrar))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jpContenedor2Layout.setVerticalGroup(
            jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedor2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jdcFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jpContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbMostrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jpContenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 910, 130));

        jcbTipoHab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbTipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "S", "DS", "DQ", "TS", "TSQ", "CS", "C2SQ", "SL" }));
        jcbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabActionPerformed(evt);
            }
        });

        jtfCantPersRestantes.setEditable(false);
        jtfCantPersRestantes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfCantPersRestantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantPersRestantesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad de peronas restantes:");

        jtHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jtHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtHabitaciones);

        jbCompletarReserva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCompletarReserva.setText("Completar Reserva");
        jbCompletarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompletarReservaActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Habitación");

        jbLeyenda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLeyenda.setText("?");
        jbLeyenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeyendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLeyenda)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCantPersRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jbCancelar)
                        .addGap(104, 104, 104)
                        .addComponent(jbCompletarReserva))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCantPersRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jbLeyenda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCompletarReserva)
                    .addComponent(jbCancelar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 890, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscadorActionPerformed

    private void jtfCantPersRestantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantPersRestantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantPersRestantesActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        if(huesped == null || listaReservas.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay cambios que cancelar");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la/s reserva/s?", TOOL_TIP_TEXT_KEY, JOptionPane.OK_CANCEL_OPTION);
        if (confirmar != 0) {
            return;
        }
        limpiarPanelReservas();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscadorKeyReleased
        borrarFilasHuespedes();
        String variable = null;

        for (Huesped huesped : listaHuespedes) {
            switch (jcbFiltroHuesped.getSelectedIndex()) {
                case 0:
                    variable = huesped.getIdHuesped() + "";
                    break;
                case 1:
                    variable = huesped.getDni() + "";
                    break;
                case 2:
                    variable = huesped.getNombre().toLowerCase();
                    break;
            }

            if (variable.startsWith(jtfBuscador.getText().toLowerCase())) {
                modeloHuesped.addRow(new Object[]{
                    huesped.getIdHuesped(),
                    huesped.getNombre(),
                    huesped.getDni(),
                    huesped.getCorreo(),
                    huesped.getCelular(),
                    huesped.getDomicilio(),
                    huesped.isEstado()
                });
            } else if (jtfBuscador.getText().isEmpty()) {
                cargarTablaHuespedes();
            }
        }
    }//GEN-LAST:event_jtfBuscadorKeyReleased

    private void jtfBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfBuscadorFocusGained
        jtfBuscador.setText("");
    }//GEN-LAST:event_jtfBuscadorFocusGained

    private void jtfBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfBuscadorFocusLost
        if (jtfBuscador.getText().isEmpty()) {
            jtfBuscador.setText("Buscar ...");
        }
    }//GEN-LAST:event_jtfBuscadorFocusLost

    private void jtHuespedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHuespedesMouseClicked
        int i = jtHuespedes.getSelectedRow();
        boolean estado = (boolean) jtHuespedes.getValueAt(i, 6);
        if (estado) {
            huesped = huespedData.BuscarHuespedPorId((int) jtHuespedes.getValueAt(i, 0));
            JOptionPane.showMessageDialog(null, "Huesped seleccionado: " + huesped.getNombre());
            jbCompletarReserva.setEnabled(estado);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente esta vetado de por vida");
            jbCompletarReserva.setEnabled(estado);
        }
    }//GEN-LAST:event_jtHuespedesMouseClicked

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        Date fechaIn = jdcFechaIn.getDate();
        Date fechaOut = jdcFechaOut.getDate();

        if (huesped == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un huesped");
            return;
        }
        if (!jtfCantPers.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "La cantidad de personas solo pueden ser numeros enteros");
            return;
        }
        if (jtfCantPers.getText().isEmpty() || fechaIn == null || fechaOut == null) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        } else if (!fechaIn.before(fechaOut)) {
            JOptionPane.showMessageDialog(null, "La fecha de entrada no puede ser mayor que la fecha de salida");
        } else if (fechaIn.equals(fechaOut)) {
            JOptionPane.showMessageDialog(null, "Las fechas no pueden ser iguales");
        } else {
            borrarFilasHabitacion();
            cargarListaHabitaciones(fechaIn, fechaOut);
            cargarTablaHabitacion();
            jtfCantPersRestantes.setText(jtfCantPers.getText());
            cantPersRestantes = Integer.parseInt(jtfCantPers.getText());
            jcbTipoHab.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jtHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHabitacionesMouseClicked
        Reserva reserva = new Reserva();

        int i = jtHabitaciones.getSelectedRow();

        LocalDate fechaIngreso = jdcFechaIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaSalida = jdcFechaOut.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Habitacion habitacion = habitacionData.buscarHabitacion((int) jtHabitaciones.getValueAt(i, 0));

        double importe = reservaData.calcularImporte(fechaIngreso, fechaSalida, habitacion.getTipoHabitacionCodigo());
        //Deseleccionar y seleccionar

        if ((boolean) jtHabitaciones.getValueAt(i, 5)) {
            int confirmar = JOptionPane.showConfirmDialog(null, "Desea cancelar esta habitación?", "Cancelar selección", JOptionPane.YES_NO_OPTION);

            if (confirmar != 0) {
                return;
            }

            jtHabitaciones.setValueAt(false, i, 5);

            for (int j = 0; j < listaReservas.size(); j++) {
                Reserva r = listaReservas.get(j);
                if (r.getHabitacion().getIdHabitacion() == (int) jtHabitaciones.getValueAt(i, 0)) {
                    listaReservas.remove(j);
                }
            }

            cantPersRestantes += mapaHabitaciones.get((int) jtHabitaciones.getValueAt(i, 0));
            jtfCantPersRestantes.setText(cantPersRestantes + "");
        } else {
            String num = JOptionPane.showInputDialog("Ingrese la cantidad de personas:");
            
            if(!num.matches("\\d+")){
                JOptionPane.showMessageDialog(null, "El numero de personas debe ser un numero entero");
                return;
            }
            
            if(num == null){
                return;
            }
            
            cantPersIn = Integer.parseInt(num);

            if (cantPersIn > habitacion.getTipoHabitacionCodigo().getCantidadPersonas()) {
                JOptionPane.showMessageDialog(null, "El numero de personas no puede ser mayor que el numero que admite el tipo de habitacion");
                return;
            }

            if (cantPersIn == 0) {
                JOptionPane.showMessageDialog(null, "No se pueden ingresar cero huespedes");
                return;
            }

            if (cantPersRestantes - cantPersIn < 0) {
                JOptionPane.showMessageDialog(null, "El numero de personas ingresado es mas grande que el de personas restantes");
                return;
            }

            jtHabitaciones.setValueAt(true, i, 5);

            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);
            reserva.setCantPersonas(cantPersIn);
            reserva.setFechaEntrada(fechaIngreso);
            reserva.setFechaSalida(fechaSalida);
            reserva.setImporte(importe);
            reserva.setEstado(true);
            listaReservas.add(reserva);
            mapaHabitaciones.put((int) jtHabitaciones.getValueAt(i, 0), cantPersIn);

            cantPersRestantes -= cantPersIn;
            jtfCantPersRestantes.setText(cantPersRestantes + "");
        }
    }//GEN-LAST:event_jtHabitacionesMouseClicked

    private void jbCompletarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompletarReservaActionPerformed
        if (cantPersRestantes > 0 || cantPersRestantes == null) {
            JOptionPane.showMessageDialog(this, "Faltan personas por hospedar");
            return;
        }

        if (listaReservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que haber seleccionado al menos una habitación");
            return;
        }

        String mensaje = "Nombre: " + huesped.getNombre() + " ,DNI: " + huesped.getDni() + "\n"
                + "Fecha de Ingreso: " + fechaIngreso.format(formato) + " ,Fecha de Salida: " + fechaSalida.format(formato) + "\n";

        double montoTotal = 0;

        for (Reserva reserva : listaReservas) {
            mensaje += " Nro. habitacion " + reserva.getHabitacion().getIdHabitacion() + " ,Tipo: " + reserva.getHabitacion().getTipoHabitacionCodigo().getCodigo() + ""
                    + " ,Monto: " + reserva.getImporte() + " $\n";
            montoTotal += reserva.getImporte();
        }

        mensaje += "Total a pagar: " + montoTotal + " $";

        int confirmar = JOptionPane.showConfirmDialog(null, mensaje, "Confirme las reservas", JOptionPane.OK_CANCEL_OPTION);

        if (confirmar != 0) {
            return;
        }

        for (Reserva reserva : listaReservas) {
            reservaData.crearReserva(reserva);
        }
        JOptionPane.showMessageDialog(null, "Se han creado las reservas con exito");
        limpiarPanelReservas();
    }//GEN-LAST:event_jbCompletarReservaActionPerformed

    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabActionPerformed
        String codigo = jcbTipoHab.getSelectedItem().toString();
        boolean existe = false;

        borrarFilasHabitacion();

        if (codigo.equals("Todas")) {
            for (Habitacion habitacion : listaHabitaciones) {
                if (mapaHabitaciones.containsKey(habitacion.getIdHabitacion())) {
                    existe = true;
                } else {
                    existe = false;
                }
                modeloHabitacion.addRow(new Object[]{
                    habitacion.getIdHabitacion(),
                    habitacion.getPiso(),
                    habitacion.getTipoHabitacionCodigo().getCodigo(),
                    habitacion.isDisponibilidad(),
                    "Libre",
                    existe
                });
            }
            return;
        }

        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getTipoHabitacionCodigo().getCodigo().equals(codigo)) {
                if (mapaHabitaciones.containsKey(habitacion.getIdHabitacion())) {
                    existe = true;
                } else {
                    existe = false;
                }
                modeloHabitacion.addRow(new Object[]{
                    habitacion.getIdHabitacion(),
                    habitacion.getPiso(),
                    habitacion.getTipoHabitacionCodigo().getCodigo(),
                    habitacion.isDisponibilidad(),
                    "Libre",
                    existe
                });
            }
        }
    }//GEN-LAST:event_jcbTipoHabActionPerformed

    private void jbLeyendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeyendaActionPerformed
        String mensaje = "S = Simple\n"
                + "DS = Doble Simples\n"
                + "DQ = Doble Queen\n"
                + "TS = Triple Simples\n"
                + "TSQ = Triple, 1 Simple y 1 Queen\n"
                + "CS = Cuadruple Simples\n"
                + "C2SQ = Cuadruple, 2 Simples y 1 Queen \n"
                + "SL = Suit Lujo";
        JOptionPane.showMessageDialog(null, mensaje, "Tipos de habitacion codigo", 1);
    }//GEN-LAST:event_jbLeyendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCompletarReserva;
    private javax.swing.JButton jbLeyenda;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JComboBox<String> jcbFiltroHuesped;
    private javax.swing.JComboBox<String> jcbTipoHab;
    private static com.toedter.calendar.JDateChooser jdcFechaIn;
    private static com.toedter.calendar.JDateChooser jdcFechaOut;
    private javax.swing.JPanel jpContenedor1;
    private javax.swing.JPanel jpContenedor2;
    private javax.swing.JTable jtHabitaciones;
    private static javax.swing.JTable jtHuespedes;
    private static javax.swing.JTextField jtfBuscador;
    private static javax.swing.JTextField jtfCantPers;
    private javax.swing.JTextField jtfCantPersRestantes;
    // End of variables declaration//GEN-END:variables

    private void armarTablaHuesped() {
        modeloHuesped.addColumn("ID");
        modeloHuesped.addColumn("Nombre");
        modeloHuesped.addColumn("DNI");
        modeloHuesped.addColumn("Correo");
        modeloHuesped.addColumn("Celular");
        modeloHuesped.addColumn("Domicilio");
        modeloHuesped.addColumn("Estado");
        jtHuespedes.setModel(modeloHuesped);
    }

    private void cargarTablaHuespedes() {
        for (Huesped huesped : listaHuespedes) {
            modeloHuesped.addRow(new Object[]{
                huesped.getIdHuesped(),
                huesped.getNombre(),
                huesped.getDni(),
                huesped.getCorreo(),
                huesped.getCelular(),
                huesped.getDomicilio(),
                huesped.isEstado()
            });
        }
    }

    private static void borrarFilasHuespedes() {
        int f = jtHuespedes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloHuesped.removeRow(f);
        }
    }

    private void armarTablaHabitacion() {
        modeloHabitacion.addColumn("Numero");
        modeloHabitacion.addColumn("Piso");
        modeloHabitacion.addColumn("Codigo");
        modeloHabitacion.addColumn("Disponibilidad");
        modeloHabitacion.addColumn("Estado");
        modeloHabitacion.addColumn("");
        jtHabitaciones.setModel(modeloHabitacion);
        //jtHabitaciones.setSelectionModel(listSelectionModel);
    }

    private void cargarTablaHabitacion() {
        for (Habitacion habitacion : listaHabitaciones) {
            modeloHabitacion.addRow(new Object[]{
                habitacion.getIdHabitacion(),
                habitacion.getPiso(),
                habitacion.getTipoHabitacionCodigo().getCodigo(),
                "Libre",
                habitacion.isEstado(),
                false
            });
        }
    }

    private void borrarFilasHabitacion() {
        int f = jtHabitaciones.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloHabitacion.removeRow(f);
        }
    }

    private void cargarListaHabitaciones(Date fechaIn, Date fechaOut) {
        fechaIngreso = fechaIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fechaSalida = fechaOut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        listaHabitaciones = habitacionData.listarHabitacionesPorFecha(fechaIngreso, fechaSalida);
        //JOptionPane.showMessageDialog(null, listaHabitaciones);
    }

    private void centrarTablas(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public static void traerReserva(Reserva reserva, int cantPers) {
        borrarFilasHuespedes();
        huesped = reserva.getHuesped();
        jtfBuscador.setText(reserva.getHuesped().getIdHuesped() + "");
        modeloHuesped.addRow(new Object[]{
            huesped.getIdHuesped(),
            huesped.getNombre(),
            huesped.getDni(),
            huesped.getCorreo(),
            huesped.getCelular(),
            huesped.getDomicilio(),
            huesped.isEstado()
        });
        jdcFechaIn.setDate(Date.from(reserva.getFechaEntrada().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jdcFechaOut.setDate(Date.from(reserva.getFechaSalida().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jtfCantPers.setText(cantPers + "");
    }

    private void limpiarPanelReservas() {
        huesped = null;
        listaReservas.clear();
        fechaIngreso = null;
        fechaSalida = null;
        jdcFechaIn.setDate(null);
        jdcFechaOut.setDate(null);
        borrarFilasHabitacion();
        cantPersRestantes = null;
        cantPersIn = null;
        jtfCantPers.setText("");
        jtfCantPersRestantes.setText("");
        mapaHabitaciones.clear();
    }
}
