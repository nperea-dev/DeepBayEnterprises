package Sprint_2;

public class Empleado extends Empresa{

    private String nombreEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;

    public Empleado(String nombreEmpresa, String direccionEmpresa, int nitEmpresa, int telefonoEmpresa, String nombreEmpleado, String correoEmpleado, String rolEmpleado) {
        super(nombreEmpresa, direccionEmpresa, nitEmpresa, telefonoEmpresa);
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }
    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
