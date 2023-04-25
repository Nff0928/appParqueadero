
package Logica;

import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;


public class Vehiculo {
    public String placa;
    public String  identificacion;
    public String tipoVehiculo;
    public String fechaIngreso;
    private String hora;

    
    
    public Vehiculo(String horaEntrada) {   
        this.hora=horaEntrada;
        
    }
    public  LocalTime CalcularPago(){
        LocalTime HoraActual = LocalTime.now();
        return HoraActual;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getidentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.identificacion = Identificacion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
   public String getHora() {
        return hora;
    }
   public void setHora(String hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return tipoVehiculo +" - "+ placa + " - " + identificacion + " - "+hora;
    }
}
