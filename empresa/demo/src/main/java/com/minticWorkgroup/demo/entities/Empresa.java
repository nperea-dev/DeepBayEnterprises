package com.minticWorkgroup.demo.entities;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor                                          //crea contructor vacio lom
@AllArgsConstructor                                         //crea metodo constructos con todos sus argumentos
@Setter                                                     //genera set automaticamente
@Getter                                                     //genera get automaticamente lombok

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @Column(name = "nit")
    private String nitEmpresa;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "direccion_empresa")
    private String direccionEmpresa;
    @Column(name = "telefono_empresa")
    private String telefonoEmpresa;
}
