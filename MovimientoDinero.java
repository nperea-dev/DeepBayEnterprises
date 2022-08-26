package Sprint_2;

public class MovimientoDinero extends Empleado{

    private String conceptoDinero;
    private int montoEnMovimiento;
    private int nuevoMonto;

    public MovimientoDinero(String nombreEmpresa, String direccionEmpresa, int nitEmpresa, int telefonoEmpresa,
                            String nombreEmpleado, String correoEmpleado, String rolEmpleado) {
        super(nombreEmpresa, direccionEmpresa, nitEmpresa, telefonoEmpresa, nombreEmpleado, correoEmpleado, rolEmpleado);
        this.conceptoDinero = conceptoDinero;
        this.montoEnMovimiento = montoEnMovimiento;
        this.nuevoMonto = nuevoMonto;
    }

    public String getConceptoDinero() {
        return conceptoDinero;
    }
    public void setConceptoDinero(String conceptoDinero) {
        this.conceptoDinero = conceptoDinero;
    }

    public int getMontoEnMovimiento() {
        return montoEnMovimiento;
    }
    public void setMontoEnMovimiento(int montoEnMovimiento) {
        this.montoEnMovimiento = montoEnMovimiento;
    }
    public int getNuevoMonto() {
        return nuevoMonto;
    }

    public void setNuevoMonto(int nuevoMonto) {
        this.nuevoMonto = nuevoMonto;
    }
}
