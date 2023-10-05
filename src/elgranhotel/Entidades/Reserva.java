/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elgranhotel.Entidades;

import java.time.LocalDate;

/**
 *
 * @author kicho
 */
public class Reserva {
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private int cantPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double importe;
    boolean estado;

    public Reserva(int idReserva, Huesped huesped, Habitacion habitacion, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida, double reserva, boolean estado) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = reserva;
        this.estado = estado;
    }

    public Reserva(Huesped huesped, Habitacion habitacion, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida, double importe, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "huesped=" + huesped.getNombre() + ", habitacion=" + habitacion + ", cantPersonas=" + cantPersonas + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", importe=" + importe + ", estado=" + estado + '}';
    }

   
    
    
    
}
