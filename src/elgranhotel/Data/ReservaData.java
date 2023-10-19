package elgranhotel.Data;

import elgranhotel.Entidades.*;
import java.sql.Date;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservaData extends Conexion {

    private HuespedData huespedData = new HuespedData();
    private HabitacionData habitacionData = new HabitacionData();

    public void crearReserva(Reserva reserva) {
        //Pendiente ver si llegan baneados
        try {
            conectarBase();
            String sql = "INSERT INTO reservas(idHuesped, idHabitacion, cantPersona, fechaEntrada, fechaSalida, importe, estado) "
                    + "VALUES(?,?,?,?,?,?,?)";
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setInt(1, reserva.getHuesped().getIdHuesped());
            sentencia.setInt(2, reserva.getHabitacion().getIdHabitacion());
            sentencia.setInt(3, reserva.getCantPersonas());
            sentencia.setDate(4, Date.valueOf(reserva.getFechaEntrada()));
            sentencia.setDate(5, Date.valueOf(reserva.getFechaSalida()));
            sentencia.setDouble(6, reserva.getImporte());
            sentencia.setBoolean(7, true);
            sentencia.executeUpdate();
            resultado = sentencia.getGeneratedKeys();
            if (resultado.next()) {
                JOptionPane.showMessageDialog(null, "Se realizo la reserva con exito");
                reserva.setIdReserva(resultado.getInt(1));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo crearReserva: " + ex);
        } finally {
            desconectarBase();
        }
    }
    //Cambio a parametro de Reserva a int
    public void cancelarReserva(int idReserva) {
        try {
            conectarBase();
            String sql = "UPDATE reservas SET estado = 0 WHERE idReservas = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idReserva);
            int i = sentencia.executeUpdate();
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se cancelo la reserva con exito");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo crearReserva: " + ex);
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Reserva> buscarReservaPorHuesped(int idHuesped) {
        ArrayList<Reserva> lista = new ArrayList();
        Reserva reserva;
        try {
            conectarBase();
            String sql = "SELECT * FROM reservas WHERE idHuesped = ? AND estado = 1";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idHuesped);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(resultado.getInt(1));
                reserva.setHuesped(huespedData.BuscarHuespedPorId(resultado.getInt(2)));
                reserva.setHabitacion(habitacionData.buscarHabitacion(resultado.getInt(3)));
                reserva.setCantPersonas(resultado.getInt(4));
                reserva.setFechaEntrada(resultado.getDate(5).toLocalDate());
                reserva.setFechaSalida(resultado.getDate(6).toLocalDate());
                reserva.setImporte(resultado.getDouble(7));
                reserva.setEstado(resultado.getBoolean(8));
                lista.add(reserva);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo crearReserva: " + ex);
        } finally {
            desconectarBase();
        }
        return lista;
    }

    public ArrayList<Reserva> buscarReservasPorFecha(LocalDate fechaEntrada, LocalDate fechaSalida) {
        ArrayList<Reserva> lista = new ArrayList();
        Reserva reserva;
        try {
            conectarBase();
            //INTERSECCION CONJUNTOS STYLE
            String sql = "SELECT * FROM reservas WHERE fechaEntrada <= ? AND fechaSalida >= ? AND estado = 1 ";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setDate(2, Date.valueOf(fechaEntrada));
            sentencia.setDate(1, Date.valueOf(fechaSalida));
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(resultado.getInt(1));
                reserva.setHuesped(huespedData.BuscarHuespedPorId(resultado.getInt(2)));
                reserva.setHabitacion(habitacionData.buscarHabitacion(resultado.getInt(3)));
                reserva.setCantPersonas(resultado.getInt(4));
                reserva.setFechaEntrada(resultado.getDate(5).toLocalDate());
                reserva.setFechaSalida(resultado.getDate(6).toLocalDate());
                reserva.setImporte(resultado.getDouble(7));
                reserva.setEstado(resultado.getBoolean(8));
                lista.add(reserva);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo buscarReservasPorFecha: " + ex);
        } finally {
            desconectarBase();
        }
        return lista;
    }
    
    public void finReserva(Reserva reserva){
        try {
            conectarBase();
            String sql = "UPDATE reservas SET estado = 0 WHERE idReservas = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, reserva.getIdReserva());
            int i = sentencia.executeUpdate();
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se cancelo la reserva con exito");
                habitacionData.disponibilidadHabitacion(reserva.getHabitacion());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en metodo crearReserva: " + ex);
        } finally {
            desconectarBase();
        }
    }
    
    public ArrayList<Reserva> buscarReservasCanceladas(){
        ArrayList<Reserva> lista = new ArrayList();
        Reserva reserva;
        try{
            conectarBase();
            String sql = "SELECT * FROM reservas WHERE estado = 0";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            while(resultado.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultado.getInt(1));
                reserva.setHuesped(huespedData.BuscarHuespedPorId(resultado.getInt(2)));
                reserva.setHabitacion(habitacionData.buscarHabitacion(resultado.getInt(3)));
                reserva.setCantPersonas(resultado.getInt(4));
                reserva.setFechaEntrada(resultado.getDate(5).toLocalDate());
                reserva.setFechaSalida(resultado.getDate(6).toLocalDate());
                reserva.setImporte(resultado.getDouble(7));
                reserva.setEstado(resultado.getBoolean(8));
                lista.add(reserva);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo buscarReservasCanceladas: "+ex);
        }finally{
            desconectarBase();
        }
        return lista;
    }
    
    public Reserva buscarReservaPorIdD(int id){
        Reserva reserva = new Reserva();
        try{
            conectarBase();
            String sql = "SELECT * FROM reservas WHERE idReservas = ? AND estado = 1";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            if(resultado.next()){
                reserva.setIdReserva(id);
                reserva.setHuesped(huespedData.BuscarHuespedPorId(resultado.getInt(2)));
                reserva.setHabitacion(habitacionData.buscarHabitacion(resultado.getInt(3)));
                reserva.setCantPersonas(resultado.getInt(4));
                reserva.setFechaEntrada(resultado.getDate(5).toLocalDate());
                reserva.setFechaSalida(resultado.getDate(6).toLocalDate());
                reserva.setImporte(resultado.getDouble(7));
                reserva.setEstado(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo buscarReservaPorID: "+ex);
        }finally{
            desconectarBase();
        }
        return reserva;
    }
}
