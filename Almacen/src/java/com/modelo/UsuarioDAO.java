
package com.modelo;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.conexion.Conexion;
/**
 *
 * @author Kevin Uribe
 */
public class UsuarioDAO extends Conexion{
    public ArrayList<Usuario> iniciarSesion(String username, String contra){
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT username, nivel FROM usuario WHERE username=? AND contra=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, contra);
            ResultSet rs;
            rs = pre.executeQuery();
            
            while (rs.next()) {                
                Usuario user = new Usuario();
                user.setUsername(rs.getString(1));
                user.setNivel(rs.getString(2));
                lista.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error al extraer sesion "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return lista;
    }
}
