package com.example.demo.entidades;

public class MovimientoDinero {
    private double MontoMovimiento;
    private double MontosPositivosyNegativos;
    private double ConceptoMovimiento;
    private double UsuarioQueRegistraMovimiento;

    public MovimientoDinero(double montoMovimiento, double montosPositivosyNegativos, double conceptoMovimiento, double usuarioQueRegistraMovimiento) {
        MontoMovimiento = montoMovimiento;
        MontosPositivosyNegativos = montosPositivosyNegativos;
        ConceptoMovimiento = conceptoMovimiento;
        UsuarioQueRegistraMovimiento = usuarioQueRegistraMovimiento;
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
