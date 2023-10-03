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
    private Huesped huesped;
    private Habitacion habitacion;
    private int cantPersonas;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double reserva;
    boolean estado;

    public Reserva(Huesped huesped, Habitacion habitacion, int cantPersonas, LocalDate fechaEntrada, LocalDate fechaSalida, double reserva, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantPersonas = cantPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.reserva = reserva;
        this.estado = estado;
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

    public double getReserva() {
        return reserva;
    }

    public void setReserva(double reserva) {
        this.reserva = reserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "huesped=" + huesped.getNombre() + ", habitacion=" + habitacion + ", cantPersonas=" + cantPersonas + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", reserva=" + reserva + ", estado=" + estado + '}';
    }

   
    
    
    
}
