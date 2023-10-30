/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Vistas;

import elgranhotel.Data.*;
import elgranhotel.Entidades.Habitacion;
import elgranhotel.Entidades.Reserva;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo Huari
 */
public class AdministrarReservas extends javax.swing.JPanel {

    private DefaultTableModel modeloReservas = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloHabitaciones = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private HuespedData huespedData = new HuespedData();
    private HabitacionData habitacionData = new HabitacionData();
    private ReservaData reservaData = new ReservaData();
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate fechaIngreso = null;
    private LocalDate fechaSalida = null;
    private ArrayList<Reserva> listaReservas = reservaData.listarReservas();
    private Reserva reserva = null;

    public AdministrarReservas() {
        initComponents();
        armarTablaReservas();
        cargarTablaReservas();
        armarTablaHabitaciones();
        UIManager.put("OptionPane.yesButtonText", "Si");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.okButtonText", "Aceptar");
        jpModificaciones.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpModificaciones = new javax.swing.JPanel();
        jdcFechaInMod = new com.toedter.calendar.JDateChooser();
        jdcFechaOutMod = new com.toedter.calendar.JDateChooser();
        jtCantPersMod = new javax.swing.JTextField();
        jtNroHabMod = new javax.swing.JTextField();
        jtNroReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtHuespedMod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComprobarFechaOut = new javax.swing.JButton();
        jbComprobarFechaIn = new javax.swing.JButton();
        jbCambiarCantPers = new javax.swing.JButton();
        jbCambiarNroHab = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jbCancelarMod = new javax.swing.JButton();
        jbGuardarMod = new javax.swing.JButton();
        jpPrincipal = new javax.swing.JPanel();
        jpFondoDePaneles = new javax.swing.JPanel();
        jpPorHuesped = new javax.swing.JPanel();
        jcbFiltroHuesped = new javax.swing.JComboBox<>();
        jtBuscador = new javax.swing.JTextField();
        jpPorFechas = new javax.swing.JPanel();
        jdcFechaIn = new com.toedter.calendar.JDateChooser();
        jdcFechaOut = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbFiltrarPor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCantPersMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtNroHabMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jtNroReserva.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Reserva numero :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Huesped:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de Salida:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad de Personas:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Ingreso:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Numero de habitación:");

        ComprobarFechaOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComprobarFechaOut.setText("Comprobar");

        jbComprobarFechaIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbComprobarFechaIn.setText("Comprobar");

        jbCambiarCantPers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCambiarCantPers.setText("Cambiar");

        jbCambiarNroHab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCambiarNroHab.setText("Cambiar");

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
        jScrollPane2.setViewportView(jtHabitaciones);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Habitaciones disponibles en la fecha ingresada");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "S", "DS", "DQ", "TS", "TSQ", "CS", "C2SQ", "SL" }));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Tipo Habitaciones:");

        jbCancelarMod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCancelarMod.setText("Cancelar cambios");

        jbGuardarMod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardarMod.setText("Guardar cambios");

        javax.swing.GroupLayout jpModificacionesLayout = new javax.swing.GroupLayout(jpModificaciones);
        jpModificaciones.setLayout(jpModificacionesLayout);
        jpModificacionesLayout.setHorizontalGroup(
            jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionesLayout.createSequentialGroup()
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(jtNroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(jtHuespedMod, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(jdcFechaInMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbComprobarFechaIn))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jdcFechaOutMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(ComprobarFechaOut))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(jtCantPersMod, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbCambiarCantPers))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel10)
                        .addGap(22, 22, 22)
                        .addComponent(jtNroHabMod, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jbCambiarNroHab))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel11))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jbCancelarMod)
                        .addGap(134, 134, 134)
                        .addComponent(jbGuardarMod)))
                .addGap(90, 90, 90))
        );
        jpModificacionesLayout.setVerticalGroup(
            jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(jtNroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtHuespedMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(jdcFechaInMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbComprobarFechaIn))
                .addGap(45, 45, 45)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jdcFechaOutMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComprobarFechaOut))
                .addGap(35, 35, 35)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jtCantPersMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCambiarCantPers))
                .addGap(35, 35, 35)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCambiarNroHab)
                    .addGroup(jpModificacionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtNroHabMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jpModificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarMod)
                    .addComponent(jbGuardarMod))
                .addContainerGap())
        );

        add(jpModificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 980, 1030));

        jpFondoDePaneles.setLayout(new java.awt.CardLayout());

        jcbFiltroHuesped.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbFiltroHuesped.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por ...", "DNI", "Nombre" }));

        jtBuscador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtBuscador.setText("Buscar ...");
        jtBuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtBuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtBuscadorFocusLost(evt);
            }
        });
        jtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpPorHuespedLayout = new javax.swing.GroupLayout(jpPorHuesped);
        jpPorHuesped.setLayout(jpPorHuespedLayout);
        jpPorHuespedLayout.setHorizontalGroup(
            jpPorHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPorHuespedLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jcbFiltroHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jpPorHuespedLayout.setVerticalGroup(
            jpPorHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPorHuespedLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jpPorHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbFiltroHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jpFondoDePaneles.add(jpPorHuesped, "card3");

        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de Salida:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de ingreso:");

        javax.swing.GroupLayout jpPorFechasLayout = new javax.swing.GroupLayout(jpPorFechas);
        jpPorFechas.setLayout(jpPorFechasLayout);
        jpPorFechasLayout.setHorizontalGroup(
            jpPorFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPorFechasLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdcFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdcFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jpPorFechasLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPorFechasLayout.setVerticalGroup(
            jpPorFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPorFechasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpPorFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(15, 15, 15))
        );

        jpFondoDePaneles.add(jpPorFechas, "card2");

        jcbFiltrarPor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbFiltrarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Huesped", "Fechas" }));
        jcbFiltrarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltrarPorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Filtrar reservas por: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administración de Reservas");

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

        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setText("Modificar Reserva");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCancelar.setText("Cancelar Reserva");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jcbFiltrarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpFondoDePaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jbModificar)
                        .addGap(195, 195, 195)
                        .addComponent(jbCancelar)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFiltrarPor))
                .addGap(18, 18, 18)
                .addComponent(jpFondoDePaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbModificar))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        jpModificaciones.setVisible(true);
        jpPrincipal.setVisible(false);
        jtNroReserva.setText(reserva.getIdReserva()+"");
        jtHuespedMod.setText(reserva.getHuesped().getNombre());
        jdcFechaInMod.setDate(Date.valueOf(reserva.getFechaEntrada()));
        jdcFechaOutMod.setDate(Date.valueOf(reserva.getFechaSalida()));
        jtCantPersMod.setText(reserva.getCantPersonas()+"");
        jtNroHabMod.setText(reserva.getHabitacion().getIdHabitacion()+"");
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcbFiltrarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltrarPorActionPerformed
        int i = jcbFiltrarPor.getSelectedIndex();
        if (i == 0) {
            jpPorHuesped.setVisible(true);
            jpPorFechas.setVisible(false);
            borrarFilasReservas();
            cargarTablaReservas();
        } else {
            jpPorHuesped.setVisible(false);
            jpPorFechas.setVisible(true);
        }
    }//GEN-LAST:event_jcbFiltrarPorActionPerformed

    private void jtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscadorKeyReleased
        borrarFilasReservas();
        String variable = null;
        int verificar = 0;
        for (Reserva reserva : listaReservas) {
            switch (jcbFiltroHuesped.getSelectedIndex()) {
                case 0:
                    borrarFilasReservas();
                    cargarTablaReservas();
                    verificar = -1;
                    break;
                case 1:
                    variable = reserva.getHuesped().getDni() + "";
                    verificar = 1;
                    break;
                case 2:
                    variable = reserva.getHuesped().getNombre().toLowerCase();
                    verificar = 2;
                    break;
            }

            if (verificar == 1) {
                if (variable.startsWith(jtBuscador.getText())) {
                    modeloReservas.addRow(new Object[]{
                        reserva.getIdReserva(),
                        reserva.getHuesped().getNombre(),
                        reserva.getHuesped().getDni(),
                        reserva.getHabitacion().getIdHabitacion(),
                        reserva.getHabitacion().getTipoHabitacionCodigo().getCodigo(),
                        reserva.getFechaEntrada().format(formato),
                        reserva.getFechaSalida().format(formato),
                        reserva.getImporte()
                    });
                }
            } else if (verificar == 2) {
                if (variable.contains(jtBuscador.getText().toLowerCase())) {
                    modeloReservas.addRow(new Object[]{
                        reserva.getIdReserva(),
                        reserva.getHuesped().getNombre(),
                        reserva.getHuesped().getDni(),
                        reserva.getHabitacion().getIdHabitacion(),
                        reserva.getHabitacion().getTipoHabitacionCodigo().getCodigo(),
                        reserva.getFechaEntrada().format(formato),
                        reserva.getFechaSalida().format(formato),
                        reserva.getImporte()
                    });
                }
            }
        }
    }//GEN-LAST:event_jtBuscadorKeyReleased

    private void jtBuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBuscadorFocusGained
        jtBuscador.setText("");
    }//GEN-LAST:event_jtBuscadorFocusGained

    private void jtBuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBuscadorFocusLost
        if (jtBuscador.getText().isEmpty()) {
            jtBuscador.setText("Buscar ...");
        }
    }//GEN-LAST:event_jtBuscadorFocusLost

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        fechaIngreso = jdcFechaIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fechaSalida = jdcFechaOut.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        if(fechaIngreso == null || fechaSalida == null){
            JOptionPane.showMessageDialog(null, "Debe ingresar fechas validas");
            return;
        }
        
        if(!fechaIngreso.isBefore(fechaSalida)){
            JOptionPane.showMessageDialog(null, "La fecha de ingreso no puede ser mayor que la de salida");
            return;
        }
        
        cargarTablaReservasPorFechas();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        int j = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cancelar la Reserva?", "Cancelando Reserva", JOptionPane.YES_NO_OPTION);
        if(j == 0){
            int i = jtReservas.getSelectedRow() - 1;
            reservaData.cancelarReserva((int)jtReservas.getValueAt(i, 0));
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReservasMouseClicked
        int i = jtReservas.getSelectedRow() - 1;
        reserva = reservaData.buscarReservaPorIdD((int)jtReservas.getValueAt(i, 0));
    }//GEN-LAST:event_jtReservasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprobarFechaOut;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCambiarCantPers;
    private javax.swing.JButton jbCambiarNroHab;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelarMod;
    private javax.swing.JButton jbComprobarFechaIn;
    private javax.swing.JButton jbGuardarMod;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbFiltrarPor;
    private javax.swing.JComboBox<String> jcbFiltroHuesped;
    private com.toedter.calendar.JDateChooser jdcFechaIn;
    private com.toedter.calendar.JDateChooser jdcFechaInMod;
    private com.toedter.calendar.JDateChooser jdcFechaOut;
    private com.toedter.calendar.JDateChooser jdcFechaOutMod;
    private javax.swing.JPanel jpFondoDePaneles;
    private javax.swing.JPanel jpModificaciones;
    private javax.swing.JPanel jpPorFechas;
    private javax.swing.JPanel jpPorHuesped;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField jtBuscador;
    private javax.swing.JTextField jtCantPersMod;
    private javax.swing.JTable jtHabitaciones;
    private javax.swing.JTextField jtHuespedMod;
    private javax.swing.JTextField jtNroHabMod;
    private javax.swing.JTextField jtNroReserva;
    private javax.swing.JTable jtReservas;
    // End of variables declaration//GEN-END:variables

    private void armarTablaReservas() {
        modeloReservas.addColumn("ID reserva");
        modeloReservas.addColumn("Nombre");
        modeloReservas.addColumn("DNI");
        modeloReservas.addColumn("Nro. Habitación");
        modeloReservas.addColumn("Tipo Habitación");
        modeloReservas.addColumn("Fecha Ingreso");
        modeloReservas.addColumn("Fecha Salida");
        modeloReservas.addColumn("Importe Total");
        jtReservas.setModel(modeloReservas);
    }

    private void cargarTablaReservas() {

        for (Reserva reserva : listaReservas) {
            modeloReservas.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getHuesped().getNombre(),
                reserva.getHuesped().getDni(),
                reserva.getHabitacion().getIdHabitacion(),
                reserva.getHabitacion().getTipoHabitacionCodigo().getCodigo(),
                reserva.getFechaEntrada().format(formato),
                reserva.getFechaSalida().format(formato),
                reserva.getImporte()
            });
        }

    }

    private void cargarTablaReservasPorFechas() {
        borrarFilasReservas();
        ArrayList<Reserva> listaReservasFechas = reservaData.buscarReservasPorFecha(fechaIngreso, fechaSalida);
        for (Reserva reserva : listaReservasFechas) {
            modeloReservas.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getHuesped().getNombre(),
                reserva.getHuesped().getDni(),
                reserva.getHabitacion().getIdHabitacion(),
                reserva.getHabitacion().getTipoHabitacionCodigo().getCodigo(),
                reserva.getFechaEntrada().format(formato),
                reserva.getFechaSalida().format(formato),
                reserva.getImporte()
            });
        }
    }

    private void borrarFilasReservas() {
        int f = jtReservas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloReservas.removeRow(f);
        }
    }

    private void armarTablaHabitaciones() {
        modeloHabitaciones.addColumn("Nro.");
        modeloHabitaciones.addColumn("Piso");
        modeloHabitaciones.addColumn("Tipo");
        jtHabitaciones.setModel(modeloHabitaciones);
    }

    private void cargarTablaHabitaciones() {
        ArrayList<Habitacion> lista = habitacionData.listarHabitacionesPorFecha(fechaIngreso, fechaSalida);
        for (Habitacion habitacion : lista) {
            modeloHabitaciones.addRow(new Object[]{
                habitacion.getIdHabitacion(),
                habitacion.getPiso(),
                habitacion.getTipoHabitacionCodigo().getCodigo()
            });
        }
    }

    private void borrarFilasHabitaciones() {
        int f = jtHabitaciones.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloHabitaciones.removeRow(f);
        }
    }
}
