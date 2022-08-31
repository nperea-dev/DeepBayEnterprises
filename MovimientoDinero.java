public class MovimientoDinero extends Empleado{

    private Float montoDinero;
    private Float montoMovimiento;
    private String conceptoMovimiento;

    public MovimientoDinero(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa, String nombreEmpleado, String correoEmpleado, String rolEmpleado, String direccionEmpleado, String sexoEmpleado, String fechaNacimiento, Float montoDinero, Float montoMovimiento, String conceptoMovimiento) {
        super(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa, nombreEmpleado, correoEmpleado, rolEmpleado, direccionEmpleado, sexoEmpleado, fechaNacimiento);
        this.montoDinero = montoDinero;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public void generarMontoMovimiento () {
        this.montoDinero = this.montoDinero + this.montoMovimiento;
    }

    public Float getMontoDinero() {return montoDinero;}

    public void setMontoDinero(Float montoDinero) {this.montoDinero = montoDinero;}

    public Float getMontoMovimiento() {return montoMovimiento;}

    public void setMontoMovimiento(Float montoMovimiento) {this.montoMovimiento = montoMovimiento;}

    public String getConceptoMovimiento() {return conceptoMovimiento;}

    public void setConceptoMovimiento(String conceptoMovimiento) {this.conceptoMovimiento = conceptoMovimiento;}
}
