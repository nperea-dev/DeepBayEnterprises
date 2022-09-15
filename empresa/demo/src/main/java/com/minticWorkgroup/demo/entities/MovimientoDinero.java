package com.minticWorkgroup.demo.entities;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "monto_dinero")
    private Double montoDinero;
    @Column(name = "movimiento_dinero")
    private Double movimientoDinero;
    @Column(name = "concepto_movimiento")
    private String conceptoMovimiento;

    @Column(name = "cc_empleado")
    private Integer ccEmpleado;
    @Column(name = "nit_empresa")
    private String nitEmpresa;
}
