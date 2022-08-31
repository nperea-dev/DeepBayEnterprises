public class Empleado extends Empresa{
    private String nombreEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;
    private String direccionEmpleado;
    private String sexoEmpleado;
    private String fechaNacimiento;

    public Empleado(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa, String nombreEmpleado, String correoEmpleado, String rolEmpleado, String direccionEmpleado, String sexoEmpleado, String fechaNacimiento) {
        super(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa);
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.sexoEmpleado = sexoEmpleado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void generarRolEmpleado () {
          if (this.rolEmpleado == "administrador")
              this.rolEmpleado = this.rolEmpleado;
          else if (this.rolEmpleado == "operativo")
              this.rolEmpleado = this.rolEmpleado;
          else
              System.out.println("Rol no válido");
    }

    public String getNombreEmpleado() {return nombreEmpleado;}

    public void setNombreEmpleado(String nombreEmpleado) {this.nombreEmpleado = nombreEmpleado;}

    public String getCorreoEmpleado() {return correoEmpleado;}

    public void setCorreoEmpleado(String correoEmpleado) {this.correoEmpleado = correoEmpleado;}

    public String getRolEmpleado() {return rolEmpleado;}

    public void setRolEmpleado(String rolEmpleado) {this.rolEmpleado = rolEmpleado;}

    public String getDireccionEmpleado() {return direccionEmpleado;}

    public void setDireccionEmpleado(String direccionEmpleado) {this.direccionEmpleado = direccionEmpleado;}

    public String getSexoEmpleado() {return sexoEmpleado;}

    public void setSexoEmpleado(String sexoEmpleado) {this.sexoEmpleado = sexoEmpleado;}

    public String getFechaNacimiento() {return fechaNacimiento;}

    public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
}
