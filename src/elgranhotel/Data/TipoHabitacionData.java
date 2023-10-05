
package elgranhotel.Data;

import elgranhotel.Entidades.TipoHabitacion;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TipoHabitacionData extends Conexion {

    public TipoHabitacionData() {
    }
    
    public TipoHabitacion buscarTipoHabitacion(int codigo){
        TipoHabitacion tipo = new TipoHabitacion();
        try{
            conectarBase();
            String sql = "SELECT * FROM tipohabitacion WHERE codigo = " + codigo ;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            if(resultado.next()){
                tipo.setCodigo(resultado.getInt(1));
                tipo.setCantidadPersonas(resultado.getInt(2));
                tipo.setCantidadCamas(resultado.getInt(3));
                tipo.setTipoCama(resultado.getString(4));
                tipo.setPrecio(resultado.getDouble(5));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en metodo buscarTipoHabitacion: "+ex);
        }finally{
            desconectarBase();
        }
        return tipo;
    }
    
    public void agregarTipoHabitacion(TipoHabitacion tipo){
        try{
            conectarBase();
            String sql = "INSERT INTO tipohabitacion(cantidadPersonas, cantidadCamas, tipoCamas, precio) "
                    + "VALUES (?,?,?,?)";
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setInt(1, tipo.getCantidadPersonas());
            sentencia.setInt(2, tipo.getCantidadCamas());
            sentencia.setString(3, tipo.getTipoCama());
            sentencia.setDouble(4, tipo.getPrecio());
            sentencia.executeUpdate();
            //Devuelvo el codigo generado por la base de datos
            resultado = sentencia.getGeneratedKeys();
            
            if(resultado.next()){
                tipo.setCodigo(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego un tipo de habitacion con exito");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo agregarTipoHabitacion: "+ex);
        }finally{
            desconectarBase();
        }
    }
    
    public void cambiarPrecio(double precio, int codigo){
        try{
            conectarBase();
            String sql = "UPDATE tipohabitacion SET precio = ? "
                    + "WHERE codigo = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setDouble(1, precio);
            sentencia.setInt(2, codigo);
            int i = sentencia.executeUpdate();
            if(i == 1)
                JOptionPane.showMessageDialog(null, "Se actualizo el precio con exito");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo cambiarPrecio: "+ex);
        }finally{
            desconectarBase();
        }
    }
    
    public ArrayList<TipoHabitacion> listarTiposHabitacion(){
        TipoHabitacion tipo;
        ArrayList<TipoHabitacion> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM tipohabitacion";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            while(resultado.next()){
                tipo = new TipoHabitacion();
                tipo.setCodigo(resultado.getInt(1));
                tipo.setCantidadPersonas(resultado.getInt(2));
                tipo.setCantidadCamas(resultado.getInt(3));
                tipo.setTipoCama(resultado.getString(4));
                tipo.setPrecio(resultado.getDouble(5));
                lista.add(tipo);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el metodo lsitarTiposHabitacion: "+ex);
        }finally{
            desconectarBase();
        }
        return lista;
    }
    
}
