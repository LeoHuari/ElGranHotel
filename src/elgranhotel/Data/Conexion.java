
package elgranhotel.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public abstract class Conexion {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected PreparedStatement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "";
    private final String DATABASE = "elgranhotel";
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    
    protected void conectarBase(){
        if(conexion == null){
            try {
                Class.forName(DRIVER);
                String urlBaseDeDatos = "jdbc:mariadb://localhost:3306/" + DATABASE;
                conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar al Driver: "+ex);
            }
        }
    }
    
    protected void desconectarBase(){
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
                conexion = null;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al desconectar de la base: "+ex);
        }
    }
}
