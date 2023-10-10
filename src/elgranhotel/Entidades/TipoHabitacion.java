
package elgranhotel.Entidades;


public class TipoHabitacion {
    private String codigo;
    private int cantidadPersonas;
    private int cantidadCamas;
    private String tipoCama;
    private double precio;

    public TipoHabitacion(String codigo, int cantidadPersonas, int cantidadCamas, String tipoCama, double precio) {
        this.codigo = codigo;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion(int cantidadPersonas, int cantidadCamas, String tipoCama, double precio) {
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "codigo=" + codigo + ", cantidadPersonas=" + cantidadPersonas + ", cantidadCamas=" + cantidadCamas + ", tipoCama=" + tipoCama + ", precio=" + precio + '}';
    }
    
}
