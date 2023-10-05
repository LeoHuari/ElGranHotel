/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.Entidades;

/**
 *
 * @author Administrator
 */
public class Habitacion {
    private int idHabitacion;
    private int piso;
    private TipoHabitacion tipoHabitacionCodigo;
<<<<<<< HEAD
    private int disponibilidad;
    private boolean estado;

    public Habitacion(int idHabitacion, int piso, TipoHabitacion tipoHabitacionCodigo, int disponibilidad, boolean estado) {
=======
    private boolean disponibilidad;
    private boolean estado;

    public Habitacion(int idHabitacion, int piso, TipoHabitacion tipoHabitacionCodigo, boolean disponibilidad , boolean estado) {
>>>>>>> main
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.tipoHabitacionCodigo = tipoHabitacionCodigo;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

<<<<<<< HEAD
    public Habitacion(int piso, TipoHabitacion tipoHabitacionCodigo, int disponibilidad, boolean estado) {
=======
    public Habitacion(int piso, TipoHabitacion tipoHabitacionCodigo, boolean disponibilidad, boolean estado) {
>>>>>>> main
        this.piso = piso;
        this.tipoHabitacionCodigo = tipoHabitacionCodigo;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

    public Habitacion() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public TipoHabitacion getTipoHabitacionCodigo() {
        return tipoHabitacionCodigo;
    }

    public void setTipoHabitacionCodigo(TipoHabitacion tipoHabitacionCodigo) {
        this.tipoHabitacionCodigo = tipoHabitacionCodigo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
<<<<<<< HEAD
=======
    
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
>>>>>>> main
}
