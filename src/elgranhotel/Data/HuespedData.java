/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgranhotel.Data;

import elgranhotel.Entidades.Huesped;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kicho
 */
public class HuespedData extends Conexion {

    Huesped huesped = null;

    public void guardarHuesped(Huesped huesped) {
        try {
            conectarBase();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
        String sql = "INSERT INTO huesped (nombre, dni, correo, celular, domicilio, estado) VALUES (?, ?, ?, ?, ?,?)";
        try {
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setString(1, huesped.getNombre());
            sentencia.setInt(2, huesped.getDni());
            sentencia.setString(3, huesped.getCorreo());
            sentencia.setInt(4, huesped.getCelular());
            sentencia.setString(5, huesped.getDomicilio());
            sentencia.setBoolean(5, huesped.isEstado());
            sentencia.executeUpdate(sql);
            resultado = sentencia.getGeneratedKeys();
            if (resultado.next()) {
                huesped.setIdHuesped(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped añadido con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped " + ex.getMessage());
        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
    }

    public void modificarHuesped(Huesped huesped) {
        String sql = "UPDATE huesped SET nombre = ?, dni = ?, correo = ?, celular = ?, domicilio = ?, estado = ?"
                + " WHERE idHuesped = ?";

        try {
            conectarBase();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        }
        try {
            System.out.println("el estado es : " + huesped.isEstado());
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, huesped.getNombre());
            sentencia.setInt(2, huesped.getDni());
            sentencia.setString(3, huesped.getCorreo());
            sentencia.setInt(4, huesped.getCelular());
            sentencia.setString(5, huesped.getDomicilio());
            sentencia.setBoolean(5, huesped.isEstado());
            sentencia.setInt(4, huesped.getIdHuesped());
            int exito = sentencia.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Huesped Modificado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
    }

    public Huesped BuscarHuespedPorId(int id) {
        String sql = " SELECT nombre, dni, correo, celular, domicilio FROM huesped WHERE idHuesped = ? AND estado = 1";
        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(id);
                huesped.setNombre(resultado.getString("nombre"));
                huesped.setDni(resultado.getInt("dni"));
                huesped.setCorreo(resultado.getString("correo"));
                huesped.setCelular(resultado.getInt("celular"));
                huesped.setDomicilio(resultado.getString("domicilio"));
                huesped.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "no existe el Huesped");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");

        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
        return huesped;
    }

    public Huesped BuscarHuespedPorDNI(int dni) {
        String sql = " SELECT nombre, dni, correo, celular, domicilio FROM huesped WHERE dni = ?";
        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, dni);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(resultado.getInt("idHuesped"));
                huesped.setNombre(resultado.getString("nombre"));
                huesped.setDni(dni);
                huesped.setCorreo(resultado.getString("correo"));
                huesped.setCelular(resultado.getInt("celular"));
                huesped.setDomicilio(resultado.getString("domicilio"));
                huesped.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "no existe el Huesped");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");

        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
        return huesped;
    }

    public ArrayList<Huesped> ListarHuesped(Huesped huesped) {
        String sql = " SELECT nombre, dni, correo, celular, domicilio FROM huesped WHERE estado = 1";
        ArrayList<Huesped> huespedes = new ArrayList<>();

        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(resultado.getInt("idHuesped"));
                huesped.setNombre(resultado.getString("nombre"));
                huesped.setDni(resultado.getInt("dni"));
                huesped.setCorreo(resultado.getString("correo"));
                huesped.setCelular(resultado.getInt("celular"));
                huesped.setDomicilio(resultado.getString("domicilio"));
                huesped.setEstado(true);

                huespedes.add(huesped);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped " + ex);

        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
        return huespedes;
    }

    public void banearHuesped(int id) {
        String sqlSelect = "SELECT estado FROM huesped where idHuesped = ?";
        String sqlUpdate = "Update huesped Set estado = 0 WHERE idHuesped = ?";

        try {
            conectarBase();

            sentencia = conexion.prepareStatement(sqlSelect);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
             if (resultado.next()) {
                huesped = new Huesped();
                huesped.setEstado(resultado.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        if (huesped.isEstado()){
        try {
            sentencia = conexion.prepareStatement(sqlUpdate);
            sentencia.setInt(1, id);
            int exito = sentencia.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno añadido a la lista negra");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla huesped");
        } finally {
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
        }else{
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base " + ex);
            }
        }
    }
}
