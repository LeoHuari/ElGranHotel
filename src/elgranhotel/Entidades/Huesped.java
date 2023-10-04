
package elgranhotel.Entidades;


public class Huesped {
    private int idHuesped;
    private String nombre;
    private int dni;
    private String correo;
    private int celular;
    private String domicilio;
    private boolean estado;

    public Huesped(int idHuesped, String nombre, int dni, String correo, int celular, String domicilio, boolean estado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public Huesped(String nombre, int dni, String correo, int celular, String domicilio, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public Huesped() {
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
