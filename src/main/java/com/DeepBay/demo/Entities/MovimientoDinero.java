package com.DeepBay.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name="movimiento_dinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name ="monto_mov")
    private double MontoMovimiento;
    @Column(name ="monto_positivo_negativo")
    private double MontosPositivosyNegativos;
    @Column(name ="concepto_mov")
    private double ConceptoMovimiento;
    @Column(name ="responsable_movimiento")
    private double UsuarioQueRegistraMovimiento;

    public MovimientoDinero() {}

    public MovimientoDinero(double montoMovimiento, double montosPositivosyNegativos, double conceptoMovimiento, double usuarioQueRegistraMovimiento) {
        this.MontoMovimiento = montoMovimiento;
        this.MontosPositivosyNegativos = montosPositivosyNegativos;
        this.ConceptoMovimiento = conceptoMovimiento;
        this.UsuarioQueRegistraMovimiento = usuarioQueRegistraMovimiento;
    }

    public double getMontoMovimiento() {
        return MontoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        MontoMovimiento = montoMovimiento;
    }

    public double getMontosPositivosyNegativos() {
        return MontosPositivosyNegativos;
    }

    public void setMontosPositivosyNegativos(double montosPositivosyNegativos) {
        MontosPositivosyNegativos = montosPositivosyNegativos;
    }

    public double getConceptoMovimiento() {
        return ConceptoMovimiento;
    }

    public void setConceptoMovimiento(double conceptoMovimiento) {
        ConceptoMovimiento = conceptoMovimiento;
    }

    public double getUsuarioQueRegistraMovimiento() {
        return UsuarioQueRegistraMovimiento;
    }

    public void setUsuarioQueRegistraMovimiento(double usuarioQueRegistraMovimiento) {
        UsuarioQueRegistraMovimiento = usuarioQueRegistraMovimiento;
    }
}



