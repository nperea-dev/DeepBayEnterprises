package com.minticWorkgroup.demo.entities;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name = "id_cc")
    private Integer ccEmpleado;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Column(name = "correo_empleado")
    private String correoEmpleado;
    @Column(name = "rol_empleado")
    private String rolEmpleado;

    @Column(name = "nit_empresa")
    private String nitEmpresa;
}
