/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgranhotel.Data;

import elgranhotel.Entidades.Habitacion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kicho
 */
public class HabitacionData extends Conexion{
    private Habitacion habitacion = new Habitacion();
    
    public void agregarHabitacion(Habitacion habitacion){
        String sql = "INSERT INTO habitacion (piso, tipoHabitacionCodigo, disponibilidad, estado) VALUES (?, ?, ?, ?)";
        try{
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setInt(1, habitacion.getPiso());
            sentencia.setInt(2, habitacion.getTipoHabitacionCodigo().getCodigo());
            sentencia.setInt(3, habitacion.getDisponibilidad());
            sentencia.setBoolean(4, habitacion.isEstado());
            sentencia.executeUpdate();
            resultado = sentencia.getGeneratedKeys();
            if(resultado.next()){
                habitacion.setIdHabitacion(resultado.getInt(1));
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
            sentencia.setInt(2, habitacion.getTipoHabitacionCodigo().getCodigo());
            sentencia.setInt(3, habitacion.getDisponibilidad());
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
                habitacion.getTipoHabitacionCodigo().setCodigo(resultado.getInt(3));
                habitacion.setDisponibilidad(resultado.getInt(4));
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
                habitacion.getTipoHabitacionCodigo().setCodigo(resultado.getInt(3));
                habitacion.setDisponibilidad(resultado.getInt(4));
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
}
