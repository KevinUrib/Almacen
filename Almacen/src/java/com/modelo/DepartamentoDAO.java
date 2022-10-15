
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
public class DepartamentoDAO extends Conexion{
    // TRANSACT
    public int insertarDepto(Departamento dep){
        int res = 0;
        try {
            this.conectar();
            String sql = "INSERT INTO departamentos(nombreDepto,cantEmpleados) VALUES(?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, dep.getNombreDepto());
            pre.setInt(2, dep.getCantEmpleados());
            res = pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar departamento "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return res;
    }
    
    public ArrayList<Departamento> mostrarDepto(){
        ArrayList<Departamento> list = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM departamentos";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            ResultSet rs;
            rs = pre.executeQuery();
            while (rs.next()) {                
                Departamento dep = new Departamento();
                dep.setNombreDepto(rs.getString(1));
                dep.setCantEmpleados(rs.getInt(2));
                list.add(dep);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return list;
    }
    
    public int modificarDepto(Departamento dep){
        int res = 0;
        try {
            this.conectar();
            String sql = "UPDATE departamentos SET nombreDepto=?,cantEmpleados=? WHERE id_depto=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, dep.getNombreDepto());
            pre.setInt(2, dep.getCantEmpleados());
            pre.setInt(3, dep.getIdDepto());
            res = pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al modificar "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return res;
    }
    
    public int eliminarDepto(Departamento dep){
        int res = 0;
        try {
            this.conectar();
            String sql = "DELETE FROM departamentos WHERE id_depto=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, dep.getIdDepto());
            res = pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return res;
    }
}
