package com.DeepBay.demo.Entities;

import javax.persistence.*;


@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name ="nombre_Empleado")
    private String NombreEmpleado;
    @Column(name = "Correo_corp")
    private String CorreoEmpleado;
    @Column(name = "Empresa")
    private String EmpresaEmpleado;
    @Column(name = "Rol_empleado")
    private String RolEmpleado;

    public Empleado(){}
    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.NombreEmpleado = nombreEmpleado;
        this.CorreoEmpleado = correoEmpleado;
        this.EmpresaEmpleado = empresaEmpleado;
        this.RolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        NombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return CorreoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        CorreoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return EmpresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        EmpresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return RolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        RolEmpleado = rolEmpleado;
    }
}
