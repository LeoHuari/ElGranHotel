/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgranhotel.Data;

import elgranhotel.Entidades.Habitacion;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kicho
 */
public class HabitacionData extends Conexion{
    private TipoHabitacionData tipoData = new TipoHabitacionData();
    
    public Habitacion buscarHabitacion(int idHabitacion){
        Habitacion habitacion = new Habitacion();
        try{
            conectarBase();
            String sql = "SELECT * FROM habitacion WHERE idHabitacion = " + idHabitacion ;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            if(resultado.next()){
                habitacion.setIdHabitacion(resultado.getInt(1));
                habitacion.setPiso(resultado.getInt(2));
                habitacion.setTipoHabitacionCodigo(tipoData.buscarTipoHabitacion(resultado.getString(3)));
                habitacion.setDisponibilidad(resultado.getBoolean(4));
                habitacion.setEstado(resultado.getBoolean(5));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo buscarHabitacion: "+ex);
        }finally{
            desconectarBase();
        }
        return habitacion;
    }
    
    public void agregarHabitacion(Habitacion habitacion){
        String sql = "INSERT INTO habitacion (idHabitacion, piso, tipoHabitacionCodigo, disponibilidad, estado) VALUES (?, ?, ?, ?, ?)";
        try{
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, habitacion.getIdHabitacion());
            sentencia.setInt(2, habitacion.getPiso());
            sentencia.setString(3, habitacion.getTipoHabitacionCodigo().getCodigo());
            sentencia.setBoolean(4, habitacion.isDisponibilidad());
            sentencia.setBoolean(5, habitacion.isEstado());
            int i = sentencia.executeUpdate();
            if(i == 1){
                JOptionPane.showMessageDialog(null, "Habitación agregada con éxito!");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            
        }finally{
            try{
                desconectarBase();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base de datos" + ex.getMessage());
            }
        }
        
    }
    
    public void eliminarHabitacion(Habitacion habitacion){
        String sql = "UPDATE habitacion Set estado = 0 WHERE idHabitacion = ?";
        try{
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, habitacion.getIdHabitacion());
            int exito = sentencia.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Habitación eliminada con éxito!");
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
    }
    
    public void disponibilidadHabitacion(Habitacion habitacion){
        String sql = "UPDATE habitacion Set disponibilidad = 0 WHERE idHabitacion = ?";
        try{
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, habitacion.getIdHabitacion());
            int exito = sentencia.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "La habitación está libre!");
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
    }
    
    public void modificarHabitacion(Habitacion habitacion){
        String sql = "UPDATE habitacion SET piso = ?, tipoHabitacionCodigo = ?, disponibilidad = ?, estado = ? WHERE idHabitacion = ?";
        try{
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, habitacion.getPiso());
            sentencia.setString(2, habitacion.getTipoHabitacionCodigo().getCodigo());
            sentencia.setBoolean(3, habitacion.isDisponibilidad());
            sentencia.setBoolean(4, habitacion.isEstado());
            sentencia.setInt(5, habitacion.getIdHabitacion());
            int exito = sentencia.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Habitación modificada con éxito!");
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
    }
    
    public ArrayList<Habitacion>listarHabitacionesLibres(){
        ArrayList<Habitacion> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM habitacion WHERE disponibilidad = 0";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Habitacion habitacion;
            while(resultado.next()){
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(resultado.getInt(1));
                habitacion.setPiso(resultado.getInt(2));
                habitacion.getTipoHabitacionCodigo().setCodigo(resultado.getString(3));
                habitacion.setDisponibilidad(resultado.getBoolean(4));
                habitacion.setEstado(resultado.getBoolean(5));
                lista.add(habitacion);
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
        return lista;
    }
    
    public ArrayList<Habitacion>listarHabitacionesOcupadas(){
        ArrayList<Habitacion> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM habitacion WHERE disponibilidad = 1";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Habitacion habitacion;
            while(resultado.next()){
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(resultado.getInt(1));
                habitacion.setPiso(resultado.getInt(2));
                habitacion.getTipoHabitacionCodigo().setCodigo(resultado.getString(3));
                habitacion.setDisponibilidad(resultado.getBoolean(4));
                habitacion.setEstado(resultado.getBoolean(5));
                lista.add(habitacion);
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
        return lista;
    }
    
    public ArrayList<Habitacion>listarHabitacionesPorFecha(LocalDate fechaEntrada, LocalDate fechaSalida){
        ArrayList<Habitacion> lista = new ArrayList();
        Habitacion habitacion;
        try{
            conectarBase();
            String sql = "SELECT habitacion.* " +
                "FROM reservas RIGHT JOIN habitacion ON (reservas.idHabitacion = habitacion.idHabitacion) AND (fechaEntrada <= ? AND fechaSalida >= ?) " +
                "WHERE reservas.idHabitacion IS NULL AND reservas.estado = 1";
            sentencia = conexion.prepareStatement(sql);
            //INTERSECCION
            sentencia.setDate(2, Date.valueOf(fechaEntrada));
            sentencia.setDate(1, Date.valueOf(fechaSalida));
            resultado = sentencia.executeQuery();
            while(resultado.next()){
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(resultado.getInt(1));
                habitacion.setPiso(resultado.getInt(2));
                habitacion.setTipoHabitacionCodigo(tipoData.buscarTipoHabitacion(resultado.getString(3)));
                habitacion.setDisponibilidad(resultado.getBoolean(4));
                habitacion.setEstado(resultado.getBoolean(5));
                lista.add(habitacion);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo listarHabitacionesPorFecha: "+ex);
        }finally{
            desconectarBase();
        }
        return lista;
    }
}
