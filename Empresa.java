public class Empresa {

    protected String nombreEmpresa;
    protected String direccionEmpresa;
    protected String telefonoEmpresa;
    protected String nitEmpresa;

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }
    public String getNombreEmpresa() {return nombreEmpresa;}

    public void setNombreEmpresa(String nombreEmpresa) {this.nombreEmpresa = nombreEmpresa;}

    public String getDireccionEmpresa() {return direccionEmpresa;}

    public void setDireccionEmpresa(String direccionEmpresa) {this.direccionEmpresa = direccionEmpresa;}

    public String getTelefonoEmpresa() {return telefonoEmpresa;}

    public void setTelefonoEmpresa(String telefonoEmpresa) {this.telefonoEmpresa = telefonoEmpresa;}

    public String getNitEmpresa() {return nitEmpresa;}

    public void setNitEmpresa(String nitEmpresa) {this.nitEmpresa = nitEmpresa;}
}
