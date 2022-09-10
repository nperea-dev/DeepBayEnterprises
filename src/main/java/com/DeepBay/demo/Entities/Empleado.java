package com.DeepBay.demo.Entities;

import javax.persistence.*;


@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado")
    private long idEmpleado;
    @Column(name ="nombre_Empleado"  )
    private String NombreEmpleado;
    @Column(name = "Correo_corp")
    private String CorreoEmpleado;
    @Column(name = "Empresa")
    private String EmpresaEmpleado;

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Column(name = "Rol_empleado")
    private String RolEmpleado;
    @Column(name = "id_empresa")
    private long idEmpresa;

    @ManyToOne
    @JoinColumn(name="id_empresa", insertable = false, updatable = false)
    private Empresa empresaDb;
    public Empleado(){}
    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.NombreEmpleado = nombreEmpleado;
        this.CorreoEmpleado = correoEmpleado;
        this.EmpresaEmpleado = empresaEmpleado;
        this.RolEmpleado = rolEmpleado;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
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
