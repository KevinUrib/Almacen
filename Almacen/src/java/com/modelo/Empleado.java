
package com.modelo;

/**
 *
 * @author Kevin Uribe
 */
public class Empleado {
    private int idEmp;
    private String nombres;
    private String apellidos;
    private String dui;
    private double salario;
    private int idDepto;
    private String nombreDepto;
    private int cantEmpleados;

    public Empleado() {
    }

    public Empleado(int idEmp, String nombres, String apellidos, String dui, double salario, int idDepto, String nombreDepto, int cantEmpleados) {
        this.idEmp = idEmp;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dui = dui;
        this.salario = salario;
        this.idDepto = idDepto;
        this.nombreDepto = nombreDepto;
        this.cantEmpleados = cantEmpleados;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }
    
    
    
}
