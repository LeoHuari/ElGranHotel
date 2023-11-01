/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Vistas;

import elgranhotel.Data.HabitacionData;
import elgranhotel.Data.ReservaData;
import elgranhotel.Entidades.Habitacion;
import elgranhotel.Entidades.Reserva;
import static elgranhotel.Vistas.CrearReservas.traerReserva;
import static elgranhotel.Vistas.Principal.cambiarVentanaAReservas;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo Huari
 */
public class Recepcion extends javax.swing.JPanel {

    private ReservaData reservaData = new ReservaData();
    private HabitacionData habitacionData = new HabitacionData();
    private ArrayList<Reserva> lista = new ArrayList();
    private Habitacion habitacion = new Habitacion();
    private Reserva reservaNueva = new Reserva();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private DefaultTableModel modeloHuesped = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloReservas = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public Recepcion() {
        initComponents();
        jpCheckIn.setVisible(false);
        jpExtender.setVisible(false);
        jpCheckOut.setVisible(false);
        armarTablaReservasPorDni();
        centrarTablas(jtReservas);
        jbCheckIn.setEnabled(false);
        jbCheckOut.setEnabled(false);
        jbExtender.setEnabled(false);
        jbCambiarHab.setEnabled(false);
        agregarListSelectionListener();
        agregarListener_dchFin();
        jbComprobarDisponibilidad.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfBuscarReservas = new javax.swing.JTextField();
        jtBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbCheckIn = new javax.swing.JButton();
        jbExtender = new javax.swing.JButton();
        jbCheckOut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jpVacio = new javax.swing.JPanel();
        jpCheckIn = new javax.swing.JPanel();
        jbConfirmarIn = new javax.swing.JButton();
        jpExtender = new javax.swing.JPanel();
        jdchInicio = new com.toedter.calendar.JDateChooser();
        jdchFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbComprobarDisponibilidad = new javax.swing.JButton();
        jlCantDias = new javax.swing.JLabel();
        jtfCantDias = new javax.swing.JTextField();
        jbCambiarHab = new javax.swing.JButton();
        jpCheckOut = new javax.swing.JPanel();
        jbConfirmarCheckOut = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfBuscarReservas.setText("Buscar reservas por DNI");
        jtfBuscarReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuscarReservasMouseClicked(evt);
            }
        });
        jtfBuscarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarReservasActionPerformed(evt);
            }
        });
        jPanel2.add(jtfBuscarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 180, 30));

        jtBuscar.setText("Buscar");
        jtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtReservas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 680, 250));

        jbCheckIn.setText("Check In");
        jbCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckInActionPerformed(evt);
            }
        });
        jPanel2.add(jbCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jbExtender.setText("Extender Reserva");
        jbExtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExtenderActionPerformed(evt);
            }
        });
        jPanel2.add(jbExtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jbCheckOut.setText("Check Out");
        jbCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckOutActionPerformed(evt);
            }
        });
        jPanel2.add(jbCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 480));

        jPanel3.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jpVacioLayout = new javax.swing.GroupLayout(jpVacio);
        jpVacio.setLayout(jpVacioLayout);
        jpVacioLayout.setHorizontalGroup(
            jpVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jpVacioLayout.setVerticalGroup(
            jpVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel3.add(jpVacio, "card1");

        jbConfirmarIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbConfirmarIn.setText("Confirmar Ingreso");
        jbConfirmarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCheckInLayout = new javax.swing.GroupLayout(jpCheckIn);
        jpCheckIn.setLayout(jpCheckInLayout);
        jpCheckInLayout.setHorizontalGroup(
            jpCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckInLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jbConfirmarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jpCheckInLayout.setVerticalGroup(
            jpCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckInLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jbConfirmarIn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jPanel3.add(jpCheckIn, "card2");

        jdchInicio.setEnabled(false);

        jLabel3.setText("Seleccione el periodo de extension");

        jLabel4.setText("Inicio");

        jLabel5.setText("Fin");

        jbComprobarDisponibilidad.setText("Comprobar Disponibilidad");
        jbComprobarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprobarDisponibilidadActionPerformed(evt);
            }
        });

        jlCantDias.setText("Cantidad de dias:");

        jtfCantDias.setEditable(false);
        jtfCantDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCantDiasActionPerformed(evt);
            }
        });

        jbCambiarHab.setText("Cambiar Habitación");
        jbCambiarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCambiarHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpExtenderLayout = new javax.swing.GroupLayout(jpExtender);
        jpExtender.setLayout(jpExtenderLayout);
        jpExtenderLayout.setHorizontalGroup(
            jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtenderLayout.createSequentialGroup()
                .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpExtenderLayout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel4)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel5))
                    .addGroup(jpExtenderLayout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel3))
                    .addGroup(jpExtenderLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlCantDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdchInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpExtenderLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jdchFin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpExtenderLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfCantDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExtenderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbCambiarHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbComprobarDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(400, 400, 400))
        );
        jpExtenderLayout.setVerticalGroup(
            jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExtenderLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpExtenderLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdchFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdchInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpExtenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantDias)
                    .addComponent(jtfCantDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jbComprobarDisponibilidad)
                .addGap(18, 18, 18)
                .addComponent(jbCambiarHab)
                .addContainerGap())
        );

        jPanel3.add(jpExtender, "card3");

        jbConfirmarCheckOut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbConfirmarCheckOut.setText("Confirmar Salida");
        jbConfirmarCheckOut.setPreferredSize(new java.awt.Dimension(226, 43));
        jbConfirmarCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCheckOutLayout = new javax.swing.GroupLayout(jpCheckOut);
        jpCheckOut.setLayout(jpCheckOutLayout);
        jpCheckOutLayout.setHorizontalGroup(
            jpCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckOutLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jbConfirmarCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jpCheckOutLayout.setVerticalGroup(
            jpCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCheckOutLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jbConfirmarCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        jPanel3.add(jpCheckOut, "card4");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 980, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarReservasActionPerformed

    private void jbCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckInActionPerformed
        if (jpCheckIn.isVisible()) {
            jpExtender.setVisible(false);
            jpCheckOut.setVisible(false);
            jpCheckIn.setVisible(false);
            jpVacio.setVisible(true);
            jbCheckIn.setFocusPainted(false);
        } else {
            jpVacio.setVisible(false);
            jpExtender.setVisible(false);
            jpCheckOut.setVisible(false);
            jpVacio.setVisible(false);
            jpCheckIn.setVisible(true);
        }
    }//GEN-LAST:event_jbCheckInActionPerformed

    private void jbCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckOutActionPerformed
        if (jpCheckOut.isVisible()) {
            jpExtender.setVisible(false);
            jpCheckOut.setVisible(false);
            jpCheckIn.setVisible(false);
            jpVacio.setVisible(true);
            jbCheckOut.setFocusPainted(false);
        } else {
            jpVacio.setVisible(false);
            jpCheckIn.setVisible(false);
            jpExtender.setVisible(false);
            jpCheckOut.setVisible(true);
        }
    }//GEN-LAST:event_jbCheckOutActionPerformed

    private void jbExtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExtenderActionPerformed
        if (jpExtender.isVisible()) {
            jpExtender.setVisible(false);
            jpCheckOut.setVisible(false);
            jpCheckIn.setVisible(false);
            jpVacio.setVisible(true);
            jbCheckOut.setFocusPainted(false);
        } else {
            jpVacio.setVisible(false);
            jpCheckOut.setVisible(false);
            jpCheckIn.setVisible(false);
            jpExtender.setVisible(true);
            int filaSeleccionada = jtReservas.getSelectedRow();
            LocalDate fechaFinEstadia = (LocalDate) jtReservas.getValueAt(filaSeleccionada, 5);
            Date fechaInicioExtension = Date.from(fechaFinEstadia.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdchInicio.setDate(fechaInicioExtension);
        }
    }//GEN-LAST:event_jbExtenderActionPerformed

    private void jtfBuscarReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarReservasMouseClicked
        jtfBuscarReservas.setText("");
    }//GEN-LAST:event_jtfBuscarReservasMouseClicked

    private void jtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarActionPerformed
        lista = reservaData.listarReservas();
       // JOptionPane.showMessageDialog(null, lista);
        int dni = Integer.parseInt(jtfBuscarReservas.getText());
        jbCheckIn.setEnabled(false);
        jbExtender.setEnabled(false);
        jbCheckOut.setEnabled(false);
        jpExtender.setVisible(false);
        jpCheckOut.setVisible(false);
        jpCheckIn.setVisible(false);
        jpVacio.setVisible(true);
        borrarFilasReservas();
        for (Reserva reserva : lista) {
            if (reserva.getHuesped().getDni() == dni) {
                modeloReservas.addRow(new Object[]{
                    reserva.getIdReserva(), //0
                    reserva.getHuesped().getNombre(), //1
                    reserva.getHabitacion().getIdHabitacion(), //2
                    reserva.getCantPersonas(), //3
                    reserva.getFechaEntrada(), //4
                    reserva.getFechaSalida(), //5
                    reserva.getImporte(), //6
                    reserva.isEstado() //7
                });
            }
        }


    }//GEN-LAST:event_jtBuscarActionPerformed

    private void jtReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReservasMouseClicked
//       int fila = jtReservas.getSelectedRow();
//       LocalDate fechaInicio = (LocalDate)jtReservas.getValueAt(fila,4 );
//       LocalDate fechaFin= (LocalDate)jtReservas.getValueAt(fila,5 );
//       if(!fechaInicio.isAfter(LocalDate.now())){
//           jbCheckIn.setEnabled(true);
//       }else{
//           jbCheckIn.setEnabled(false);
//           jpCheckIn.setVisible(false);
//       }
//      Al final use el metodo agregarListSelectionListener para esto
    }//GEN-LAST:event_jtReservasMouseClicked

    private void jbConfirmarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarInActionPerformed
        int fila = jtReservas.getSelectedRow();
        int idReserva = (Integer) jtReservas.getValueAt(fila, 0);
        for (Reserva reserva : lista) {
            if (reserva.getIdReserva() == idReserva) {
                habitacionData.disponibilidadHabitacion(reserva.getHabitacion());
                jbConfirmarIn.setFocusPainted(false);
                jbCheckIn.setEnabled(false);
                jbExtender.setEnabled(false);
                jpCheckIn.setVisible(false);
                borrarFilasReservas();
            }
        }
    }//GEN-LAST:event_jbConfirmarInActionPerformed

    private void jbComprobarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprobarDisponibilidadActionPerformed
        ArrayList<Reserva> listaReservasPeriodo;
        Reserva reservaSeleccionada = new Reserva();
        int fila = jtReservas.getSelectedRow();
        int IdHabitacion = (Integer) jtReservas.getValueAt(fila, 2);
        int idReservaSeleccionada = (Integer) jtReservas.getValueAt(fila, 0);
        long diasDisponibles = 0;
        LocalDate inicio = jdchInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fin = jdchFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaMenor = fin;
        long periodoExtension = DAYS.between(inicio, fin);
        //obtengo la lista de reservas para la habitacio nentre el fin de la estadia original
        // y el fin del periodo de extension
        listaReservasPeriodo = reservaData.listarReservasPorFechaYHabitacion(inicio, fin, IdHabitacion);
       // JOptionPane.showMessageDialog(null, listaReservasPeriodo);
        //obtengo la reserva seleccionada completa
        for (Reserva reserva : lista) {
            if (reserva.getIdReserva() == idReservaSeleccionada) {
                reservaSeleccionada = reserva;
            }
        }
        //compruebo si la lista esta vacia
        if (listaReservasPeriodo.isEmpty()) {
            //de ser asi, procedo a extender la reserva.
            double importeNuevo = reservaData.calcularImporte(reservaSeleccionada.getFechaEntrada(), fin, reservaSeleccionada.getHabitacion().getTipoHabitacionCodigo());
            int opcion = JOptionPane.showConfirmDialog(null, "Confirma la extension de la estadia " + jtfCantDias.getText() + " Dias \n Hasta " + fin + "\n Importe Actualizado : " + importeNuevo, "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                // Llama a tu método aquí
                reservaSeleccionada.setFechaSalida(fechaMenor);
                reservaSeleccionada.setImporte(importeNuevo);
                reservaData.modificarReserva(reservaSeleccionada);
                jbComprobarDisponibilidad.setEnabled(false);
                jdchFin.setCalendar(null);
            }

        } else {
            //si no, remuevo a la reserva de la lista de resrvars en ese periodo
            Iterator<Reserva> iterator = listaReservasPeriodo.iterator();
            while (iterator.hasNext()) {
                Reserva reserva = iterator.next();
                if (reserva.getIdReserva() == (reservaSeleccionada.getIdReserva())) {
                    iterator.remove();
                }
            }
            //vuelvo a comprobar si la lista esta vacia
            if (listaReservasPeriodo.isEmpty()) {
                //de ser asi, procedo a extender la reserva.
                double importeNuevo = reservaData.calcularImporte(reservaSeleccionada.getFechaEntrada(), fin, reservaSeleccionada.getHabitacion().getTipoHabitacionCodigo());
                int opcion = JOptionPane.showConfirmDialog(null, "Confirma la extension de la estadia " + jtfCantDias.getText() + " Dias \n Hasta " + fin + "\n Importe Actualizado : " + importeNuevo, "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Llama a tu método aquí
                    reservaSeleccionada.setFechaSalida(fechaMenor);
                    reservaSeleccionada.setImporte(importeNuevo);
                    reservaData.modificarReserva(reservaSeleccionada);
                    
                    lista = reservaData.listarReservas();
       // JOptionPane.showMessageDialog(null, lista);
        int dni = Integer.parseInt(jtfBuscarReservas.getText());
        jbCheckIn.setEnabled(false);
        jbExtender.setEnabled(false);
        jbCheckOut.setEnabled(false);
        jpExtender.setVisible(false);
        jpCheckOut.setVisible(false);
        jpCheckIn.setVisible(false);
        jpVacio.setVisible(true);
        borrarFilasReservas();
        for (Reserva reserva : lista) {
            if (reserva.getHuesped().getDni() == dni) {
                modeloReservas.addRow(new Object[]{
                    reserva.getIdReserva(), //0
                    reserva.getHuesped().getNombre(), //1
                    reserva.getHabitacion().getIdHabitacion(), //2
                    reserva.getCantPersonas(), //3
                    reserva.getFechaEntrada(), //4
                    reserva.getFechaSalida(), //5
                    reserva.getImporte(), //6
                    reserva.isEstado() //7
                });
            }
        }
                }

            } else {
                //si no, compruebo cuantos dias esta disponible
                //primero me quedo con la fecha menor de las reservas dentro del periodo
                for (Reserva reserva : listaReservasPeriodo) {
                    LocalDate fechaEntrada = reserva.getFechaEntrada();
                    if (fechaEntrada.isBefore(fechaMenor)) {
                        fechaMenor = fechaEntrada;
                    }
                }
                if (fechaMenor.equals(inicio)) {
                    JOptionPane.showMessageDialog(null, "La habitacion no esta disponible");
                    jbCambiarHab.setEnabled(true);
                    reservaSeleccionada.setFechaSalida(fin);
                    reservaNueva = reservaSeleccionada;

                } else {
                    diasDisponibles = DAYS.between(inicio, fechaMenor);
                    double importeNuevo = reservaData.calcularImporte(reservaSeleccionada.getFechaEntrada(), fechaMenor, reservaSeleccionada.getHabitacion().getTipoHabitacionCodigo());
                    int opcion = JOptionPane.showConfirmDialog(null, "La habitacion esta disponible por " + diasDisponibles + " Dias \n Hasta " + fechaMenor + "\n Importe total: " + importeNuevo + " \n Desea extender de todos modos?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        // Llama a tu método aquí
                        reservaSeleccionada.setImporte(importeNuevo);
                        reservaSeleccionada.setFechaSalida(fechaMenor);
                        reservaData.modificarReserva(reservaSeleccionada);
                    }

                }
            }

        }
    }//GEN-LAST:event_jbComprobarDisponibilidadActionPerformed

    private void jtfCantDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCantDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCantDiasActionPerformed

    private void jbCambiarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCambiarHabActionPerformed
        cambiarVentanaAReservas();
        int id = reservaNueva.getIdReserva();
        traerReserva(reservaNueva, id);

    }//GEN-LAST:event_jbCambiarHabActionPerformed

    private void jbConfirmarCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarCheckOutActionPerformed
        Reserva reservaSeleccionada= new Reserva();
        
        int fila = jtReservas.getSelectedRow();
        int idReserva = (Integer) jtReservas.getValueAt(fila, 0);
        for (Reserva reserva : lista) {
            if (reserva.getIdReserva() == idReserva) {
             reservaSeleccionada= reserva;
            }
        }
        
        String mensaje = "Nombre: " + reservaSeleccionada.getHuesped().getNombre() + " ,DNI: " + reservaSeleccionada.getHuesped().getDni() + "\n"
                + "Fecha de Ingreso: " + reservaSeleccionada.getFechaEntrada().format(formato) + " ,Fecha de Salida: " + reservaSeleccionada.getFechaSalida().format(formato) + "\n";
        
         mensaje += " Nro. habitacion " + reservaSeleccionada.getHabitacion().getIdHabitacion() + " ,Tipo: " + reservaSeleccionada.getHabitacion().getTipoHabitacionCodigo().getCodigo() + ""
                    + " ,Monto: " + reservaSeleccionada.getImporte() + " $\n";
        
         int confirmar = JOptionPane.showConfirmDialog(null, mensaje, "Confirme Salida", JOptionPane.OK_CANCEL_OPTION);

        if (confirmar != 0) {
            return;
        }
            
         habitacionData.disponibilidadHabitacion(reservaSeleccionada.getHabitacion());
          reservaData.cancelarReserva(idReserva);
                borrarFilasReservas();
                jbConfirmarCheckOut.setFocusPainted(false);
                jbCheckOut.setEnabled(false);
                jpCheckOut.setVisible(false);
                
    }//GEN-LAST:event_jbConfirmarCheckOutActionPerformed

    //Metodo para capturar la seleccion de la tabla
    //jtReservas.getSelectionModel().addListSelectionListener agrega un ListSelectionListener a la tabla.
    //Cuando cambia la selección de la tabla, se activa el método valueChanged
    private void agregarListSelectionListener() {

        jtReservas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                LocalDate fechaActual = LocalDate.now();
                int fila = jtReservas.getSelectedRow();
                if (fila != -1) { // Verifica que se haya seleccionado una fila
                    LocalDate fechaInicio = (LocalDate) jtReservas.getValueAt(fila, 4);
                    LocalDate fechaFin = (LocalDate) jtReservas.getValueAt(fila, 5);
                    int idReserva = (Integer) jtReservas.getValueAt(fila, 0);
                    
                    if (jpExtender.isVisible()) {
                        jpExtender.setVisible(false);
                        jpVacio.setVisible(true);
                    }
                    if (jpCheckOut.isVisible()) {
                    jpCheckOut.setVisible(false);
                    jpVacio.setVisible(true); 
                }
                    for (Reserva reserva : lista) {
                        if (reserva.getIdReserva() == idReserva) {
                            habitacion = reserva.getHabitacion();
                        }
                    }
                    // habilatacion o deshabilitacion de Boton check in
                    if (!fechaInicio.isAfter(LocalDate.now()) && !habitacion.isDisponibilidad()) {
                        jbCheckIn.setEnabled(true);
                    } else {
                        jbCheckIn.setEnabled(false);
                        jpCheckIn.setVisible(false);
                    }
                    // Verificar si la fecha actual está entre las dos fechas
                    if (habitacion.isDisponibilidad() && (fechaActual.isAfter(fechaInicio) || fechaActual.isEqual(fechaInicio)) && (fechaActual.isBefore(fechaFin) || fechaActual.isEqual(fechaFin))) {
                        jbCheckOut.setEnabled(true);
                    } else {
                        jbCheckOut.setEnabled(false);
                        jpCheckOut.setVisible(false);
                    }
                    // habilatacion o deshabilitacion de Boton extender
                    jbExtender.setEnabled(true);

                }
            }
        });
    }
    //metodo para habilitar boton de dispinibilidad al selecionar fecha de fin

    private void agregarListener_dchFin() {

        // Obtenemos el editor de fecha del JDateChooser y 
        //Agregamos un PropertyChangeListener al editor de fecha
        jdchFin.getDateEditor().addPropertyChangeListener(
                new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                // Comprobamos si la propiedad que cambió es "date"
                if ("date".equals(e.getPropertyName())) {
                    // Si la propiedad "date" cambió, habilitamos el botón
                    LocalDate inicio = jdchInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate fin = jdchFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    if(fin.isBefore(inicio)||fin.equals(inicio)){
                        JOptionPane.showMessageDialog(null, "la fecha de salida debe ser posterior a la de entrada");
                        
                    }else {
                    jbComprobarDisponibilidad.setEnabled(true);
                    String CantDias = Long.toString(DAYS.between(inicio, fin));
                    jtfCantDias.setText(CantDias);
                    
                    }
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCambiarHab;
    private javax.swing.JButton jbCheckIn;
    private javax.swing.JButton jbCheckOut;
    private javax.swing.JButton jbComprobarDisponibilidad;
    private javax.swing.JButton jbConfirmarCheckOut;
    private javax.swing.JButton jbConfirmarIn;
    private javax.swing.JButton jbExtender;
    private com.toedter.calendar.JDateChooser jdchFin;
    private com.toedter.calendar.JDateChooser jdchInicio;
    private javax.swing.JLabel jlCantDias;
    private javax.swing.JPanel jpCheckIn;
    private javax.swing.JPanel jpCheckOut;
    private javax.swing.JPanel jpExtender;
    private javax.swing.JPanel jpVacio;
    private javax.swing.JButton jtBuscar;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfBuscarReservas;
    private javax.swing.JTextField jtfCantDias;
    // End of variables declaration//GEN-END:variables

    private void armarTablaReservasPorDni() {
        modeloReservas.addColumn("ID");
        modeloReservas.addColumn("Huesped");
        modeloReservas.addColumn("Nro Habitacion");
        modeloReservas.addColumn("cant. Personas");
        modeloReservas.addColumn("Fecha Entrada");
        modeloReservas.addColumn("Fecha Salida");
        modeloReservas.addColumn("Importe");
        modeloReservas.addColumn("Estado");
        jtReservas.setModel(modeloReservas);
    }

    private void borrarFilasReservas() {
        int f = jtReservas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloReservas.removeRow(f);
        }
    }

    private void centrarTablas(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    /*
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private int cantPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double importe;
    boolean estado;
     */
}
