
package elgranhotel;

import elgranhotel.Data.*;
import elgranhotel.Entidades.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;


public class ElGranHotel {

    
    public static void main(String[] args) {
        //Tener en mente Mantenimiento a habitaciones
        
        HuespedData huespedData = new HuespedData();
        TipoHabitacionData tipoData = new TipoHabitacionData();
        HabitacionData habitacionData = new HabitacionData();
        ReservaData reservaData = new ReservaData();
        //Huesped huesped1 = new Huesped ("Cristian March", 12345678, "correofalso@falsomail.com", "1123456789", "Calle Falsa 123", true);
        //Huesped huesped2 = new Huesped ("Leo Huari", 87654321, "correoverdadero@falsomail.com", "1123456711", "Calle Falsa 123", true);
        //Huesped huesped3 = new Huesped ("Aldana Alvarez", 11111111, "mailfalso@falsomail.com", "1523649874", "Calle Verdadera 333", true);
        //huespedData.guardarHuesped(huesped1);
        //huespedData.guardarHuesped(huesped2);
        //huespedData.guardarHuesped(huesped3);
        //Huesped huespedbuscado = huespedData.BuscarHuespedPorDNI(12345678);
        //System.out.println(huespedbuscado);
        //huespedbuscado.setDni(12345689);
        //System.out.println("Modificado: "+huespedbuscado);
        //huespedData.modificarHuesped(huespedbuscado);
        //Huesped huespedbuscadoid = huespedData.BuscarHuespedPorId(1);
        //System.out.println(huespedbuscadoid);
        //Huesped huesped = new Huesped ("Persona Falsa", 22222222, "correonormal@falsomail.com", "1523446789", "Calle Falsa 123", true);
        //huespedData.guardarHuesped(huesped);
        //System.out.println(huespedData.ListarHuesped());
        //huespedData.banearHuesped(6);
        //Pruebas de TipoHabitacion
        TipoHabitacion tipo1 = new TipoHabitacion("S", 1, 1, "Simple", 20.5);
        TipoHabitacion tipo2 = new TipoHabitacion("DQ", 2, 1, "Queen", 30.5);
        TipoHabitacion tipo3 = new TipoHabitacion("DS", 2, 2, "Simple", 30.5);
        TipoHabitacion tipo4 = new TipoHabitacion("TS", 3, 3, "Simple", 40.5);
        TipoHabitacion tipo5 = new TipoHabitacion("TSQ", 3, 2, "Simple y Queen", 40.5);//125
        TipoHabitacion tipo6 = new TipoHabitacion("C2SQ", 4, 3, "Simple y Queen", 50.5);//150
        TipoHabitacion tipo7 = new TipoHabitacion("CS", 4, 4, "Simple", 50.5);//175
        TipoHabitacion tipo8 = new TipoHabitacion("SL", 2, 1, "KING SIZE", 200.5);//10
//        tipoData.agregarTipoHabitacion(tipo1);
//        tipoData.agregarTipoHabitacion(tipo2);
//        tipoData.agregarTipoHabitacion(tipo3);
//        tipoData.agregarTipoHabitacion(tipo4);
//        tipoData.agregarTipoHabitacion(tipo5);
//        tipoData.agregarTipoHabitacion(tipo6);
//        tipoData.agregarTipoHabitacion(tipo7);
//        tipoData.agregarTipoHabitacion(tipo8);
//        Habitacion habitacion;
        
//        for(int i = 1; i<=25; i++){
//            habitacion = new Habitacion(i, 1, tipo1, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }

//        for(int i = 26; i<=50; i++){
//            habitacion = new Habitacion(i, 1, tipo2, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 51; i<=75; i++){
//            habitacion = new Habitacion(i, 2, tipo3, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }

//        for(int i = 76; i<=100; i++){
//            habitacion = new Habitacion(i, 2, tipo4, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 101; i<=125; i++){
//            habitacion = new Habitacion(i, 3, tipo5, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 126; i<=150; i++){
//            habitacion = new Habitacion(i, 3, tipo6, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 151; i<=175; i++){
//            habitacion = new Habitacion(i, 4, tipo7, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 176; i<=185; i++){
//            habitacion = new Habitacion(i, 4, tipo1, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 186; i<=190; i++){
//            habitacion = new Habitacion(i, 4, tipo2, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }
//        for(int i = 191; i<=200; i++){
//            habitacion = new Habitacion(i, 5, tipo8, false, true);
//            habitacionData.agregarHabitacion(habitacion);
//        }

//        Huesped huesped = huespedData.BuscarHuespedPorId(1);
//        Habitacion habitacion = habitacionData.buscarHabitacion(1);
//        LocalDate fechaEntrada = LocalDate.parse("2023-10-01");
//        LocalDate fechaSalida = LocalDate.parse("2023-11-01");
//        long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
//        double importe = habitacion.getTipoHabitacionCodigo().getPrecio() * dias;
//        System.out.println(importe);
//        Reserva reserva = new Reserva(huesped, habitacion, 1, fechaEntrada, fechaSalida, importe, true);
//        reservaData.crearReserva(reserva);

        Huesped huesped = huespedData.BuscarHuespedPorId(1);
        Habitacion habitacion = habitacionData.buscarHabitacion(1);
//        LocalDate fechaEntrada = LocalDate.parse("2023-12-01");
//        LocalDate fechaSalida = LocalDate.parse("2024-01-01");
//        long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
//        double importe = habitacion.getTipoHabitacionCodigo().getPrecio() * dias;
//        Reserva reserva = new Reserva(huesped, habitacion, 1, fechaEntrada, fechaSalida, importe, true);
//        reservaData.crearReserva(reserva);
        
//        Huesped huesped = huespedData.BuscarHuespedPorId(3);
//        Habitacion habitacion = habitacionData.buscarHabitacion(5);
//        LocalDate fechaEntrada = LocalDate.parse("2023-11-01");
//        LocalDate fechaSalida = LocalDate.parse("2023-12-01");
//        long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
//        double importe = habitacion.getTipoHabitacionCodigo().getPrecio() * dias;
//        Reserva reserva = new Reserva(huesped, habitacion, 1, fechaEntrada, fechaSalida, importe, true);
//        reservaData.crearReserva(reserva);
        
//        System.out.println(reservaData.buscarReservaPorHuesped(1));
//        System.out.println(reservaData.buscarReservasPorFecha(LocalDate.of(2023, Month.NOVEMBER, 1), LocalDate.parse("2023-11-01")));
        
//        reservaData.cancelarReserva(2);
//        Reserva reserva = new Reserva(1, huesped, habitacion, 1, LocalDate.parse("2023-10-01"), LocalDate.parse("2023-11-01"), 635.5, true);
//        reservaData.finReserva(reserva);

//        System.out.println(reservaData.buscarReservasCanceladas());
//        try{
//            System.out.println(reservaData.buscarReservaPorIdD(1));
//        }catch(NullPointerException ex){
//            JOptionPane.showMessageDialog(null, "No existe la reserva");
//        }
        
    }
    
}
