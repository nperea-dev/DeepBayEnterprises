package com.example.demo.entidades;

public class Empleado {
    private String NombreEmpleado;
    private String CorreoEmpleado;
    private String EmpresaEmpleado;
    private String RolEmpleado;

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        NombreEmpleado = nombreEmpleado;
        CorreoEmpleado = correoEmpleado;
        EmpresaEmpleado = empresaEmpleado;
        RolEmpleado = rolEmpleado;
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
