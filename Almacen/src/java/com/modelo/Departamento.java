
package com.modelo;

/**
 *
 * @author Kevin Uribe
 */
public class Departamento {
    private int idDepto;
    private String nombreDepto;
    private int cantEmpleados;

    public Departamento() {
    }

    public Departamento(int idDepto, String nombreDepto, int cantEmpleados) {
        this.idDepto = idDepto;
        this.nombreDepto = nombreDepto;
        this.cantEmpleados = cantEmpleados;
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
