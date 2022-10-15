
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
public class EmpleadoDAO extends Conexion{
    // TRANSACTS
    
    public int insertarEmpleado(Empleado emp){
        int res = 0;
        try {
            this.conectar();
            String sql = "INSERT INTO empleados(nombres,apellidos,dui,salario,idDepto) VALUES(?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, emp.getNombres());
            pre.setString(2, emp.getApellidos());
            pre.setString(3, emp.getDui());
            pre.setDouble(4, emp.getSalario());
            pre.setInt(5, emp.getIdDepto());
            res = pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar empleado "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return res;
    }
    
    public int modificarEmpleado(Empleado emp){
        int res = 0;
        try {
            this.conectar();
            String sql = "UPDATE empleados SET nombres=?,apellidos=?,dui=?,salario=?,idDepto=? WHERE idEmp=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, emp.getNombres());
            pre.setString(2, emp.getApellidos());
            pre.setString(3, emp.getDui());
            pre.setDouble(4, emp.getSalario());
            pre.setInt(5, emp.getIdDepto());
            pre.setInt(6, emp.getIdEmp());
            res = pre.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al modificar empleado "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return res;
    }
    
    public int eliminarEmpleado(Empleado emp){
        int res = 0;
        try {
            this.conectar();
            String sql = "DELETE FROM empleados WHERE idEmp=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, emp.getIdEmp());
            res = pre.executeUpdate();
        } catch (SQLException e) {
        } finally {
            this.desconectar();
        }
        return res;
    }
    
    public ArrayList<Empleado> mostrarEmpleado(){
        ArrayList<Empleado> listaEmp = new ArrayList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM empleados em INNER JOIN departamentos dep ON em.idEmp=dep.id_depto";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            ResultSet rs;
            rs = pre.executeQuery();
            while (rs.next()) {                
                Empleado emp = new Empleado();
                emp.setIdEmp(rs.getInt(1));
                emp.setNombres(rs.getString(2));
                emp.setApellidos(rs.getString(3));
                emp.setDui(rs.getString(4));
                emp.setSalario(rs.getDouble(5));
                emp.setIdDepto(rs.getInt(6));
                emp.setNombreDepto(rs.getString(8));
                emp.setCantEmpleados(rs.getInt(9));
                listaEmp.add(emp);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar "+e.getMessage());
        } finally {
            this.desconectar();
        }
        return listaEmp;
    }
}
